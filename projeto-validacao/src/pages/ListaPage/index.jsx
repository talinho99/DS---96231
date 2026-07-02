import { useEffect, useState } from 'react'
import api from '../../services/api'
import './style.css'
import { toast } from 'react-toastify'

export default function ListaPage() {
    const [usuarios, setUsuarios] = useState([])
    const [loading, setLoading] = useState(true)

    useEffect(() => {
        const fetchUsuarios = async () => {
            try {
                const response = await api.get('/usuarios')
                setUsuarios(response.data)
            } catch (error) {
                console.error('Erro ao buscar usuários:', error)
                toast.error('Erro ao buscar usuários. Tente novamente mais tarde.')
            } finally {
                setLoading(false)
            }
        }

        fetchUsuarios()
    }, [])
    if (loading) {
        return <p>Carregando usuários...</p>
    }
    
    return (
        <div className='lista-container'>
            <h1>Lista de Usuários</h1>
            <ul>
                {usuarios.map((usuario) => (
                    <li key={usuario.id}>
                        <strong>{usuario.nome}</strong> - {usuario.email}
                    </li>
                ))}
            </ul>
        </div>
    )
}