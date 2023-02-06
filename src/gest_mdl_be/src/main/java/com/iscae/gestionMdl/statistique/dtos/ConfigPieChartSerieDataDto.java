package com.iscae.gestionMdl.statistique.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Abderrahmane
 */
@Data
@AllArgsConstructor
public class ConfigPieChartSerieDataDto {
   private String name;
   private Integer y;
}
