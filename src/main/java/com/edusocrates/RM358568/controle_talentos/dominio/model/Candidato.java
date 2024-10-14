package com.edusocrates.RM358568.controle_talentos.dominio.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidatos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false)
    private String curriculoUrl;  // URL do currículo do candidato

    @OneToMany(mappedBy = "candidato", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Entrevista> entrevistas;
}
