package com.example.api_jogo.repository;

import com.example.api_jogo.model.JogadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel, Long> {
    Optional<JogadorModel> findByEmail(String email);
    Optional<JogadorModel> findByNome(String nome);
}
