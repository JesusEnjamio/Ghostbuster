package dev.jj.ghost_busters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cazador {
    private List<Fantasma> fantasmas; // Lista que almacena todos los fantasmas capturados
    private int contadorId; // Contador para asignar IDs únicos a los fantasmas

    public Cazador() {
        fantasmas = new ArrayList<>();
        contadorId = 1;
    }

    // Capturar un nuevo fantasma
    public void capturarFantasma(Scanner scanner) {
        System.out.println("Ingresa el nombre del fantasma:");
        String nombre = scanner.nextLine();

        System.out.println("Selecciona la clase del fantasma:");
        System.out.println("1. Clase I - Manifestación menor");
        System.out.println("2. Clase II - Aparición móvil");
        System.out.println("3. Clase III - Entidad inteligente");
        System.out.println("4. Clase IV - Fantasma histórico");
        System.out.println("5. Clase V - Espíritu antropomorfo");
        System.out.println("6. Clase VI - Espíritu demoníaco");
        System.out.println("7. Clase VII - Entidad ultraterrena");
        int opcionClase = Integer.parseInt(scanner.nextLine());
        String[] clases = {"Clase I", "Clase II", "Clase III", "Clase IV", "Clase V", "Clase VI", "Clase VII"};
        String clase = clases[opcionClase - 1];

        System.out.println("Nivel de peligro (Bajo, Medio, Alto, Crítico):");
        String nivelPeligro = scanner.nextLine();

        System.out.println("Habilidad especial del fantasma:");
        String habilidad = scanner.nextLine();

        Fantasma fantasma = new Fantasma(contadorId++, nombre, clase, nivelPeligro, habilidad);
        fantasmas.add(fantasma);
        System.out.println("Fantasma \"" + nombre + "\" capturado exitosamente.");
    }

}
