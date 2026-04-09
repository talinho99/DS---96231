package com.example.api_novo.service;

import com.example.api_novo.model.ClienteModel;
import com.example.api_novo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteModel> listarTodos(){
        return repository.findAll();
    }

    public ClienteModel salvarCliente(ClienteModel cliente){
        if (repository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Cliente já Cadastrado.");
        }
        return repository.save(cliente);
    }
}
