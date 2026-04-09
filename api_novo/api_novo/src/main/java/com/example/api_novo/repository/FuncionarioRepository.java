package com.example.api_novo.repository;

import com.example.api_novo.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    //Consulta no banco de dados se o e-mail já existe
    //antes de salvar um cliente.
    Optional<FuncionarioModel> findByEmail(String email);
}
