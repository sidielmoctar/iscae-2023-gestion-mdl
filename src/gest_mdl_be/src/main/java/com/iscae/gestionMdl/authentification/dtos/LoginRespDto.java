package com.iscae.gestionMdl.authentification.dtos;

import lombok.Data;

/**
 * @author Abderrahmane
 */
@Data
public class LoginRespDto {
    private Integer id;
    private Boolean status;
    private String token;
    private String message;
    private InfosPersoDto data;
}
