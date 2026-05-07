package com.example.api_jogo.controller;

import com.example.api_jogo.dto.JogadorRequestDTO;
import com.example.api_jogo.dto.JogadorResponseDTO;
import com.example.api_jogo.model.JogadorModel;
import com.example.api_jogo.service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorService service;

    @GetMapping
    public ResponseEntity<List<JogadorResponseDTO>> listar(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>> salvar(@Valid @RequestBody JogadorRequestDTO dto){
        service.salvarJogador(dto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Jogador cadastrado com sucesso."));
    }





}
