package com.example.api.controller;

import com.example.api.models.FuncionarioModel;
import com.example.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//faz com que todos os métodos implementados respondam a apenas um, ex: "/usuarios".

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repository;

    //Consultar todos os usuários
    @GetMapping
    public List<FuncionarioModel> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> salvar (@RequestBody FuncionarioModel funcionario){
        //Salva os dados do novo funcionario no banco de dados.
        repository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }
}


