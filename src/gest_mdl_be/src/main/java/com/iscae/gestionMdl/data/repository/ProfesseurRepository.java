package com.iscae.gestionMdl.data.repository;

import com.iscae.gestionMdl.data.entities.ModuleEntity;
import com.iscae.gestionMdl.data.entities.ProfesseursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(exported = false)
public interface ProfesseurRepository
        extends JpaRepository<ProfesseursEntity, Integer> {


}
