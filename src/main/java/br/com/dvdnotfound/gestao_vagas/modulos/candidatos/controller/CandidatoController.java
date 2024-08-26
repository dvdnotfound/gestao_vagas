package br.com.dvdnotfound.gestao_vagas.modulos.candidatos.controller;

import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.CandidatoEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.useCases.CreateCandidatoUseCases;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    @Autowired
    private CreateCandidatoUseCases createCandidatoUseCases;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidatoEntity candidatoEntity) {
        try{
            var result = this.createCandidatoUseCases.execute(candidatoEntity);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
