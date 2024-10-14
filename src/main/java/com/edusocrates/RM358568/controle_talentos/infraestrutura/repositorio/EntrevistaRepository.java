package com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrevistaRepository extends JpaRepository<Entrevista, Long> {

}
