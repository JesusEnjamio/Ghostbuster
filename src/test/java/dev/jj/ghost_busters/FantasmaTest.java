package dev.jj.ghost_busters;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FantasmaTest {

    @Test
    public void testConstructor() {
        int id = 1;
        String nombre = "espiritu del pescador";
        String clase = "Clase I";
        String nivelPeligro = "Bajo";
        String habilidad = "Invisibilidad";

       
        Fantasma fantasma = new Fantasma(id, nombre, clase, nivelPeligro, habilidad);

       
        assertThat(fantasma, notNullValue());
    }

    @Test
    public void testGetters() {
        int id = 1;
        String nombre = "espiritu del pescador";
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
    @Test
    public void testToString() {
        int id = 2;
        String nombre = "frurulas";
        String clase = "Clase II";
        String nivelPeligro = "Alto";
        String habilidad = "Poseer";

        Fantasma fantasma = new Fantasma(id, nombre, clase, nivelPeligro, habilidad);
        String resultado = fantasma.toString();

        assertThat(resultado, containsString(Integer.toString(id)));
        assertThat(resultado, containsString(nombre));
        assertThat(resultado, containsString(clase));
        assertThat(resultado, containsString(nivelPeligro));
    }
}