package dev.jj.ghost_busters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        
        String input = "Casper\n1\nBajo\nVolar\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Scanner scanner = new Scanner(System.in);
        cazador.capturarFantasma(scanner);
        

        
    }
    @Test
public void testListarFantasmas() {
    // Simular entrada del usuario para capturar un fantasma
    String input = "Casper\n1\nBajo\nVolar\n"; // Nombre, Clase, Nivel de Peligro, Habilidad
    ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
    System.setIn(inputStream);

    // Crear un Scanner con la entrada simulada
    Scanner scanner = new Scanner(System.in);
    cazador.capturarFantasma(scanner);

    // Redirigir la salida estándar a un ByteArrayOutputStream para capturarla
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));

    // Llamar al método listarFantasmas
    cazador.listarFantasmas();

    // Obtener la salida generada por el método
    String output = outputStream.toString();

    // Verificar que la salida contiene los valores esperados
    assertTrue(output.contains("Casper"));
    assertTrue(output.contains("Clase I"));
    assertTrue(output.contains("Bajo"));

    scanner.close();
}
}