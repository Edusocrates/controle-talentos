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

    public EntrevistaDTO (Entrevista entrevista){
        this.id = entrevista.getId();
        this.candidatoId = entrevista.getCandidato().getId();
        this.avaliador = entrevista.getAvaliador();
        this.dataHora = entrevista.getDataHora();
        this.feedback = entrevista.getFeedback();
    }
    public EntrevistaDTO (List<Entrevista> entrevistas){
        List<EntrevistaDTO> listaEntrevistas = new ArrayList<>();
        for (Entrevista entrevista : entrevistas)
        {
            this.id = entrevista.getId();
            this.candidatoId = entrevista.getCandidato().getId();
            this.avaliador = entrevista.getAvaliador();
            this.dataHora = entrevista.getDataHora();
            this.feedback = entrevista.getFeedback();
        }


    }
}
