package com.iscae.gestionMdl.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Table(name = "test")
@Data
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "nom", nullable = false, length = 500)
    private String nom;
    @Column(name = "prenom", nullable = false, length = 2000)
    private String prenom;

    @OneToMany(mappedBy = "testByIdTest")
    private Collection<TestChildEntity> testChildsById;

}