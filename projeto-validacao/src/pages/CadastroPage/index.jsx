import './style.css'
import * as yup from 'yup'
import { useForm } from 'react-hook-form'
import { yupResolver } from '@hookform/resolvers/yup'
import api from '../../services/api'
import { toast } from 'react-toastify'

// Validação de formulário
const esquemaDeCadastro = yup.object({
  nome: yup
    .string()
    .required('O nome é obrigatório'),

  email: yup
    .string()
    .email('Digite um e-mail válido')
    .required('O e-mail é obrigatório'),

  senha: yup
    .string()
    .min(6, 'A senha deve ter no mínimo 6 caracteres')
    .required('A senha é obrigatória'),

  confirmarSenha: yup
    .string()
    .oneOf([yup.ref('senha')], 'As senhas devem ser iguais')
    .required('A confirmação de senha é obrigatória'),
})

export default function CadastroPage() {

  const {
    register: registrarCampo,
    handleSubmit: lidarComEnvioDoFormulario,
    formState: {
      errors: errosDeValidacao,
      isSubmitting: estaEnviandoFormulario
    },
    setError: definirErro,
    reset: resetarFormulario
  } = useForm({
    resolver: yupResolver(esquemaDeCadastro),
    defaultValues: {
      nome: '',
      email: '',
      senha: '',
      confirmarSenha: ''
    }
  })

  async function enviarFormulario(dadosDoFormulario) {

    const dadosParaApi = {
      nome: dadosDoFormulario.nome,
      email: dadosDoFormulario.email,
      senha: dadosDoFormulario.senha
    }

    try {

      await api.post('/usuarios', dadosParaApi)

      toast.success('Usuário cadastrado com sucesso!')

      resetarFormulario()

    } catch (erro) {

      const codigoDeEstatus = erro.response?.status

      const mensagemDeErro =
        erro.response?.data?.mensagem ||
        'Ocorreu um erro ao cadastrar o usuário.'

      if (codigoDeEstatus === 400) {

        definirErro('email', {
          type: 'manual',
          message: mensagemDeErro
        })

      }

      toast.error(mensagemDeErro)

      console.error('Erro ao cadastrar usuário:', erro)
    }
  }

  return (
    <div className='cadastro-container'>

      <h1>Cadastro de Usuário</h1>

      <form onSubmit={lidarComEnvioDoFormulario(enviarFormulario)}>

        {/* Campo de Nome */}
        <div className='form-group'>

          <label htmlFor='nome'>Nome:</label>

          <input
            id='nome'
            type='text'
            placeholder='Ex: Maria Silva'
            {...registrarCampo('nome')}
          />

          {errosDeValidacao.nome && (
            <p className='error-message'>
              {errosDeValidacao.nome.message}
            </p>
          )}
        </div>

        <button type='submit' disabled={estaEnviandoFormulario}>
            {estaEnviandoFormulario ? 'Cadastrando...' : 'Cadastrar'}
        </button>

      </form>

    </div>
  )
}