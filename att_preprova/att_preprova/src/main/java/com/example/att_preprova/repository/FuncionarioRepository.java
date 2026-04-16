package com.example.att_preprova.repository;

import com.example.att_preprova.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional<FuncionarioModel> findByEmail(String email);
}
