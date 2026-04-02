package com.example.api.repository;

import com.example.api.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornedorRepository extends JpaRepository<FornecedorModel, Long> {
}
