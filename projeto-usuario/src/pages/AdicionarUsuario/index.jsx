import { useState } from 'react'
import './style.css'

export default function AdicionarUsuario() {
    const[ nome, setNome] =useState('')
    const[email, setEmail] = useState('')
    const[listaUsuarios, setListaUsuarios] = useState('')

    const adicionarNovousuario = (event) => {
        event.preventDefault()
        if(nome && email){
            setListaUsuarios([...listaUsuarios,{nome, email}])
            setNome('')
            setEmail('')

        }
    }
    return(
        <h1>Adicionar Usuário</h1>
    )
}