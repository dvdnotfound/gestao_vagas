package br.com.dvdnotfound.gestao_vagas.modulos.empresa.controller;


import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.EmpresaEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.useCases.CreateEmpresaUseCases;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private CreateEmpresaUseCases createEmpresaUseCases;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody EmpresaEntity empresaEntity) {
        try {
            var result = this.createEmpresaUseCases.execute(empresaEntity);
            return ResponseEntity.ok().body(result);
        } catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
