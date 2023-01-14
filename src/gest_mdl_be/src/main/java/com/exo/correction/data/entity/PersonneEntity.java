package com.exo.correction.data.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author Abderrahmane
 */

@Entity
@Table(name = "personne", schema = "iscae_sb_db", catalog = "")
public class PersonneEntity {
    private int id;
    private String prenom;
    private String nom;
    private String tel;
    private String email;
    private int idGenre;
    private GenreEntity genreByIdGenre;

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
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "id_genre")
    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonneEntity that = (PersonneEntity) o;
        return id == that.id && idGenre == that.idGenre && Objects.equals(prenom, that.prenom) && Objects.equals(nom, that.nom) && Objects.equals(tel, that.tel) && Objects.equals(email, that.email)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prenom, nom, tel, email,
                idGenre);
    }

    @ManyToOne
    @JoinColumn(name = "id_genre", referencedColumnName = "id", nullable = false,
            insertable = false, updatable = false)
    public GenreEntity getGenreByIdGenre() {
        return genreByIdGenre;
    }

    public void setGenreByIdGenre(GenreEntity genreByIdGenre) {
        this.genreByIdGenre = genreByIdGenre;
    }
}
