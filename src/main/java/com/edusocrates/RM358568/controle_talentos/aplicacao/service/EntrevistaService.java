package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateEntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.EntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;

import java.time.LocalDateTime;
import java.util.List;

public interface EntrevistaService {
    EntrevistaDTO agendarEntrevista(CreateEntrevistaDTO dto);

    List<EntrevistaDTO> consultarEntrevistasPorData(LocalDateTime dataInicio, LocalDateTime dataFim);

    EntrevistaDTO fornecerFeedback(Long entrevistaId, String feedback);

    List<EntrevistaDTO> getEntrevistasByCandidatoId(Long candidatoId);
}
