package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.InscricaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaInscricaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;

import java.util.List;

public interface InscricaoService {
    InscricaoDTO candidatarVaga(VagaInscricaoDTO vagaInscricaoDTO);

    List<Vaga> getVagasParaCandidato(Long candidatoId);

    Long countCandidatosByVagaId(Long vagaId);
}
