package com.iscae.gestionMdl.mdlMangement.controllers;

import com.iscae.gestionMdl.mdlMangement.dtos.MatiereDto;
import com.iscae.gestionMdl.mdlMangement.dtos.MdlDto;
import com.iscae.gestionMdl.mdlMangement.services.MatiereService;
import com.iscae.gestionMdl.mdlMangement.services.MdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void add(@RequestBody MatiereDto matiereDto) {
        matiereService.add(matiereDto);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody MatiereDto matiereDto, @PathVariable("id") Integer id) {
        matiereService.update(matiereDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        matiereService.delete(id);
    }



}
