package com.edusocrates.RM358568.controle_talentos.dominio.model;

import com.edusocrates.RM358568.controle_talentos.dominio.model.enums.StatusVaga;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vaga")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusVaga status; // ABERTA, ENCERRADA
}
