package br.com.dvdnotfound.gestao_vagas.modulos.candidatos.useCases;

import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.CandidatoEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.CandidatoRepository;
import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.exceptions.UserFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCandidatoUseCases {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public CandidatoEntity execute(@Valid CandidatoEntity candidatoEntity){
        this.candidatoRepository
                .findByUsernameOrEmail(candidatoEntity.getUsername(), candidatoEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });
        return this.candidatoRepository.save(candidatoEntity);
    }
}
