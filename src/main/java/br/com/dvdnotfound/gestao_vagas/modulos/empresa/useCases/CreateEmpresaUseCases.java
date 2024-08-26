package br.com.dvdnotfound.gestao_vagas.modulos.empresa.useCases;

import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.exceptions.UserFoundException;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.EmpresaEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateEmpresaUseCases {

    @Autowired
    private EmpresaRepository empresaRepository;

    private void execute(EmpresaEntity empresaEntity) {
        this.empresaRepository.findByUsernameOrEmail(empresaEntity.getUsername(), empresaEntity.getEmail())
                .ifPresent(user -> {
                    throw new UserFoundException();
                });

        this.empresaRepository.save(empresaEntity);
    }
}
