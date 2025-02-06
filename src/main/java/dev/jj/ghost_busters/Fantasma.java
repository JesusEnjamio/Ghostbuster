package dev.jj.ghost_busters;
import java.time.LocalDateTime;

public class Fantasma {
    private int id;
    private String nombre;
    private String clase;
    private String nivelPeligro;
    private String habilidad;
    private LocalDateTime fechaCaptura;

    public Fantasma(int id, String nombre, String clase, String nivelPeligro, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.clase = clase;
        this.nivelPeligro = nivelPeligro;
        this.habilidad = habilidad;
        this.fechaCaptura = LocalDateTime.now();
    }
   
}