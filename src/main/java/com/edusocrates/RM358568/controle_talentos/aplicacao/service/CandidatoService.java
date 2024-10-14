package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;

import java.util.List;

public interface CandidatoService {
    Candidato salvarCandidato(Candidato candidato);
    List<Candidato> listarTodosCandidatos();
    Candidato buscarPorId(Long id);
    void deletarCandidato(Long id);
}
