package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.DepartamentoService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Departamento;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;


    @Override
    public Departamento salvarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public List<Departamento> listarTodosDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento buscarPorId(Long id) {
        Optional<Departamento> departamento = departamentoRepository.findById(id);
        return departamento.orElseThrow(() -> new RuntimeException("Departamento não encontrado"));
    }

    @Override
    public void deletarDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }
}
