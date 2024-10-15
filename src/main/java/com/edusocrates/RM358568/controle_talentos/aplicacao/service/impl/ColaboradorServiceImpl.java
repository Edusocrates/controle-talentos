package com.edusocrates.RM358568.controle_talentos.aplicacao.service.impl;

import com.edusocrates.RM358568.controle_talentos.aplicacao.mapper.ColaboradorMapper;
import com.edusocrates.RM358568.controle_talentos.aplicacao.service.ColaboradorService;
import com.edusocrates.RM358568.controle_talentos.dominio.DTO.ColaboradorDTO;
import com.edusocrates.RM358568.controle_talentos.dominio.model.Colaborador;
import com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;



    @Override
    public ColaboradorDTO createColaborador(ColaboradorDTO colaboradorDTO) {
        Colaborador colaborador = new Colaborador();
        colaborador.setNome(colaboradorDTO.getNome());
        colaborador.setEndereco(colaboradorDTO.getEndereco());
        colaborador.setCargo(colaboradorDTO.getCargo());
        colaborador.setDepartamento(colaboradorDTO.getDepartamento());

        // Se houver supervisor, buscar o colaborador supervisor
        if (colaboradorDTO.getSupervisorId() != null) {
            Colaborador supervisor = colaboradorRepository.findById(colaboradorDTO.getSupervisorId())
                    .orElseThrow(() -> new RuntimeException("Supervisor não encontrado"));
            colaborador.setSupervisor(supervisor);
        }

        colaboradorRepository.save(colaborador);
        colaboradorDTO.setId(colaborador.getId());
        return colaboradorDTO;
    }

    @Override
    public List<ColaboradorDTO> getAllColaboradores() {
        return colaboradorRepository.findAll()
                .stream()
                .map(ColaboradorMapper::toDTO)
                .toList();
    }
}
