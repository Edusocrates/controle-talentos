package com.edusocrates.RM358568.controle_talentos.infraestrutura.repositorio;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
