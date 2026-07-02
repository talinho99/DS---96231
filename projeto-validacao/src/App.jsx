import {  Routes } from 'react-router-dom'
import './App.css'
import Header from './components/Header'
import { ToastContainer } from 'react-toastify'
import 'react-toastify/dist/ReactToastify.css'
import Footer from './components/Footer'
import HomePage from './pages/HomePage'
import CadastroPage from './pages/CadastroPage'
import ListaPage from './pages/ListaPage'

function App() {

  return (
    <>
    <Header />
    <main>
      <Routes path="/" element={<HomePage />} />
      <Routes path="/cadastro" element={<CadastroPage />} />
      <Routes path="/lista" element={<ListaPage />} />
    </main>
    <ToastContainer position='bottom-right' autoClose={3000} />
    <Footer />
    </>
  )
}

export default App
