package com.edusocrates.RM358568.controle_talentos.aplicacao.mapper;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateVagaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusVaga;

import java.util.List;
import java.util.stream.Collectors;

public class VagaMapper {
    public static VagaDTO toDTO(Vaga vaga) {
        return new VagaDTO(vaga.getId(), vaga.getTitulo(), vaga.getDescricao(), vaga.getStatus());
    }

    public static List<VagaDTO> toDTOList(List<Vaga> vagas) {
        return vagas.stream()
                .map(VagaMapper::toDTO)
                .collect(Collectors.toList());
    }
    public static Vaga toEntity(CreateVagaDTO createVagaDTO) {
        Vaga vaga = new Vaga();
        vaga.setTitulo(createVagaDTO.titulo());
        vaga.setDescricao(createVagaDTO.descricao());
        vaga.setStatus(StatusVaga.ABERTA); // Status inicial como ABERTA
        return vaga;
    }
}
