import './style.css';

export default function Servicos(){
    return(
        <div className="page-servicos">
            <h1>Nossos Serviços</h1>
            <p>Soluções contábeis completas e personalizadas para garantir a conformidade legal e o crescimento organizado do seu negócio.</p>

            <div className="servicos-grid">
                <div className="servico-card">
                    <h2>Assessoria Contábil</h2>
                    <p>Gestão completa da sua contabilidade, elaboração de balanços e relatórios precisos para uma melhor tomada de decisões.</p>
                </div>

                <div className="servico-card">
                    <h2>Planejamento Tributário</h2>
                    <p>Análise aprofundada da sua operação para reduzir legalmente a carga tributária, maximizando os lucros da empresa.</p>
                </div>

                <div className="servico-card">
                    <h2>Departamento Pessoal</h2>
                    <p>Administração eficiente de folhas de pagamento, admissões, rescisões e cumprimento rigoroso das obrigações trabalhistas.</p>
                </div>
            </div>
        </div>
    );
}