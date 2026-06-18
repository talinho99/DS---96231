import { useState } from 'react'
import { Routes, Route } from 'react-router-dom' // Correção: Route adicionado aqui!
import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import ListaUsuariosPage from './pages/ListaUsuariosPage'
import CadastroPage from './pages/CadastroPage'
import HomePage from './pages/HomePage'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Header />
    <main>
      <Routes>
        <Route path='/' element={<HomePage  />} />
        <Route path='/cadastro' element={<CadastroPage />} />
        <Route path='/lista-usuarios' element={<ListaUsuariosPage />} />
      </Routes>
    </main>
    <Footer />
    </>
  )
}

export default App