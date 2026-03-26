package com.example.spring_basico.controller;

import com.example.spring_basico.models.UsuarioModel;
import com.example.spring_basico.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//faz com que todos os métodos implementados respondam a apenas um, ex: "/usuarios".
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Consultar todos os usuários
    @GetMapping
    public List<UsuarioModel> listarTodos() {
        return usuarioRepository.findAll();
    }


    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody UsuarioModel usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);


    }
}