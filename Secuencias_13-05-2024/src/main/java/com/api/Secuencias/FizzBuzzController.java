package com.api.Secuencias;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    @GetMapping("/api/secuence/fizzbuzz/{input}")
    public ResponseEntity<?> fizzBuzzSequence(@PathVariable int input) {
        StringBuilder secuence = new StringBuilder();
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                secuence.append("FizzBuzz ");
            } else if (i % 3 == 0) {
                secuence.append("Fizz ");
            } else if (i % 5 == 0) {
                secuence.append("Buzz ");
            } else {
                secuence.append(i).append(" ");
            }
        }
        
        Map<String, Object> jsonResponse = new HashMap<>();
        jsonResponse.put("input", input);
        jsonResponse.put("sequence", secuence.toString());

        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}