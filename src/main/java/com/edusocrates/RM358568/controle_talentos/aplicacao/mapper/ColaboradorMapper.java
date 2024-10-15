package com.edusocrates.RM358568.controle_talentos.aplicacao.mapper;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ColaboradorDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Colaborador;

public class ColaboradorMapper {

    public static ColaboradorDTO toDTO(Colaborador colaborador) {
        ColaboradorDTO dto = new ColaboradorDTO();
        dto.setId(colaborador.getId());
        dto.setNome(colaborador.getNome());
        dto.setEndereco(colaborador.getEndereco());
        dto.setCargo(colaborador.getCargo());
        dto.setDepartamento(colaborador.getDepartamento());
        dto.setSupervisorId(colaborador.getSupervisor() != null ? colaborador.getSupervisor().getId() : null);
        return dto;
    }
}
