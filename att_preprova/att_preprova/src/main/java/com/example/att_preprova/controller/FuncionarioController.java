package com.example.att_preprova.controller;

import com.example.att_preprova.model.FuncionarioModel;
import com.example.att_preprova.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired

    private FuncionarioService service;
    @GetMapping
    public List<FuncionarioModel> listarFuncionarios(){
        return service.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody FuncionarioModel funcionario){
        service.salvar(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Funcionário salvo com sucesso."));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizar(
            @PathVariable Long id,
            @RequestBody FuncionarioModel funcionario){
        service.atualizarFuncionario(id,funcionario);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "Funcionário atualizado com sucesso."));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(
            @PathVariable Long id){
        service.excluir(id);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Funcionário excluido com sucesso."));
    }
}
