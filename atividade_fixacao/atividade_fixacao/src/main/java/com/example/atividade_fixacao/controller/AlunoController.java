package com.example.atividade_fixacao.controller;

import com.example.atividade_fixacao.models.AlunoModel;
import com.example.atividade_fixacao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    //Comando que faz com que não precise implementar construtor
    @Autowired
    private AlunoRepository aluno;


    //Consultar todos os usuários
    @GetMapping
    public List<AlunoModel> listarTodos(){
        return aluno.findAll();
    }

    @PostMapping
    public ResponseEntity<AlunoModel> salvar (@RequestBody AlunoModel model){
        //Salva os dados do novo funcionario no banco de dados.
        aluno.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);

    }

}
