package com.iscae.gestionMdl.data.entities;

import com.iscae.gestionMdl.mdlMangement.dtos.MatiereDto;
import com.iscae.gestionMdl.mdlMangement.dtos.MdlDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Objects;

/**
 * @author Abderrahmane
 */
@Builder(toBuilder = true)
@AllArgsConstructor
@Entity
@Table(name = "matiere", schema = "iscae_sb_db", catalog = "")
public class MatiereEntity {
    private Integer id;
    private String lib;
    private Integer idModule;
    private Integer idProfesseur;
    private ModuleEntity moduleByIdModule;
    private ProfesseursEntity professeursByIdProfesseur;
    private Integer credit;

    public MatiereEntity() {

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
    @Column(name = "id_module")
    public Integer getIdModule() {
        return idModule;
    }

    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }

    @Basic
    @Column(name = "id_professeur")
    public Integer getIdProfesseur() {
        return idProfesseur;
    }

    public void setIdProfesseur(Integer idProfesseur) {
        this.idProfesseur = idProfesseur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatiereEntity that = (MatiereEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(lib, that.lib) && Objects.equals(idModule, that.idModule) && Objects.equals(idProfesseur, that.idProfesseur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lib, idModule, idProfesseur);
    }

    @ManyToOne
    @JoinColumn(name = "id_module", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public ModuleEntity getModuleByIdModule() {
        return moduleByIdModule;
    }

    public void setModuleByIdModule(ModuleEntity moduleByIdModule) {
        this.moduleByIdModule = moduleByIdModule;
    }

    @ManyToOne
    @JoinColumn(name = "id_professeur", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public ProfesseursEntity getProfesseursByIdProfesseur() {
        return professeursByIdProfesseur;
    }

    public void setProfesseursByIdProfesseur(ProfesseursEntity professeursByIdProfesseur) {
        this.professeursByIdProfesseur = professeursByIdProfesseur;
    }

    public MatiereDto toMaitierDto(MatiereEntity matiereEntity) {
        return MatiereDto.builder()
                .id(matiereEntity.getId())
                .idMdl(matiereEntity.getIdModule())
                .lib(matiereEntity.getLib())
                .cred(matiereEntity.getCredit())
                .idProf(matiereEntity.getProfesseursByIdProfesseur().getId())
                .nomProf(matiereEntity.getProfesseursByIdProfesseur().getNom())
                .build();
    }

    @Basic
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
