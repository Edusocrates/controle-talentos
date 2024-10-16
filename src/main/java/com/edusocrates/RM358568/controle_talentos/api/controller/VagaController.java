package com.edusocrates.RM358568.controle_talentos.api.controller;

import com.edusocrates.RM358568.controle_talentos.aplicacao.service.VagaService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateVagaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.UpdateVagaStatusDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
@Tag(name = "Vagas", description = "Operações relacionadas a Vagas")
public class VagaController {

    @Autowired
    private VagaService vagaService;

    @PutMapping("/status")
    @Operation(summary = "Atualizar Status Vaga", description = "Atualizar Status Vaga")
    public ResponseEntity<VagaDTO> updateVagaStatus(@RequestBody UpdateVagaStatusDTO updateVagaStatusDTO) {
        VagaDTO updatedVaga = vagaService.updateVagaStatus(updateVagaStatusDTO);
        return ResponseEntity.ok(updatedVaga);
    }

    @GetMapping
    @Operation(summary = "Listar todas Vagas", description = "Listar todas Vagas")
    public ResponseEntity<List<VagaDTO>> listarVagas(){
        List<VagaDTO> listaVagas = vagaService.listarVagas();
        return ResponseEntity.ok(listaVagas);
    }

    @GetMapping("/buscar")
    @Operation(summary = "Consultar Vaga por nome", description = "Consultar Vaga por nome")
    public ResponseEntity<List<VagaDTO>> buscarVagasPorTitulo(@RequestParam("titulo") String titulo) {
        List<VagaDTO> vagas = vagaService.buscarVagasPorTitulo(titulo);
        return ResponseEntity.ok(vagas);
    }

    @PostMapping
    @Operation(summary = "Cadastrar nova Vaga", description = "Cadastrar nova Vaga")
    public ResponseEntity<VagaDTO> criarVaga(@Valid @RequestBody CreateVagaDTO createVagaDTO) {
        VagaDTO vagaCriada = vagaService.criarVaga(createVagaDTO);
        return new ResponseEntity<>(vagaCriada, HttpStatus.CREATED);
    }

    @DeleteMapping
    @Operation(summary = "Deletar Vaga", description = "Deletar Vaga")
    public ResponseEntity<Void> removerVaga(@RequestParam("vagaId") Long vagaId){
        vagaService.removerVaga(vagaId);
        return ResponseEntity.noContent().build();
    }
}
