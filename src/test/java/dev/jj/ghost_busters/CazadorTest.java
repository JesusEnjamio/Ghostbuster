package dev.jj.ghost_busters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.*;

import java.util.Scanner; 



public class CazadorTest {
    private Cazador cazador;

    @BeforeEach
    public void setUp() {
        cazador = new Cazador();
    }

    @Test
    public void testCapturarFantasma() {
        // Simular entrada del usuario
        String input = "Casper\n1\nBajo\nVolar\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        cazador.capturarFantasma(scanner);

        
    }
}