package com.exo.correction.exercice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo4Controller {

   @GetMapping("exo4")
   public String hello(@RequestParam("nombre1") Integer nombre1,
                       @RequestParam("nombre2") Integer nombre2) {
         return "La somme est : " + (nombre1 + nombre2);
      }

}
