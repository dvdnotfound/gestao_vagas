package br.com.dvdnotfound.gestao_vagas.modulos.candidatos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name= "candidato")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @NotBlank
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;

    @Email(message = "O campo [email] deter conter um e-mail válido")
    private String email;

    @Length(min = 10, max = 100, message = "O campo [senha] deve conter entre 10 e 100 caracteres")
    private String senha;

    private String descricao;
    private String curriculo;

    @CreationTimestamp
    private LocalDateTime dtc_criacao;
}
