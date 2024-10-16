package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.ContratacaoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Contratacao;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contratacoes")
@Tag(name = "Contratação", description = "Operações relacionadas a Contratações")
public class ContratacaoController {


    @Autowired
    private ContratacaoService contratacaoService;

    @PostMapping
    @Operation(summary = "Nova Contratação", description = "Cadastrar nova contratação")
    public ResponseEntity<ContratacaoDTO> criarContratacao(@RequestBody CreateContratacaoDTO dto) {
        ContratacaoDTO contratacao = contratacaoService.criarContratacao(dto);
        return ResponseEntity.ok(contratacao);
    }


}
