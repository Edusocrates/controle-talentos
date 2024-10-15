package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import org.antlr.v4.runtime.misc.NotNull;

public record FeedbackDTO(
        @NotNull Long entrevistaId,
        String feedback
) {}
