package com.exo.correction.data.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

/**
 * @author Abderrahmane
 */

@Entity
@Table(name = "genre", schema = "iscae_sb_db", catalog = "")
public class GenreEntity {
    private int id;
    private String code;
    private Collection<PersonneEntity> personnesById;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreEntity that = (GenreEntity) o;
        return id == that.id && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }

    @OneToMany(mappedBy = "genreByIdGenre")
    public Collection<PersonneEntity> getPersonnesById() {
        return personnesById;
    }

    public void setPersonnesById(Collection<PersonneEntity> personnesById) {
        this.personnesById = personnesById;
    }
}
