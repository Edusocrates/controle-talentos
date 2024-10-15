package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ColaboradorDTO;

import java.util.List;

public interface ColaboradorService {
    ColaboradorDTO createColaborador(ColaboradorDTO colaboradorDTO);

    List<ColaboradorDTO> getAllColaboradores();


}
