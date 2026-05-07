package com.example.api_jogo.service;

import com.example.api_jogo.dto.JogadorRequestDTO;
import com.example.api_jogo.dto.JogadorResponseDTO;
import com.example.api_jogo.model.JogadorModel;
import com.example.api_jogo.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    public List<JogadorResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(j-> new JogadorResponseDTO(j.getNome(),
                        j.getEmail(),
                        j.getTelefone()))
                .toList();
    }

    public JogadorModel salvarJogador(JogadorRequestDTO dto){
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Já contem um usuário usando esse e-mail.");
        }

        if (repository.findByNome(dto.getNome()).isPresent()){
            throw new RuntimeException(("Nome já em uso, escolha outro."));
        }

        JogadorModel novoJogador = new JogadorModel();
        novoJogador.setNome(dto.getNome());
        novoJogador.setEmail(dto.getEmail());
        novoJogador.setTelefone(dto.getTelefone());
        novoJogador.setSenha(passwordEncoder.encode(dto.getSenha()));

        return repository.save(novoJogador);
    }



}
