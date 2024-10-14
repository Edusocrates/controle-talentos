package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.EntrevistaService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.EntrevistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrevistaServiceImpl implements EntrevistaService {

    @Autowired
    private EntrevistaRepository entrevistaRepository;

    @Override
    public Entrevista salvarEntrevista(Entrevista entrevista) {
        return entrevistaRepository.save(entrevista);
    }

    @Override
    public List<Entrevista> listarTodasEntrevistas() {
        return entrevistaRepository.findAll();
    }

    @Override
    public Entrevista buscarPorId(Long id) {
        Optional<Entrevista> entrevista = entrevistaRepository.findById(id);
        return entrevista.orElseThrow(() -> new RuntimeException("Entrevista não encontrada"));
    }

    @Override
    public void deletarEntrevista(Long id) {
        entrevistaRepository.deleteById(id);
    }
}
