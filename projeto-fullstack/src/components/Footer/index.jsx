import './style.css'

export default function Footer(){
    return(
        <footer className='footer'>
            <p>
                &copy; {new Date().getFullYear()} - {/* Correção: Parênteses adicionados aqui! */}
                Todos os direitos reservados.
                <br />
                Senai - Bahia
            </p>
        </footer>
    )
}