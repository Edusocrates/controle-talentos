package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorDTO {
    private Long id;
    private String nome;
    private String endereco;
    private String cargo;
    private Long departamentoId; // ID do departamento
    private Long supervisorId; // ID do supervisor
    private Date dataContratacao;
    private List<Long> avaliacoesIds; // IDs das avaliações relacionadas
}
