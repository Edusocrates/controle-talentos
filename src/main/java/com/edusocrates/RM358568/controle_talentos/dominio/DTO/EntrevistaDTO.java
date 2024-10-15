package com.edusocrates.RM358568.controle_talentos.dominio.DTO;

import com.edusocrates.RM358568.controle_talentos.dominio.model.Entrevista;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntrevistaDTO {
    private Long id;
    private Long candidatoId;
    private String avaliador;
    private LocalDateTime dataHora;
    private String feedback;

}
