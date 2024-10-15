package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.InscricaoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.InscricaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaInscricaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Inscricao;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.CandidatoRepository;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.InscricaoRepository;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoServiceImpl implements InscricaoService {

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @Autowired
    private  VagaRepository vagaRepository;

    @Autowired
    private CandidatoRepository candidatoRepository;


    @Override
    public InscricaoDTO candidatarVaga(VagaInscricaoDTO vagaInscricaoDTO) {
        Vaga vaga = vagaRepository.findById(vagaInscricaoDTO.vagaId())
                .orElseThrow(() -> new RuntimeException("Vaga não encontrada"));

        Inscricao inscricao = new Inscricao();

        Candidato candidato = candidatoRepository.findById(vagaInscricaoDTO.candidatoId())
                .orElseThrow(() -> new RuntimeException("Candidato não encontrado!"));

        inscricao.setCandidato(candidato);
        inscricao.setVaga(vaga);

        inscricaoRepository.save(inscricao);

        return new InscricaoDTO(inscricao.getId(), inscricao.getCandidato().getId(), vaga.getId());
    }

    @Override
    public List<Vaga> getVagasParaCandidato(Long candidatoId) {
        List<Inscricao> inscricoes = inscricaoRepository.findByCandidatoId(candidatoId);
        return inscricoes.stream().map(Inscricao::getVaga).toList();
    }

    @Override
    public Long countCandidatosByVagaId(Long vagaId) {
        return inscricaoRepository.countByVagaId(vagaId);
    }
}
