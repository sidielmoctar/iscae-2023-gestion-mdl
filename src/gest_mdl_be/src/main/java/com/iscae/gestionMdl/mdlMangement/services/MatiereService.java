package com.iscae.gestionMdl.mdlMangement.services;

import com.iscae.gestionMdl.data.entities.MatiereEntity;
import com.iscae.gestionMdl.data.repository.MatiereRepository;
import com.iscae.gestionMdl.mdlMangement.dtos.MatiereDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abderrahmane
 */
@Service
public class MatiereService {
    private final MatiereRepository matiereRepository;

    public MatiereService(MatiereRepository matiereRepository) {
        this.matiereRepository = matiereRepository;
    }

    public List<MatiereDto> getMatieres(Integer idMdl) {
        return matiereRepository.findAllByIdModule(idMdl).stream()
                .map(m -> m.toMaitierDto(m))
                .collect(Collectors.toList());
    }


    public void add(MatiereDto matiereDto) {
        matiereRepository.save(matiereDto.toMatierEntity(matiereDto));
    }

    public void update(MatiereDto matiereDto, Integer id) {
        MatiereEntity matiereEntity = matiereRepository.findById(id).orElseThrow();
        matiereRepository.save(matiereDto.toMatierEntity(matiereDto, matiereEntity));
    }

    public void delete(Integer id) {
        matiereRepository.deleteById(id);
    }
}
