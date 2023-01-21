package com.iscae.gestionMdl.mdlMangement.controllers;

import com.iscae.gestionMdl.mdlMangement.dtos.MatiereDto;
import com.iscae.gestionMdl.mdlMangement.dtos.MdlDto;
import com.iscae.gestionMdl.mdlMangement.services.MatiereService;
import com.iscae.gestionMdl.mdlMangement.services.MdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Abderrahmane
 */
@RestController
@RequestMapping("gest-matiere")
public class MatiereController {
    @Autowired
    private final MatiereService matiereService;

    public MatiereController(MatiereService matiereService) {
        this.matiereService = matiereService;
    }

    @GetMapping
    public List<MatiereDto> getMatieres(@RequestParam("idMdl") Integer idMdl) {
        return matiereService.getMatieres(idMdl);
    }
}
