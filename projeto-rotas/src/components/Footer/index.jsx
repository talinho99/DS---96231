import './style.css';

export default function Footer(){
    return(
        <footer>
            <strong>Exata Contabilidade</strong>
            <p>Copyright &copy; {new Date().getFullYear()} - Todos os direitos reservados</p>
        </footer>
    );
}