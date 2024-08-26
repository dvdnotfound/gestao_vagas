package br.com.dvdnotfound.gestao_vagas.modulos.empresa.repositories;

import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

}
