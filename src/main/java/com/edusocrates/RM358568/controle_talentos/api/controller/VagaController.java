package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.VagaService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.UpdateVagaStatusDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    @Autowired
    private VagaService vagaService;

    @PutMapping("/status")
    public ResponseEntity<VagaDTO> updateVagaStatus(@RequestBody UpdateVagaStatusDTO updateVagaStatusDTO) {
        VagaDTO updatedVaga = vagaService.updateVagaStatus(updateVagaStatusDTO);
        return ResponseEntity.ok(updatedVaga);
    }

    @GetMapping
    public ResponseEntity<List<VagaDTO>> listarVagas(){
        List<VagaDTO> listaVagas = vagaService.listarVagas();
        return ResponseEntity.ok(listaVagas);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<VagaDTO>> buscarVagasPorTitulo(@RequestParam("titulo") String titulo) {
        List<VagaDTO> vagas = vagaService.buscarVagasPorTitulo(titulo);
        return ResponseEntity.ok(vagas);
    }
}
