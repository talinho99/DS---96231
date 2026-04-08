package com.example.atividade_fixacao.controller;

import com.example.atividade_fixacao.models.ProfessorModel;
import com.example.atividade_fixacao.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    //Comando que faz com que não precise implementar construtor
    @Autowired
    private ProfessorRepository professor;



    //Consultar todos os usuários
    @GetMapping
    public List<ProfessorModel> listarTodos(){
        return professor.findAll();
    }

    @PostMapping
    public ResponseEntity<ProfessorModel> salvar (@RequestBody ProfessorModel model){
        //Salva os dados do novo funcionario no banco de dados.
        professor.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);

    }




}
