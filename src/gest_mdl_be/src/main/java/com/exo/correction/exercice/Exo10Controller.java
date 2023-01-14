package com.exo.correction.exercice;

import com.exo.correction.data.entity.PersonneEntity;
import com.exo.correction.exercice.data.UserRepository;
import com.exo.correction.data.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Abderrahmane
 */

@RestController
@RequestMapping("exo10")
public class Exo10Controller {

    UserRepository userRepository;
    private final PersonneRepository personneRepository;

    @Autowired
    public Exo10Controller(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
        userRepository = new UserRepository();
    }

//    Tous les users
    @GetMapping
    public List<PersonneEntity> getAll() {
        return personneRepository.findAll();
    }

//    User by id
    @GetMapping("/{id}")
    public UserDto getById(@PathVariable("id") int id) {
        return userRepository.getUserById(id);
    }

//    ajout user

    @PostMapping
    List<UserDto> add( @RequestBody UserDto  userDto ) {
         return userRepository.add(userDto);
    }

//    update user

    @PutMapping("/{id}")
    List<UserDto> update( @RequestBody UserDto  userDto,  @PathVariable("id") int id) {
        return userRepository.update(userDto, id);
    }

//    delete user






}
