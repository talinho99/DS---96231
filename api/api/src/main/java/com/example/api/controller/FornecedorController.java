package com.example.api.controller;

import com.example.api.models.FornecedorModel;
import com.example.api.models.FuncionarioModel;
import com.example.api.repository.FornedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//faz com que todos os métodos implementados respondam a apenas um, ex: "/usuarios".
@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    //Comando que faz com que não precise implementar construtor
    @Autowired
    private FornedorRepository repository;

    //Consultar todos os usuários
    @GetMapping
    public List<FornecedorModel> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<FornecedorModel> salvar (@RequestBody FornecedorModel fornecedor){
        //Salva os dados do novo funcionario no banco de dados.
        repository.save(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
    }



}
