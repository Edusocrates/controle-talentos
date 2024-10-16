package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.CandidatoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateCandidatoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
@Tag(name = "Candidato", description = "Operações relacionadas a Candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @PostMapping
    @Operation(summary = "Cadastrar novo Candidato", description = "Cadastrar novo Candidato")
    public ResponseEntity<Candidato> cadastrarCandidato(@RequestBody CreateCandidatoDTO dto) {
        Candidato candidato = candidatoService.cadastrarCandidato(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(candidato);
    }

}
