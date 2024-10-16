package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.InscricaoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.InscricaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaInscricaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscricoes")
@Tag(name = "Inscrição", description = "Operações relacionadas a Inscrições")
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    @PostMapping
    @Operation(summary = "Candidatar-se a nova Vaga", description = "Candidatar-se a nova Vaga")
    public ResponseEntity<InscricaoDTO> candidatarVaga(@RequestBody VagaInscricaoDTO vagaInscricaoDTO) {
        InscricaoDTO inscricaoDTO = inscricaoService.candidatarVaga(vagaInscricaoDTO);
        return ResponseEntity.ok(inscricaoDTO);
    }

    @GetMapping("/candidato/{candidatoId}")
    @Operation(summary = "Listar Vagas que candidato se inscreveu", description = "Listar Vagas que candidato se inscreveu")
    public ResponseEntity<List<Vaga>> getVagasParaCandidato(@PathVariable Long candidatoId) {
        List<Vaga> vagas = inscricaoService.getVagasParaCandidato(candidatoId);
        return ResponseEntity.ok(vagas);
    }

    @GetMapping("/vaga/{vagaId}/candidatos/count")
    @Operation(summary = "Listar quantidade de candidatos por vaga", description = "Listar quantidade de candidatos por vaga")
    public ResponseEntity<Long> countCandidatosByVagaId(@PathVariable Long vagaId) {
        Long count = inscricaoService.countCandidatosByVagaId(vagaId);
        return ResponseEntity.ok(count);
    }
}
