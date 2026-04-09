package com.example.api_novo.service;

import com.example.api_novo.model.FuncionarioModel;
import com.example.api_novo.repository.FuncionarioRepository;
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

    public FuncionarioModel salvarFuncionario(FuncionarioModel funcionario){
        if(repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new IllegalArgumentException("Cliente já Cadastrado.");
        }
        return repository.save(funcionario);
    }
}
