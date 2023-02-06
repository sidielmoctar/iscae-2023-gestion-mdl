package com.iscae.gestionMdl.statistique.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Abderrahmane
 */
@Data
@AllArgsConstructor
public class ConfigColumnChartDto {
   private String titre;
   private String yTitle;
   private List<ConfigColumnChartSerieDto> series;
}
