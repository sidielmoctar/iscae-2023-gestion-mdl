package com.iscae.gestionMdl.mdlMangement.dtos;

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
    private String lib;
    private Integer cred;
    private Integer idProf;
    private String nomProf;

}
