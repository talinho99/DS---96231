import { Link, NavLink } from 'react-router-dom';
import './style.css';

export default function Header(){
    return(
        <header>
            <div>
                <Link to="/" className="header-logo">
                    <h1>Exata Contabilidade</h1>
                </Link>
            </div>

            <nav>
                <NavLink to="/">Home</NavLink>
                <NavLink to="/sobre-nos">Sobre Nós</NavLink>
                <NavLink to="/servicos">Serviços</NavLink>
                <NavLink to="/produtos">Produtos</NavLink>
            </nav>
        </header>
    );
}