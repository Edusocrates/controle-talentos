package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.mapper.VagaMapper;
import com.edusocrates.RM358568.controle_talentos.aplicacao.service.VagaService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.CreateVagaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.UpdateVagaStatusDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.VagaDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusVaga;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VagaServiceImpl implements VagaService {

    @Autowired
    private VagaRepository vagaRepository;

    @Override
    public VagaDTO updateVagaStatus(UpdateVagaStatusDTO updateVagaStatusDTO) {
        Vaga vaga = vagaRepository.findById(updateVagaStatusDTO.id())
                .orElseThrow(() -> new RuntimeException("Vaga não encontrada"));

        vaga.setStatus(StatusVaga.valueOf(updateVagaStatusDTO.status()));
        vagaRepository.save(vaga);

        return VagaMapper.toDTO(vaga);
    }

    @Override
    public List<VagaDTO> listarVagas() {
        List<Vaga> listaVagas = vagaRepository.findAll();
        return VagaMapper.toDTOList(listaVagas);
    }

    @Override
    public List<VagaDTO> buscarVagasPorTitulo(String titulo) {
        List<Vaga> vagas = vagaRepository.findByTituloContainingIgnoreCase(titulo);
        return VagaMapper.toDTOList(vagas);
    }

    @Override
    @Transactional
    public VagaDTO criarVaga(CreateVagaDTO createVagaDTO) {
        Vaga vaga = VagaMapper.toEntity(createVagaDTO);
        Vaga vagaSalva = vagaRepository.save(vaga);
        return VagaMapper.toDTO(vagaSalva);
    }

    @Override
    public void removerVaga(Long vagaId) {
        Vaga vaga = vagaRepository.findById(vagaId)
                .orElseThrow(() -> new RuntimeException("Vaga não encontrada!"));

        if(vaga != null){
            vagaRepository.deleteById(vagaId);
        }
    }
}
