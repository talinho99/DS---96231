import './style.css';

export default function Produtos(){
    return(
        <div className="page-produtos">
            <h1>Nossos Produtos</h1>
            <p>Ferramentas tecnológicas e pacotes exclusivos desenvolvidos para otimizar o dia a dia financeiro da sua operação.</p>

            <div className="produtos-list">
                <div className="produto-item">
                    <div className="produto-info">
                        <h2>Sistema Exata ERP Cloud</h2>
                        <p>Software integrado nativo na nuvem para emissão rápida de notas fiscais, controle financeiro (contas a pagar e receber) e conciliação bancária automática.</p>
                    </div>
                    <button className="btn-produto">Ver Detalhes</button>
                </div>

                <div className="produto-item">
                    <div className="produto-info">
                        <h2>Diagnóstico Financeiro Express</h2>
                        <p>Pacote de consultoria ágil com auditoria de 30 dias. Entrega de um dashboard detalhado sobre a saúde atual da empresa e plano de ação imediato.</p>
                    </div>
                    <button className="btn-produto">Ver Detalhes</button>
                </div>
            </div>
        </div>
    );
}