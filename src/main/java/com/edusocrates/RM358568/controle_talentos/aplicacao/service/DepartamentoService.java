package com.edusocrates.RM358568.controle_talentos.aplicacao.service;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Departamento;

import java.util.List;

public interface DepartamentoService {
    Departamento salvarDepartamento(Departamento departamento);
    List<Departamento> listarTodosDepartamentos();
    Departamento buscarPorId(Long id);
    void deletarDepartamento(Long id);
}
