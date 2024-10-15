package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateCandidatoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;

import java.util.List;

public interface CandidatoService {

    Candidato cadastrarCandidato(CreateCandidatoDTO candidatoDTO);
}
