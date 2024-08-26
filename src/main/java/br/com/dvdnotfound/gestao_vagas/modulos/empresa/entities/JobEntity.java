package br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity(name = "vagas")
@Data
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String descricao;
    private String beneficios;
    private String level;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false, insertable = false, updatable = false)
    private EmpresaEntity empresaEntity;

    @Column(name="empresa_id")
    private UUID empresaID;

    @CreationTimestamp
    private LocalDateTime dtc_criacao;
}


