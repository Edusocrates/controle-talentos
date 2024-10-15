package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.CandidatoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateCandidatoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    // Cadastro de Candidatos
    @PostMapping
    public ResponseEntity<Candidato> cadastrarCandidato(@RequestBody CreateCandidatoDTO dto) {
        Candidato candidato = candidatoService.cadastrarCandidato(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(candidato);
    }

}
