package com.example.revisao.service;

import com.example.revisao.model.FuncionarioModel;
import com.example.revisao.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModel> listarTodos(){
        return repository.findAll();
    }

    public FuncionarioModel salvar(FuncionarioModel funcionario){
        //Verifica se a pessoa está cadastrada ou não no banco
        //se já estiver, vai dar esse aviso.
        if (repository.findByCpf(funcionario.getCpf()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado.");
        }
        return repository.save(funcionario);
    }

    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado");
        }
        //Mantém o id para não criar outro funcionário.
        //Apenas altera todos os outros dados.
        funcionario.setId(id);
        return repository.save(funcionario);
    }

    public void excluir(Long id){
        if (!repository.existsById(id)){
            throw new IllegalArgumentException("Funcionário não encontrado");
        }

        repository.deleteById(id);
    }
}
