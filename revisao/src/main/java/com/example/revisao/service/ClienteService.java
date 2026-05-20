package com.example.revisao.service;

import com.example.revisao.dto.ClienteRequestDTO;
import com.example.revisao.dto.ClienteResponseDTO;
import com.example.revisao.dto.EnderecoResponseDTO;
import com.example.revisao.model.ClienteModel;
import com.example.revisao.model.EnderecoModel;
import com.example.revisao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    // Método GET(listar)
    public List<ClienteResponseDTO> listarTodos(){
        List<ClienteModel> clientes = repository.findAll();

        return  clientes.stream().map(cliente ->{
            EnderecoResponseDTO enderecoResponse = new EnderecoResponseDTO(
                    cliente.getEndereco().getCep(),
                    cliente.getEndereco().getLogradouro(),
                    cliente.getEndereco().getNumero(),
                    cliente.getEndereco().getCidade(),
                    cliente.getEndereco().getUf()
            );
            return new ClienteResponseDTO(
                    cliente.getId(),
                    cliente.getNome(),
                    cliente.getEmail(),
                    enderecoResponse
            );
        }).collect(Collectors.toList());
    }


    public void salvarCliente(ClienteRequestDTO dto) {
        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("E-mail já cadastrado na base de dados.");
        }

        EnderecoModel endereco = new EnderecoModel();
        // Aqui chamamos o método auxiliar. Note que a variável "endereco" está com 'e' minúsculo!
        mapearEndereco(dto, endereco);

        ClienteModel cliente = new ClienteModel();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setEndereco(endereco);

        repository.save(cliente);
    }

    // Método PUT (Atualizar)
    public void atualizarCliente(Long id, ClienteRequestDTO dto) {
        ClienteModel clienteExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));

        repository.findByEmail(dto.getEmail()).ifPresent(cliente -> {
            if (!cliente.getId().equals(id)) {
                throw new RuntimeException("Este e-mail já está sendo usado por outro cliente.");
            }
        });

        clienteExistente.setNome(dto.getNome());
        clienteExistente.setEmail(dto.getEmail());

        EnderecoModel enderecoExistente = clienteExistente.getEndereco();
        // Chamando o método auxiliar de novo!
        mapearEndereco(dto, enderecoExistente);

        repository.save(clienteExistente);
    }

    // Método DELETE (Deletar)
    public void deletarCliente(Long id) {
        ClienteModel clienteExistente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado para deleção."));

        repository.delete(clienteExistente);
    }















    // MÉTODO AUXILIAR
    // Fica aqui embaixo, isolado, e é usado pelo POST e pelo PUT
    private void mapearEndereco(ClienteRequestDTO dto, EnderecoModel endereco) {
        endereco.setCep(dto.getEndereco().getCep());
        endereco.setLogradouro(dto.getEndereco().getLogradouro());
        endereco.setNumero(dto.getEndereco().getNumero());
        endereco.setCidade(dto.getEndereco().getCidade());
        endereco.setUf(dto.getEndereco().getUf());
    }

}
