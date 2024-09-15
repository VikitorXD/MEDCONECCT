package com.medconnect.dto.cliente;

import com.medconnect.model.Email;

import java.time.LocalDateTime;

public record ResponseEmailDto(Long idEmail, String email) {
    public ResponseEmailDto(Email email)  {
        this(email.getIdEmail(), email.getEmail());
    }
}
