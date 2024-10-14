package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.EntrevistaService;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entrevistas")
public class EntrevistaController {

    @Autowired
    private EntrevistaService entrevistaService;

    @PostMapping
    public ResponseEntity<Entrevista> criarEntrevista(@RequestBody Entrevista entrevista) {
        Entrevista novaEntrevista = entrevistaService.salvarEntrevista(entrevista);
        return ResponseEntity.ok(novaEntrevista);
    }

    @GetMapping
    public ResponseEntity<List<Entrevista>> listarEntrevistas() {
        List<Entrevista> entrevistas = entrevistaService.listarTodasEntrevistas();
        return ResponseEntity.ok(entrevistas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entrevista> buscarEntrevista(@PathVariable Long id) {
        Entrevista entrevista = entrevistaService.buscarPorId(id);
        return ResponseEntity.ok(entrevista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEntrevista(@PathVariable Long id) {
        entrevistaService.deletarEntrevista(id);
        return ResponseEntity.noContent().build();
    }
}
