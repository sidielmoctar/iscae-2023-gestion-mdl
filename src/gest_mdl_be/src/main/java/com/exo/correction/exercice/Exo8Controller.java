package com.exo.correction.exercice;

import com.exo.correction.exercice.dtos.LoginUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo8Controller {

   @GetMapping("exo8")
   public String hello(LoginUser loginUser, String tel, String email) {

       return "Ok";
      }

}
