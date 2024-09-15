package com.medconnect.dto.logradouro;

import com.medconnect.model.Bairro;
import com.medconnect.model.Endereco;
import com.medconnect.model.Logradouro;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record ResponseLogradouroDto(
        String nome,
        int cep,
        Endereco endereco,
        Bairro bairro
) {
    public ResponseLogradouroDto(Logradouro logradouro) {
        this(logradouro.getNome(), logradouro.getCep(), logradouro.getEndereco(), logradouro.getBairro());
    }
}
