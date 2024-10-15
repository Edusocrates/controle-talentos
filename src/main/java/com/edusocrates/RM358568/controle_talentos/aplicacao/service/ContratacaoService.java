package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Contratacao;

public interface ContratacaoService {

    Contratacao criarContratacao( CreateContratacaoDTO dto);
}
