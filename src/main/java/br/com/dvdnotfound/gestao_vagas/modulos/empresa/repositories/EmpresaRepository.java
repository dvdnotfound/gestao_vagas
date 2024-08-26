package br.com.dvdnotfound.gestao_vagas.modulos.empresa.repositories;


import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.CandidatoEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.EmpresaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface EmpresaRepository extends JpaRepository<EmpresaEntity, UUID> {
    Optional<EmpresaEntity> findByUsernameOrEmail(String username, String email);
}
