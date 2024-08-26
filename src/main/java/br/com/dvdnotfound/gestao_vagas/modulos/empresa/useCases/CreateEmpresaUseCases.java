package br.com.dvdnotfound.gestao_vagas.modulos.empresa.useCases;

import br.com.dvdnotfound.gestao_vagas.modulos.candidatos.exceptions.UserFoundException;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.entities.EmpresaEntity;
import br.com.dvdnotfound.gestao_vagas.modulos.empresa.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateEmpresaUseCases {

    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaEntity execute(EmpresaEntity empresaEntity) {
        this.empresaRepository.findByUsernameOrEmail(empresaEntity.getUsername(), empresaEntity.getEmail())
                .ifPresent(user -> {
                    throw new UserFoundException();
                });

        return this.empresaRepository.save(empresaEntity);
    }
}
