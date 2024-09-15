package com.medconnect.dto.authentication;

import com.medconnect.model.usuario.User;
import com.medconnect.model.usuario.UserRole;

public record RegisterDTO(String login, String senha, UserRole role) {
}
