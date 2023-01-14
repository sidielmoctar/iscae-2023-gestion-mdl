package com.exo.correction.exercice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo6Controller {

    @GetMapping("exo6/{nbr}")
    public String hello(@PathVariable("nbr") Integer nbr) {
        return "Le carré est : " + (nbr * nbr);
    }

}
