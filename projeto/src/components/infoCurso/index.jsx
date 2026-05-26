import { useState } from 'react'
import './style.css'

export default function InfoCurso() {
    const [nome, setNome] = useState('Lógica de Programação')
    const [cargaHoraria, setCargaHoraria] = useState(162)
    const [dataInicio, setDataInicio] = useState('25/07/2025')
    const [dataFim, setDataFim] = useState('25/10/2025')
    const[materias, setMaterias] = useState(['Desenvolvimento de Sistemas ', 'IOT ' , 'Estruturas de Dados'])
    const [professor, setProfessor] = useState('João Silva ')
    


    return(
        <div className='info-curso'>
            <h2>Dados do Curso:</h2>
            <p>Nome: {nome}</p>
            <p>Carga Horária: {cargaHoraria}</p>
            <p>dataInicio: {dataInicio}</p>
            <p>dataFim: {dataFim}</p>
            <p>Materias: {materias}</p>
            <p>Professor: {professor}</p>



        </div>

    )
}