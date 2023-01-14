package com.iscae.gestionMdl.data.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

/**
 * @author Abderrahmane
 */

@Entity
@Table(name = "semestre", schema = "iscae_sb_db", catalog = "")
public class SemestreEntity {
    private Integer id;
    private String lib;
    private Collection<ModuleEntity> modulesById;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "lib")
    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemestreEntity that = (SemestreEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(lib, that.lib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lib);
    }

    @OneToMany(mappedBy = "semestreByIdSemestre")
    public Collection<ModuleEntity> getModulesById() {
        return modulesById;
    }

    public void setModulesById(Collection<ModuleEntity> modulesById) {
        this.modulesById = modulesById;
    }
}
