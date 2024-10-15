package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.mapper.ContratacaoMapper;
import com.edusocrates.RM358568.controle_talentos.aplicacao.service.ContratacaoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Contratacao;
import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusContratacao;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.CandidatoRepository;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.ContratacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratacaoServiceImpl implements ContratacaoService {


    @Autowired
    private ContratacaoRepository contratacaoRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;


    @Override
    public ContratacaoDTO criarContratacao(CreateContratacaoDTO dto) {
        Candidato candidato = candidatoRepository.findById(dto.candidatoId())
                .orElseThrow(() -> new IllegalArgumentException("Candidato não encontrado"));

        Contratacao contratacao = new Contratacao();
        contratacao.setCandidato(candidato);
        contratacao.setStatus(StatusContratacao.valueOf(dto.status()));

        var novaContratacao = contratacaoRepository.save(contratacao);

        return ContratacaoMapper.mapToDTO(novaContratacao);
    }
}
