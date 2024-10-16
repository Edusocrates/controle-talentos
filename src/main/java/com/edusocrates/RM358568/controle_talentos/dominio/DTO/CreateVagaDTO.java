package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import jakarta.validation.constraints.NotBlank;

public record CreateVagaDTO(
        @NotBlank(message = "O título é obrigatório")
        String titulo,

        @NotBlank(message = "A descrição é obrigatória")
        String descricao
) {
}
