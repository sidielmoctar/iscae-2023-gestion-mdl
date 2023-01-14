package com.iscae.gestionMdl.data.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

/**
 * @author Abderrahmane
 */

@Entity
@Table(name = "professeurs", schema = "iscae_sb_db", catalog = "")
public class ProfesseursEntity {
    private Integer id;
    private String nom;
    private Collection<MatiereEntity> matieresById;

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
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfesseursEntity that = (ProfesseursEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @OneToMany(mappedBy = "professeursByIdProfesseur")
    public Collection<MatiereEntity> getMatieresById() {
        return matieresById;
    }

    public void setMatieresById(Collection<MatiereEntity> matieresById) {
        this.matieresById = matieresById;
    }
}
