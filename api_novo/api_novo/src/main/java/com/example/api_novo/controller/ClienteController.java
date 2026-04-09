package com.example.api_novo.controller;

import com.example.api_novo.model.ClienteModel;
import com.example.api_novo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteModel> listar(){
        return service.listarTodos();
    }

    @PostMapping
    //Função que faz com que a mensagem saia limpa sem muitas informações
    //para o front-end
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ClienteModel cliente){
        service.salvarCliente(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Cliente Cadastrado com sucesso."));
    }
}
