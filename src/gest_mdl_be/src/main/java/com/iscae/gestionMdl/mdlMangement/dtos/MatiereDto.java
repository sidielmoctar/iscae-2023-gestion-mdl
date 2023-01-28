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
        return toMatiereEntity_(matiereDto, new MatiereEntity());
    }

    public MatiereEntity toMatierEntity(MatiereDto matiereDto, MatiereEntity matiereEntity) {
        return toMatiereEntity_(matiereDto, matiereEntity);
    }

    private static MatiereEntity toMatiereEntity_(MatiereDto matiereDto, MatiereEntity matiereEntity) {
        return matiereEntity.toBuilder()
                .idModule(matiereDto.getIdMdl())
                .lib(matiereDto.getLib())
                .idProfesseur(matiereDto.getIdProf())
                .credit(matiereDto.getCred())
                .build();
    }
}
