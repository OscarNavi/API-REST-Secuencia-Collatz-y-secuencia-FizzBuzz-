/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.Secuencias;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class CollatzControllerTest {

    @InjectMocks
    private CollatzController collatzController;

    @Before
    public void setUp() {
        // No se requiere configuración de servicio mock
    }

    @Test
    public void testCollatzSequence_3() {
        String expected = "3 10 5 16 8 4 2 1";
        String result = collatzController.collatzSequence(3).getBody().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testCollatzSequence_15() {
        String expected = "15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1";
        String result = collatzController.collatzSequence(15).getBody().toString();
        assertEquals(expected, result);
    }

    @Test
    public void testCollatzSequence_100() {
        String expected = "100 50 25 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1";
        String result = collatzController.collatzSequence(100).getBody().toString();
        assertEquals(expected, result);
    }
}
