package com.exo.correction.exercice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo5Controller {

   @GetMapping("exo5")
   public String hello(@RequestParam(value = "nombre1", defaultValue = "15") Integer nombre1,
                       @RequestParam(value = "nombre2", required = false) Integer nombre2) {

       nombre2 = nombre2 != null ? nombre2 : 0;

       return "La somme est : " + (nombre1 + nombre2);
      }

}
