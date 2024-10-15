package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.EntrevistaService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateEntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.EntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.FeedbackDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/entrevistas")
public class EntrevistaController {

    @Autowired
    private EntrevistaService entrevistaService;

    @PostMapping
    public ResponseEntity<EntrevistaDTO> agendarEntrevista(@RequestBody CreateEntrevistaDTO dto) {
        EntrevistaDTO entrevista = entrevistaService.agendarEntrevista(dto);
        return ResponseEntity.ok(entrevista);
    }

    @GetMapping("/por-data")
    public ResponseEntity<List<EntrevistaDTO>> consultarPorData(
            @RequestParam LocalDateTime inicio, @RequestParam LocalDateTime fim) {
        List<EntrevistaDTO> entrevistas = entrevistaService.consultarEntrevistasPorData(inicio, fim);
        return ResponseEntity.ok(entrevistas);
    }

    @PostMapping("/feedback")
    public ResponseEntity<EntrevistaDTO> fornecerFeedback(@RequestBody FeedbackDTO dto) {
        EntrevistaDTO entrevista = entrevistaService.fornecerFeedback(dto.entrevistaId(), dto.feedback());
        return ResponseEntity.ok(entrevista);
    }
}
