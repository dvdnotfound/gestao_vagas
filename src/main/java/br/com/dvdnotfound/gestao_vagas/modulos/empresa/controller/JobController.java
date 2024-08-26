package br.com.dvdnotfound.gestao_vagas.modulos.empresa.controller;

import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.JobEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.repositories.JobRepository;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.useCases.CreateJobUseCases;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private CreateJobUseCases createJobUseCases;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
        return this.createJobUseCases.execute(jobEntity);
    }
}
