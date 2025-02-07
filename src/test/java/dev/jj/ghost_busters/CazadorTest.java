package dev.jj.ghost_busters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class CazadorTest {
    private Cazador cazador;

    @BeforeEach
    public void setUp() {
        cazador = new Cazador();
    }

    @Test
    public void testCapturarFantasma() {
      
        String input = "Casper\n1\nBajo\nVolar\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        cazador.capturarFantasma(scanner);

        
        List<Fantasma> fantasmas = cazador.getFantasmas();
        assertEquals(1, fantasmas.size());
        assertEquals("Casper", fantasmas.get(0).getNombre());
        scanner.close();
    }

    @Test
    public void testListarFantasmas() {
        Fantasma fantasma = new Fantasma(1, "Casper", "Clase I", "Bajo", "Volar");
        cazador.getFantasmas().add(fantasma);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
      
        cazador.listarFantasmas();
        
        String output = outputStream.toString();
  
        assertTrue(output.contains("Casper"));
        assertTrue(output.contains("Clase I"));
        assertTrue(output.contains("Bajo"));
    }

    @Test
    public void testLiberarFantasma() {
        
        Fantasma fantasma = new Fantasma(1, "Casper", "Clase I", "Bajo", "Volar");
        cazador.getFantasmas().add(fantasma);

        
        String input = "1\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        cazador.liberarFantasma(scanner);

       
        List<Fantasma> fantasmas = cazador.getFantasmas();
        assertEquals(0, fantasmas.size());
        scanner.close();
    }
}