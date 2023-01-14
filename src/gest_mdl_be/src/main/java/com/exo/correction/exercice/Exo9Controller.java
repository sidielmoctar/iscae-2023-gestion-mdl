package com.exo.correction.exercice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Abderrahmane
 */

@RestController
public class Exo9Controller {



    @PostMapping("exo9_1")
    public String part1(@RequestBody Map<String, Object> userObj) {

        return "Ok";
    }

    @PostMapping("exo9_2")
    public String part2(@RequestBody UserDto userObj) {

        return "Ok";
    }

}
