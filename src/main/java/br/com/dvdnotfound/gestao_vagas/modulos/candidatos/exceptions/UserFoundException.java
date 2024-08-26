package br.com.dvdnotfound.gestao_vagas.modulos.candidatos.exceptions;

public class UserFoundException extends RuntimeException{
    public UserFoundException() {
        super("Usuário já existe");
    }
}
