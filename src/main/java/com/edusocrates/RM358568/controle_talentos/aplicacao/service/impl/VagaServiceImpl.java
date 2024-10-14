package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.VagaService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VagaServiceImpl implements VagaService {

    @Autowired
    private VagaRepository vagaRepository;

    @Override
    public Vaga salvarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    @Override
    public List<Vaga> listarTodasVagas() {
        return vagaRepository.findAll();
    }

    @Override
    public Vaga buscarPorId(Long id) {
        Optional<Vaga> vaga = vagaRepository.findById(id);
        return vaga.orElseThrow(() -> new RuntimeException("Vaga não encontrada"));
    }

    @Override
    public void deletarVaga(Long id) {
        vagaRepository.deleteById(id);
    }
}
