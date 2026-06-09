import './style.css';

export default function SobreNos(){
    return(
        <div className="page-sobre-nos">
            <h1>Sobre Nossa Trajetória</h1>
            <p>Com mais de uma década de atuação, a Exata Contabilidade tem o compromisso de transformar a burocracia brasileira em uma vantagem competitiva para os nossos clientes.</p>

            <ul>
                <li>
                    <strong>Nossa Missão:</strong> Fornecer informações contábeis precisas e consultoria estratégica que impulsionem o sucesso financeiro e a sustentabilidade das empresas.
                </li>
                <li>
                    <strong>Nossa Visão:</strong> Ser reconhecida nacionalmente como a contabilidade mais inovadora e parceira dos empreendedores de médio e grande porte.
                </li>
                <li>
                    <strong>Nossos Valores:</strong> Ética inegociável, transparência nas ações, inovação contínua e foco absoluto no resultado do cliente.
                </li>
            </ul>
        </div>
    );
}