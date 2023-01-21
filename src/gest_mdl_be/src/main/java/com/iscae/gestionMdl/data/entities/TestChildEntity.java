package com.iscae.gestionMdl.data.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "test_child")
@Data
public class TestChildEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "id_test", nullable = false)
    private Integer idTest;

    @ManyToOne
    @JoinColumn(name = "id_test", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    TestEntity testByIdTest;

}