package dev.jj.ghost_busters;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDateTime;

public class FantasmaTest {
    @Test
    public void testConstructor() {
        int id = 1;
        String nombre = "Casper";
        String clase = "Clase I";
        String nivelPeligro = "Bajo";
        String habilidad = "Invisibilidad";

        Fantasma fantasma = new Fantasma(id, nombre, clase, nivelPeligro, habilidad);

    }

    @Test
    public void testGetters() {
        int id = 1;
        String nombre = "Casper";
        String clase = "Clase I";
        String nivelPeligro = "Bajo";
        String habilidad = "Invisibilidad";

        Fantasma fantasma = new Fantasma(id, nombre, clase, nivelPeligro, habilidad);

        assertThat(fantasma.getId(), equalTo(id));
        assertThat(fantasma.getNombre(), equalTo(nombre));
        assertThat(fantasma.getClase(), equalTo(clase));
        assertThat(fantasma.getNivelPeligro(), equalTo(nivelPeligro));
        assertThat(fantasma.getHabilidad(), equalTo(habilidad));
    }

}
