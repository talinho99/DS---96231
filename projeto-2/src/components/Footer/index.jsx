import './style.css'

//FICARÁ NO FINAL DAS PÁGINAS

export default function Footer() {
    return(
        <footer className='footer'>
            <p>
                &copy; {new Date().getFullYear()} Meu Site. Todos os direitos reservados.
                <br />
                SENAI - BAHIA
            </p>
        </footer>
    )
}