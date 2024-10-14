package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;

import java.util.List;

public interface EntrevistaService {
    Entrevista salvarEntrevista(Entrevista entrevista);
    List<Entrevista> listarTodasEntrevistas();
    Entrevista buscarPorId(Long id);
    void deletarEntrevista(Long id);
}
