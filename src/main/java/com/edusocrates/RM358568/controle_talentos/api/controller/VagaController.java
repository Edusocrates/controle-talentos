package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.VagaService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vagas")
public class VagaController {

    @Autowired
    private VagaService vagaService;


    @PostMapping
    public ResponseEntity<Vaga> criarVaga(@RequestBody Vaga vaga) {
        Vaga novaVaga = vagaService.salvarVaga(vaga);
        return ResponseEntity.ok(novaVaga);
    }

    @GetMapping
    public ResponseEntity<List<Vaga>> listarVagas() {
        List<Vaga> vagas = vagaService.listarTodasVagas();
        return ResponseEntity.ok(vagas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vaga> buscarVaga(@PathVariable Long id) {
        Vaga vaga = vagaService.buscarPorId(id);
        return ResponseEntity.ok(vaga);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarVaga(@PathVariable Long id) {
        vagaService.deletarVaga(id);
        return ResponseEntity.noContent().build();
    }
}
