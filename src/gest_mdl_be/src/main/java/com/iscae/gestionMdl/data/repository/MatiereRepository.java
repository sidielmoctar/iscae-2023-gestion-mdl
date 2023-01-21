package com.iscae.gestionMdl.data.repository;

import com.iscae.gestionMdl.data.entities.MatiereEntity;
import com.iscae.gestionMdl.data.entities.ModuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(exported = false)
public interface MatiereRepository
        extends JpaRepository<MatiereEntity, Integer> {

    List<MatiereEntity> findAllByIdModule(Integer idMdl);

}
