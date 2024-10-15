package com.edusocrates.RM358568.controle_talentos.aplicacao.mapper;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Contratacao;

public class ContratacaoMapper {

    public static ContratacaoDTO mapToDTO(Contratacao contratacao) {
        return new ContratacaoDTO(
                contratacao.getId(),
                contratacao.getCandidato().getId(),
                contratacao.getStatus()
        );
    }
}
