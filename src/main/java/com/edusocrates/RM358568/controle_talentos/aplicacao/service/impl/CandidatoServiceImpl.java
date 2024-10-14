package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.CandidatoService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoServiceImpl implements CandidatoService {

    @Autowired
    private CandidatoRepository candidatoRepository;


    @Override
    public Candidato salvarCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    @Override
    public List<Candidato> listarTodosCandidatos() {
        return candidatoRepository.findAll();
    }

    @Override
    public Candidato buscarPorId(Long id) {
        Optional<Candidato> candidato = candidatoRepository.findById(id);
        return candidato.orElseThrow(() -> new RuntimeException("Candidato não encontrado"));
    }

    @Override
    public void deletarCandidato(Long id) {
        candidatoRepository.deleteById(id);
    }
}
