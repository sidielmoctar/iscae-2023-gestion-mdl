package com.iscae.gestionMdl.mdlMangement.controllers;

import com.iscae.gestionMdl.mdlMangement.dtos.MdlDto;
import com.iscae.gestionMdl.mdlMangement.services.MdlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Abderrahmane
 */
@RestController
@RequestMapping("gest-module")
public class MdlController {
    private final MdlService mdlService;

    public MdlController(MdlService mdlService) {
        this.mdlService = mdlService;
    }

    @GetMapping
    public List<MdlDto> getModules() {
        return mdlService.getModules();
    }
}
