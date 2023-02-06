package com.iscae.gestionMdl.statistique.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Abderrahmane
 */
@Data
@AllArgsConstructor
public class ConfigPieChartDto {
   private String titre;
   private List<ConfigPieChartSerieDataDto> seriesData;
}
