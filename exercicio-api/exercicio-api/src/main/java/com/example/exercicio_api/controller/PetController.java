package com.example.exercicio_api.controller;

import com.example.exercicio_api.models.PetModel;
import com.example.exercicio_api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private PetRepository pet;


    @GetMapping
    public List<PetModel> listarTodos(){
        return pet.findAll();
    }

    @PostMapping
     public ResponseEntity<PetModel> salvar (@RequestBody PetModel model){
        pet.save(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);


    }
}
