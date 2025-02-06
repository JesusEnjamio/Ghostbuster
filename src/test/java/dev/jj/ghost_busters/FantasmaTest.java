package dev.jj.ghost_busters;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.LocalDateTime;

public class FantasmaTest {
    @Test
public void testConstructorInicializaAtributosCorrectamente() {
    int id = 1;
    String nombre = "Casper";
    String clase = "Clase I";
    String nivelPeligro = "Bajo";
    String habilidad = "Invisibilidad";

    Fantasma fantasma = new Fantasma(id, nombre, clase, nivelPeligro, habilidad);

    
}
}
