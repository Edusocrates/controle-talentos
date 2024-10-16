package com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Vaga;
import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusVaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    List<Vaga> findByStatus(StatusVaga status);

    List<Vaga> findByTituloContainingIgnoreCase(String titulo);
}
