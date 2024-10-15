package com.edusocrates.RM358568.controle_talentos.aplicacao.mapper;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.EntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;

import java.util.List;
import java.util.stream.Collectors;

public class EntrevistaMapper {

    public static List<EntrevistaDTO> mapToEntrevistaDTOList(List<Entrevista> entrevistas) {
        return entrevistas.stream()
                .map(entrevista -> new EntrevistaDTO(
                        entrevista.getId(),
                        entrevista.getCandidato().getId(),
                        entrevista.getAvaliador(),
                        entrevista.getDataHora(),
                        entrevista.getFeedback()
                ))
                .collect(Collectors.toList());
    }

    public static EntrevistaDTO mapToEntrevistaDTO(Entrevista entrevista) {
        return new EntrevistaDTO(
                entrevista.getId(),
                entrevista.getCandidato().getId(),
                entrevista.getAvaliador(),
                entrevista.getDataHora(),
                entrevista.getFeedback()
        );
    }
}
