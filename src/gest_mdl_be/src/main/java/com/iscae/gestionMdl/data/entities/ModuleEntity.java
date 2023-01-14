package com.iscae.gestionMdl.data.entities;

import com.iscae.gestionMdl.mdlMangement.dtos.MdlDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Objects;

/**
 * @author Abderrahmane
 */
@Builder
@AllArgsConstructor
@Entity
@Table(name = "module", schema = "iscae_sb_db", catalog = "")
public class ModuleEntity {
    private Integer id;
    private String lib;
    private Integer coef;
    private Integer idSemestre;
    private Collection<MatiereEntity> matieresById;
    private SemestreEntity semestreByIdSemestre;

    public ModuleEntity() {

    }

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

    @Basic
    @Column(name = "coef")
    public Integer getCoef() {
        return coef;
    }

    public void setCoef(Integer coef) {
        this.coef = coef;
    }

    @Basic
    @Column(name = "id_semestre")
    public Integer getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(Integer idSemestre) {
        this.idSemestre = idSemestre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModuleEntity that = (ModuleEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(lib, that.lib) && Objects.equals(coef, that.coef) && Objects.equals(idSemestre, that.idSemestre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lib, coef, idSemestre);
    }

    @OneToMany(mappedBy = "moduleByIdModule")
    public Collection<MatiereEntity> getMatieresById() {
        return matieresById;
    }

    public void setMatieresById(Collection<MatiereEntity> matieresById) {
        this.matieresById = matieresById;
    }

    @ManyToOne
    @JoinColumn(name = "id_semestre", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public SemestreEntity getSemestreByIdSemestre() {
        return semestreByIdSemestre;
    }

    public void setSemestreByIdSemestre(SemestreEntity semestreByIdSemestre) {
        this.semestreByIdSemestre = semestreByIdSemestre;
    }

    public MdlDto toModuleEntity(ModuleEntity moduleEntity) {
        return MdlDto.builder()
                .id(moduleEntity.getId())
                .lib(moduleEntity.getLib())
                .coef(moduleEntity.getCoef())
                .libSemestre(moduleEntity.getSemestreByIdSemestre().getLib())
                .build();
    }
}
