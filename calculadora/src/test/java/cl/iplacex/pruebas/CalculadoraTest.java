package cl.iplacex.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora calculadora = new Calculadora();
        assertEquals(8, calculadora.sumar(5, 3));
    }

    @Test
    void testResta() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.restar(5, 3));
    }
}
