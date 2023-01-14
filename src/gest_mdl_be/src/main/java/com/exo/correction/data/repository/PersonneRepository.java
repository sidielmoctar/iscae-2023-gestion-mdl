package com.exo.correction.data.repository;

import com.exo.correction.data.entity.PersonneEntity;
import com.exo.correction.exercice.dtos.PersonneDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RepositoryRestResource(exported = false)
public interface PersonneRepository
        extends JpaRepository<PersonneEntity, Integer> {

    @Query("select new com.exo.correction.exercice.dtos.PersonneDto(" +
            "p.id, p.prenom, p.nom, p.tel, " +
            "p.email, " +
            "p.idGenre," +
            "p.genreByIdGenre.code) " +
            "from PersonneEntity p ")
    List<PersonneDto> findAllCustom();

    @Query(value = " select p.id, p.prenom, p.nom, p.tel, " +
            "p.email, p.id_genre as idGenre, g.code as codeGenre " +
            "from personne p join " +
            " genre g on g.id = p.id_genre ",
            nativeQuery = true)
    List<Map<String, Object>> findAllNative();

    @Query("select p from PersonneEntity p where p.id =:idPersonne ")
    Optional<PersonneEntity> findByIdCustom(Integer idPersonne);

    @Query("select p from PersonneEntity p where p.nom =:name ")
    Optional<PersonneEntity> findByNameCustom(String name);

    Optional<PersonneEntity> findByNom(String name);
}
