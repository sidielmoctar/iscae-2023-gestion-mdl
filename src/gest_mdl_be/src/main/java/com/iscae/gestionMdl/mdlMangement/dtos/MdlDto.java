package com.iscae.gestionMdl.mdlMangement.dtos;

import com.iscae.gestionMdl.data.entities.ModuleEntity;
import lombok.Builder;
import lombok.Data;

/**
 * @author Abderrahmane
 */
@Data
@Builder
public class MdlDto {
    private Integer id;
    private String lib;
    private Integer coef;
    private String libSemestre;

    public static ModuleEntity toModuleEntity(MdlDto mdlDto) {
        return ModuleEntity.builder()
                .id(mdlDto.getId())
                .lib(mdlDto.getLib())
                .coef(mdlDto.getCoef())
                .build();
    }





}
