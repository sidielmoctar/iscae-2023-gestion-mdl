package com.iscae.gestionMdl.referentiel.controllers;

import com.iscae.gestionMdl.data.repository.ProfesseurRepository;
import com.iscae.gestionMdl.mdlMangement.dtos.MatiereDto;
import com.iscae.gestionMdl.mdlMangement.services.MatiereService;
import com.iscae.gestionMdl.referentiel.dtos.RefDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abderrahmane
 */
@RestController
@RequestMapping("referentiel")
public class ReferentielController {
    @Autowired
    private final ProfesseurRepository professeurRepository;

    public ReferentielController(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    @GetMapping("professeurs")
    public List<RefDto> getProfesseurs() {
        return professeurRepository.findAll().stream()
                .map(p -> p.toProfesseurDto(p)).collect(Collectors.toList());
    }
}
