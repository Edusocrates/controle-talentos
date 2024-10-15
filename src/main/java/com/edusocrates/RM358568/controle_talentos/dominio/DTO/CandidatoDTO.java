package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidatoDTO {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String curriculo; // URL ou caminho do arquivo do currículo
    private Date dataInscricao;
    private String status;  // Status do candidato


}
