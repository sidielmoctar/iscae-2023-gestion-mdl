package com.exo.correction.exercice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Abderrahmane
 */

@Controller
@RequestMapping("solution")
@ResponseBody
public class Exo1Controller {

//   @RequestMapping(path = "exo1",
//           method = RequestMethod.GET)
   @RequestMapping("exo1")
   public String hello() {
         return "Hello world";
      }

}
