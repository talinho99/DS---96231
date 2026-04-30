package com.example.api_criptografada.service;

import com.example.api_criptografada.dto.FuncionarioRequestDTO;
import com.example.api_criptografada.dto.FuncionarioResponseDTO;
import com.example.api_criptografada.model.FuncionarioModel;
import com.example.api_criptografada.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<FuncionarioResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(f -> new FuncionarioResponseDTO(f.getNome(),
                        f.getEmail(),
                        f.getTelefone()))
                .toList();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioRequestDTO dto){
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado.");
        }

        FuncionarioModel novoFuncionario = new FuncionarioModel();
        novoFuncionario.setNome(dto.getNome());
        novoFuncionario.setEmail(dto.getEmail());
        novoFuncionario.setTelefone(dto.getTelefone());
        novoFuncionario.setSenha(passwordEncoder.encode(dto.getSenha()));

        return repository.save(novoFuncionario);
    }
}
