package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.ContratacaoService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateContratacaoDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Contratacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contratacoes")
public class ContratacaoController {


    @Autowired
    private ContratacaoService contratacaoService;

    @PostMapping
    public ResponseEntity<Contratacao> criarContratacao(@RequestBody CreateContratacaoDTO dto) {
        Contratacao contratacao = contratacaoService.criarContratacao(dto);
        return ResponseEntity.ok(contratacao);
    }


}
