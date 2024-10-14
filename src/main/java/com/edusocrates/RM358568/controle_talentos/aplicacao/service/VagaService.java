package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;

import java.util.List;

public interface VagaService {

    Vaga salvarVaga(Vaga vaga);
    List<Vaga> listarTodasVagas();
    Vaga buscarPorId(Long id);
    void deletarVaga(Long id);
}
