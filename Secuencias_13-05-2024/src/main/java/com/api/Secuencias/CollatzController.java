/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.Secuencias;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollatzController {

    @GetMapping("/api/secuence/collatz/{input}")
    public ResponseEntity<?> collatzSequence(@PathVariable int input) {
        
        int originalIntput = input;
        
        StringBuilder secuence = new StringBuilder();
        while (input != 1) {
            secuence.append(input).append(" ");
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = 3 * input + 1;
            }
        }
        secuence.append(1);
        
        Map<String, Object> jsonResponse = new HashMap<>();
            jsonResponse.put("input",originalIntput);
             jsonResponse.put("secuence", secuence.toString());
            
        
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }

    String collatzSecuence(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
