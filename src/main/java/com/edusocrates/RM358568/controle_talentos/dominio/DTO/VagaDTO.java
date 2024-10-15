package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusVaga;

public record VagaDTO(Long id, String titulo, String descricao, StatusVaga status) {}
