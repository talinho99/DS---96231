package com.example.api_novo.repository;

import com.example.api_novo.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    //Consulta no banco de dados se o e-mail já existe
    //antes de salvar um cliente.
    Optional<ClienteModel> findByEmail(String email);
}
