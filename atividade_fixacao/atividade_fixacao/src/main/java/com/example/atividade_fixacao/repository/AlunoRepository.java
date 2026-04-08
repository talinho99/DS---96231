package com.example.atividade_fixacao.repository;

import com.example.atividade_fixacao.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository  extends JpaRepository<AlunoModel, Long> {
}
