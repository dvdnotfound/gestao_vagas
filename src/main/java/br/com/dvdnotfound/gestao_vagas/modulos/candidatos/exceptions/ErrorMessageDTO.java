package br.com.dvdnotfound.gestao_vagas.modulos.candidatos.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {

    private String field;
    private String message;
}
