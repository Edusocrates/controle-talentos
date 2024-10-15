package com.edusocrates.RM358568.controle_talentos.dominio.model;

import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusContratacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contratacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "candidato_id", nullable = false)
    private Candidato candidato;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusContratacao status;


}
