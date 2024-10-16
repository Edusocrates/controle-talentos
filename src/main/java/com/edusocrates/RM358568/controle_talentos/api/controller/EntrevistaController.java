package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.EntrevistaService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateEntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.EntrevistaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.FeedbackDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/entrevistas")
@Tag(name = "Entrevista", description = "Operações relacionadas a Entrevistas")
public class EntrevistaController {

    @Autowired
    private EntrevistaService entrevistaService;

    @PostMapping
    @Operation(summary = "Agendar Entrevista", description = "Agendar Entrevista")
    public ResponseEntity<EntrevistaDTO> agendarEntrevista(@RequestBody CreateEntrevistaDTO dto) {
        EntrevistaDTO entrevista = entrevistaService.agendarEntrevista(dto);
        return ResponseEntity.ok(entrevista);
    }

    @GetMapping("/por-data")
    @Operation(summary = "Consultar entrevistas por data", description = "Consultar entrevistas por data")
    public ResponseEntity<List<EntrevistaDTO>> consultarPorData(
            @RequestParam LocalDateTime inicio, @RequestParam LocalDateTime fim) {
        List<EntrevistaDTO> entrevistas = entrevistaService.consultarEntrevistasPorData(inicio, fim);
        return ResponseEntity.ok(entrevistas);
    }

    @PostMapping("/feedback")
    @Operation(summary = "Fornecer Feedback", description = "Fornecer Feedback entrevista")
    public ResponseEntity<EntrevistaDTO> fornecerFeedback(@RequestBody FeedbackDTO dto) {
        EntrevistaDTO entrevista = entrevistaService.fornecerFeedback(dto.entrevistaId(), dto.feedback());
        return ResponseEntity.ok(entrevista);
    }

    @GetMapping("/candidato/{candidatoId}")
    @Operation(summary = "Listar entrevistas agendadas por candidato", description = "Listar entrevistas agendadas por candidato")
    public ResponseEntity<List<EntrevistaDTO>> getEntrevistasByCandidatoId(@PathVariable Long candidatoId) {
        List<EntrevistaDTO> entrevistas = entrevistaService.getEntrevistasByCandidatoId(candidatoId);
        if (entrevistas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(entrevistas);
    }
}
