package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.CandidatoService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @PostMapping
    public ResponseEntity<Candidato> criarCandidato(@RequestBody Candidato candidato) {
        Candidato novoCandidato = candidatoService.salvarCandidato(candidato);
        return ResponseEntity.ok(novoCandidato);
    }

    @GetMapping
    public ResponseEntity<List<Candidato>> listarCandidatos() {
        List<Candidato> candidatos = candidatoService.listarTodosCandidatos();
        return ResponseEntity.ok(candidatos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidato> buscarCandidato(@PathVariable Long id) {
        Candidato candidato = candidatoService.buscarPorId(id);
        return ResponseEntity.ok(candidato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCandidato(@PathVariable Long id) {
        candidatoService.deletarCandidato(id);
        return ResponseEntity.noContent().build();
    }
}
