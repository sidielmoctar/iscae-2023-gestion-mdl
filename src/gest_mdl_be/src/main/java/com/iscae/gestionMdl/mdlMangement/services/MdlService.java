package com.iscae.gestionMdl.mdlMangement.services;

import com.iscae.gestionMdl.data.repository.ModuleRepository;
import com.iscae.gestionMdl.mdlMangement.dtos.MdlDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abderrahmane
 */
@Service
public class MdlService {
    private final ModuleRepository moduleRepository;

    public MdlService(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }

    public List<MdlDto> getModules() {
        return moduleRepository.findAll().stream()
                .map(m -> m.toModuleDto(m))
                .collect(Collectors.toList());
    }


}
