package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

public record CreateEntrevistaDTO(
        @NotNull Long candidatoId,
         LocalDateTime dataHora,
         String avaliador
) {}
