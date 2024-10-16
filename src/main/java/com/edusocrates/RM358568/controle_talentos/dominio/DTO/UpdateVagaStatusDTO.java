package com.edusocrates.RM358568.controle_talentos.dominio.DTO;


import org.antlr.v4.runtime.misc.NotNull;

public record UpdateVagaStatusDTO(
        @NotNull Long id,
        @NotNull String status // "ABERTA" ou "ENCERRADA"
) {}
