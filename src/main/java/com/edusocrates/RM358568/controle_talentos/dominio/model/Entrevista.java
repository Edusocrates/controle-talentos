package com.edusocrates.RM358568.controle_talentos.dominio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "entrevista")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entrevista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidato_id", nullable = false)
    private Candidato candidato;

    @Column(nullable = false)
    private LocalDateTime dataHora;

    @Column(nullable = false)
    private String avaliador;

    @Column(columnDefinition = "TEXT")
    private String feedback;
}
