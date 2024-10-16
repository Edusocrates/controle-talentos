package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateVagaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.UpdateVagaStatusDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaDTO;

import java.util.List;

public interface VagaService {
    VagaDTO updateVagaStatus(UpdateVagaStatusDTO updateVagaStatusDTO);

    List<VagaDTO> listarVagas();

    List<VagaDTO> buscarVagasPorTitulo(String titulo);

    VagaDTO criarVaga(CreateVagaDTO createVagaDTO);

    void removerVaga(Long vagaId);
}
