package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.DepartamentoService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<Departamento> criarDepartamento(@RequestBody Departamento departamento) {
        Departamento novoDepartamento = departamentoService.salvarDepartamento(departamento);
        return ResponseEntity.ok(novoDepartamento);
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamentos() {
        List<Departamento> departamentos = departamentoService.listarTodosDepartamentos();
        return ResponseEntity.ok(departamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Departamento> buscarDepartamento(@PathVariable Long id) {
        Departamento departamento = departamentoService.buscarPorId(id);
        return ResponseEntity.ok(departamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDepartamento(@PathVariable Long id) {
        departamentoService.deletarDepartamento(id);
        return ResponseEntity.noContent().build();
    }
}
