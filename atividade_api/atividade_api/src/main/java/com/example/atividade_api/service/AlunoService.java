package com.example.atividade_api.service;

import com.example.atividade_api.dto.AlunoRequestDTO;
import com.example.atividade_api.dto.AlunoResponseDTO;
import com.example.atividade_api.model.AlunoModel;
import com.example.atividade_api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<AlunoResponseDTO> listarTodos(){
        return repository
                .findAll()
                .stream()
                .map(a -> new AlunoResponseDTO(a.getNome(),
                        a.getEmail(),
                a.getMatricula()))
                .toList();
    }

    // 1. Mude o tipo de retorno de AlunoModel para AlunoResponseDTO
    public AlunoResponseDTO salvarAluno(AlunoRequestDTO dto){
        if (repository.findByEmail(dto.getEmail()).isPresent()){
            throw new RuntimeException("Aluno já cadastrado."); // Corrigi de 'Funcionário' para 'Aluno' pra combinar com seu projeto
        }

        AlunoModel novoAluno = new AlunoModel();
        novoAluno.setNome(dto.getNome());
        novoAluno.setEmail(dto.getEmail());
        novoAluno.setMatricula(dto.getMatricula());
        novoAluno.setSenha(passwordEncoder.encode(dto.getSenha()));

        // 2. Salva a model no banco
        AlunoModel alunoSalvo = repository.save(novoAluno);

        // 3. Usa o construtor novo que você criou para retornar o DTO
        return new AlunoResponseDTO(alunoSalvo);
    }

    public AlunoResponseDTO atualizarAluno(Long id, AlunoRequestDTO dto){
        AlunoModel aluno = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno não encontrado." + id));

        aluno.setNome(dto.getNome());
        aluno.setEmail(dto.getEmail());
        aluno.setMatricula(dto.getMatricula());

        AlunoModel alunoSalvo = repository.save(aluno);

        return new AlunoResponseDTO(alunoSalvo);

    }


    public void excluirAluno(Long id) {
        // 1. O AVISO: Verifica se existe. Se não, estoura a RuntimeException.
        // Usamos o existsById aqui porque não precisamos carregar os dados do aluno na memória,
        // só precisamos saber se ele "respira" no banco de dados.
        if (!repository.existsById(id)) {
            throw new RuntimeException("Não foi possível excluir. Aluno não encontrado com o ID: " + id);
        }

        // 2. A EXCLUSÃO: Se passou pelo if, o ID é válido.
        repository.deleteById(id);
    }




}
