package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.mapper.EntrevistaMapper;
import com.edusocrates.RM358568.controle_talentos.aplicacao.service.EntrevistaService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateEntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.EntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.CandidatoRepository;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.EntrevistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class EntrevistaServiceImpl implements EntrevistaService {

    @Autowired
    private EntrevistaRepository entrevistaRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;


    @Override
    public EntrevistaDTO agendarEntrevista(CreateEntrevistaDTO dto) {
        Candidato candidato = candidatoRepository.findById(dto.candidatoId())
                .orElseThrow(() -> new IllegalArgumentException("Candidato não encontrado"));

        Entrevista entrevista = new Entrevista();
        entrevista.setCandidato(candidato);
        entrevista.setDataHora(dto.dataHora());
        entrevista.setAvaliador(dto.avaliador());
        var novaEntrevista = entrevistaRepository.save(entrevista);

        return EntrevistaMapper.mapToEntrevistaDTO(novaEntrevista);
    }

    @Override
    public List<EntrevistaDTO> consultarEntrevistasPorData(LocalDateTime dataInicio, LocalDateTime dataFim) {
        var entrevistas =  entrevistaRepository.findByDataHoraBetween(dataInicio, dataFim);
        return EntrevistaMapper.mapToEntrevistaDTOList(entrevistas);
    }

    @Override
    public EntrevistaDTO fornecerFeedback(Long entrevistaId, String feedback) {
        Entrevista entrevista = entrevistaRepository.findById(entrevistaId)
                .orElseThrow(() -> new IllegalArgumentException("Entrevista não encontrada"));
        entrevista.setFeedback(feedback);

        var entrevistaAtualizada = entrevistaRepository.save(entrevista);

        return EntrevistaMapper.mapToEntrevistaDTO(entrevistaAtualizada);
    }


}
