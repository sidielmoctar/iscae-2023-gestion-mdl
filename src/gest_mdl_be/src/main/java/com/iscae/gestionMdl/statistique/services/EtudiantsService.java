package com.iscae.gestionMdl.statistique.services;

import com.iscae.gestionMdl.statistique.dtos.ConfigColumnChartDto;
import com.iscae.gestionMdl.statistique.dtos.ConfigColumnChartSerieDto;
import com.iscae.gestionMdl.statistique.dtos.ConfigPieChartDto;
import com.iscae.gestionMdl.statistique.dtos.ConfigPieChartSerieDataDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Abderrahmane
 */
@Service
public class EtudiantsService {

    public ConfigPieChartDto getEtudiantByGenre() {
        List<ConfigPieChartSerieDataDto> serieDataDtos = new ArrayList<>();
        serieDataDtos.add(new ConfigPieChartSerieDataDto("Femme", 52));
        serieDataDtos.add(new ConfigPieChartSerieDataDto("Homme", 48));

        return new ConfigPieChartDto("Les admis par genre", serieDataDtos);
    }

    public ConfigColumnChartDto getEtudiantNoteByMatAndGenre() {
        List<ConfigColumnChartSerieDto> series = new ArrayList<>();
        series.add(new ConfigColumnChartSerieDto("Femme", Arrays.asList(12, 13, 14)));
        series.add(new ConfigColumnChartSerieDto("Homme", Arrays.asList(15, 13, 11)));

        return new ConfigColumnChartDto("Les admis par matière et par genre", "Note", series);
    }

}
