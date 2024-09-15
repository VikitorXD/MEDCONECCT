package com.medconnect.dto.cliente;

import com.medconnect.model.Contato;

import java.time.LocalDateTime;

public record ResponseContatoDto(Long idContato, int ddi, int ddd, Long telefone) {
    public ResponseContatoDto(Contato contato) {
        this(contato.getIdContato(), contato.getDdi(), contato.getDdd(), contato.getTelefone());
    }
}
