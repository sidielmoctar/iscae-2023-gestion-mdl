package com.iscae.gestionMdl.mdlMangement.dtos;

import com.iscae.gestionMdl.data.entities.MatiereEntity;
import com.iscae.gestionMdl.data.entities.ModuleEntity;
import lombok.Builder;
import lombok.Data;

/**
 * @author Abderrahmane
 */
@Data
@Builder
public class MatiereDto {
    private Integer id;
    private Integer idMdl;
    private String lib;
    private Integer cred;
    private Integer idProf;
    private String nomProf;

    public MatiereEntity toMatierEntity(MatiereDto matiereDto) {
        return MatiereEntity.builder()
                .idModule(matiereDto.getIdMdl())
                .lib(matiereDto.getLib())
                .idProfesseur(matiereDto.getIdProf())
                .credit(matiereDto.getCred())
                .build();
    }
}
