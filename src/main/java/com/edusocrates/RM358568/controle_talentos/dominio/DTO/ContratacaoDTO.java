package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusContratacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public record ContratacaoDTO(
        Long id,
        Long candidatoId,
        StatusContratacao statusContratacao
) {}
