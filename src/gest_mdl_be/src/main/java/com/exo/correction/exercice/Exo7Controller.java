package com.exo.correction.exercice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo7Controller {

   @GetMapping("exo7")
   public String hello(String login, String mdp) {

       return "Ok";
      }

}
