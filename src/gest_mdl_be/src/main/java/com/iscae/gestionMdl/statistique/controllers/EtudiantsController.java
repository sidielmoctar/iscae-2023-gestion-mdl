package com.iscae.gestionMdl.statistique.controllers;

import com.iscae.gestionMdl.statistique.dtos.ConfigColumnChartDto;
import com.iscae.gestionMdl.statistique.dtos.ConfigPieChartDto;
import com.iscae.gestionMdl.statistique.services.EtudiantsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */
@RestController
@RequestMapping("etudiants")
public class EtudiantsController {
    private final EtudiantsService etudiantsService;

    public EtudiantsController(EtudiantsService etudiantsService) {
        this.etudiantsService = etudiantsService;
    }

    @GetMapping
    public ConfigPieChartDto getEtudiantByGenre() {
        return etudiantsService.getEtudiantByGenre();
    }

    @GetMapping("byMatAndGenre")
    public ConfigColumnChartDto getEtudiantNoteByMatAndGenre() {
        return etudiantsService.getEtudiantNoteByMatAndGenre();
    }
}
