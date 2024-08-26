package br.com.dvdnotfound.gestao_vagas.modulos.empresa.useCases;

import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.JobEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCases {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
