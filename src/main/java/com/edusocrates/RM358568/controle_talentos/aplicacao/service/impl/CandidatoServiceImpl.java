package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.CandidatoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateCandidatoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.CandidatoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoServiceImpl implements CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;

    @Override
    public Candidato cadastrarCandidato(@Validated CreateCandidatoDTO candidatoDTO) {
        Candidato candidato = new Candidato();
        candidato.setNome(candidatoDTO.nome());
        candidato.setEmail(candidatoDTO.email());
        candidato.setTelefone(candidatoDTO.telefone());
        candidato.setCurriculoUrl(candidatoDTO.curriculoUrl());

        return candidatoRepository.save(candidato);
    }
}
