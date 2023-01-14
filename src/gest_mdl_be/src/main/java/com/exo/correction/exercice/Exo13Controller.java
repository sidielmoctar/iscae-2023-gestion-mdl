package com.exo.correction.exercice;

import com.exo.correction.data.entity.PersonneEntity;
import com.exo.correction.data.repository.PersonneRepository;
import com.exo.correction.exercice.dtos.PersonneDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Abderrahmane
 */

@RestController
@RequestMapping("exo13")
public class Exo13Controller {

    private final PersonneRepository personneRepository;

    @Autowired
    public Exo13Controller(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @GetMapping
    public List<PersonneDto> getAll() {
        List<PersonneDto> personneDtos = personneRepository
                .findAll()
                .stream()
                .map(p -> {
                    PersonneDto personneDto = new PersonneDto();
                    personneDto.setId(p.getId());
                    personneDto.setNom(p.getNom());
                    personneDto.setPrenom(p.getPrenom());
                    personneDto.setTel(p.getTel());
                    personneDto.setIdGenre(p.getIdGenre());

                    return personneDto;
                }).collect(Collectors.toList());
        return personneDtos;
    }

    @GetMapping("custom")
    public List<PersonneDto> findAllCustom() {
        return personneRepository.findAllCustom();
    }

    @GetMapping("native")
    public List<PersonneDto> findAllNative() {
        List<PersonneDto> personneDtos = personneRepository
                .findAllNative()
                .stream()
                .map(p -> new ObjectMapper().convertValue(p, PersonneDto.class))
                .collect(Collectors.toList());
        return personneDtos;
    }

    @GetMapping("/{id}")
    public PersonneDto byId(@PathVariable("id") Integer id) {
        try {
            PersonneEntity personneEntity = personneRepository.findById(id).orElseThrow();
            PersonneDto personneDto = new PersonneDto();
            personneDto.setId(personneEntity.getId());
            personneDto.setNom(personneEntity.getNom());
            personneDto.setPrenom(personneEntity.getPrenom());
            personneDto.setTel(personneEntity.getTel());
            personneDto.setIdGenre(personneEntity.getIdGenre());

            return personneDto;
        } catch (NoSuchElementException e) {
            System.out.println("L'élement n'existe pas ======================= ");
            return null;
        }
    }

    @GetMapping("custom/{id}")
    public PersonneDto byIdCustom(@PathVariable("id") Integer id) {
        PersonneEntity personneEntity;
        Optional<PersonneEntity> optionalPersonneEntity = personneRepository.findByIdCustom(id);
        if(optionalPersonneEntity.isPresent()) {
            personneEntity = optionalPersonneEntity.get();
            PersonneDto personneDto = new PersonneDto();
            personneDto.setId(personneEntity.getId());
            personneDto.setNom(personneEntity.getNom());
            personneDto.setPrenom(personneEntity.getPrenom());
            personneDto.setTel(personneEntity.getTel());
            personneDto.setIdGenre(personneEntity.getIdGenre());
            return personneDto;
        } else {
            System.out.println("L'élement n'existe pas ======================= ");
            return null;
        }
    }


    @GetMapping("byName")
    public PersonneDto byName(@RequestParam("name") String name) {
        PersonneEntity personneEntity;
        Optional<PersonneEntity> optionalPersonneEntity = personneRepository.findByNom(name);
        if(optionalPersonneEntity.isPresent()) {
            personneEntity = optionalPersonneEntity.get();
            PersonneDto personneDto = new PersonneDto();
            personneDto.setId(personneEntity.getId());
            personneDto.setNom(personneEntity.getNom());
            personneDto.setPrenom(personneEntity.getPrenom());
            personneDto.setTel(personneEntity.getTel());
            personneDto.setIdGenre(personneEntity.getIdGenre());
            return personneDto;
        } else {
            System.out.println("L'élement n'existe pas ======================= ");
            return null;
        }
    }
    @GetMapping("byNameCustom")
    public PersonneDto byNameCustom(@RequestParam("name") String name) {
        PersonneEntity personneEntity;
        Optional<PersonneEntity> optionalPersonneEntity = personneRepository.findByNameCustom(name);
        if(optionalPersonneEntity.isPresent()) {
            personneEntity = optionalPersonneEntity.get();
            PersonneDto personneDto = new PersonneDto();
            personneDto.setId(personneEntity.getId());
            personneDto.setNom(personneEntity.getNom());
            personneDto.setPrenom(personneEntity.getPrenom());
            personneDto.setTel(personneEntity.getTel());
            personneDto.setIdGenre(personneEntity.getIdGenre());
            return personneDto;
        } else {
            System.out.println("L'élement n'existe pas ======================= ");
            return null;
        }
    }

    @PostMapping
    public void add(@RequestBody PersonneDto personneDto) {
        PersonneEntity personneEntity = new PersonneEntity();
        personneEntity.setPrenom(personneDto.getPrenom());
        personneEntity.setNom(personneDto.getNom());
        personneEntity.setTel(personneDto.getTel());
        personneEntity.setEmail(personneDto.getEmail());
        personneEntity.setIdGenre(personneDto.getIdGenre());

        personneRepository.save(personneEntity);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody PersonneDto personneDto, @PathVariable("id") Integer id) {
        PersonneEntity personneEntity = personneRepository.findById(id).orElseThrow();
        personneEntity.setPrenom(personneDto.getPrenom());
        personneEntity.setNom(personneDto.getNom());
        personneEntity.setTel(personneDto.getTel());
        personneEntity.setEmail(personneDto.getEmail());
        personneEntity.setIdGenre(personneDto.getIdGenre());

        personneRepository.save(personneEntity);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        personneRepository.deleteById(id);
    }
}
