package com.exo.correction.exercice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo3Controller {

   @RequestMapping("exo3")
   public String hello() {
         return "Hello world from exo 3";
      }

}
