package com.medconnect.swagger;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
        info = @Info(
                title = "API MED_CONNECT, Sistema de comprar e indicação de produtos farmacêuticos",
                description = "Especificação dos endpoints da MED_CONNECT",
                version = "1.0",
                contact = @Contact(name = "Victor Luca", email = "rm551886@fiap.com.br")
        ),
        security = @SecurityRequirement(name = "bearerJWT")
)
@SecurityScheme(
        name = "bearerJWT",
        description = "Autenticação por Token JWT",
        scheme = "bearer",
        bearerFormat = "JWT",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
