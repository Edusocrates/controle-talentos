package com.edusocrates.RM358568.controle_talentos.dominio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "colaborador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String cargo;
    private String departamento;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Colaborador supervisor; // Referência para o supervisor
}
