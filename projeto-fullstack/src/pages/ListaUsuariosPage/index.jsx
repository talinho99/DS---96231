import { useEffect, useState } from 'react'
import './style.css'
import api from '../../services/api'
import { toast } from 'react-toastify'

export default function ListaUsuariosPage(){
    const [usuarios, setUsuarios] = useState([])

    useEffect(() => {
        async function buscarUsuarios(){
            try{
                //Se der certo
                const response = await api.get('/usuarios')
                setUsuarios(response.data)
            } catch (erro) {
                //Se der errado
                toast.error('Erro ao buscar Usuários') // Correção: de toast.erro para toast.error
            }
        } 
        buscarUsuarios()
    },[])

    return(
        <div className='lista-usuarios'>
            <h1>Lista de Usuários</h1> {/* Correção do título que estava "Listra" */}

            {
                usuarios.length === 0 ? (
                    <p>Nenhum usuário encontrado.</p>
                ) : (
                    <table className='tabela-usuarios'>
                        <thead>
                            <tr>
                                {/* Correção: as colunas do cabeçalho usam a tag <th> em vez de <tr> */}
                                <th>Nome</th>
                                <th>E-mail</th>
                            </tr>
                        </thead>
                        <tbody>
                            {usuarios.map(usuario =>(
                                <tr key={usuario.email}>
                                    <td>{usuario.nome}</td>
                                    <td>{usuario.email}</td>
                                </tr>
                            ))}
                        </tbody>
                    </table>
                ) 
            }
        </div>
    )
}