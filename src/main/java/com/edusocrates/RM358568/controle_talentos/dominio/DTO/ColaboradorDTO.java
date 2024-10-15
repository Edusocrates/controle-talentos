package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColaboradorDTO {
    private Long id;
    private String nome;
    private String endereco;
    private String cargo;
    private String departamento;
    private Long supervisorId;
}
