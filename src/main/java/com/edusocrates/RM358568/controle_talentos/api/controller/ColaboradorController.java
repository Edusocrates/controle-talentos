package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.ColaboradorService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ColaboradorDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
@Tag(name = "Colaborador", description = "Operações relacionadas a Colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @PostMapping
    @Operation(summary = "Cadastrar novo Colaborador", description = "Cadastrar novo Colaborador")
    public ResponseEntity<ColaboradorDTO> createColaborador(@RequestBody ColaboradorDTO colaboradorDTO) {
        ColaboradorDTO createdColaborador = colaboradorService.createColaborador(colaboradorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdColaborador);
    }

    @GetMapping
    @Operation(summary = "Listar todos colaboradores", description = "Listar todos colaboradores")
    public ResponseEntity<List<ColaboradorDTO>> getAllColaboradores() {
        List<ColaboradorDTO> colaboradores = colaboradorService.getAllColaboradores();
        return ResponseEntity.ok(colaboradores);
    }
}
