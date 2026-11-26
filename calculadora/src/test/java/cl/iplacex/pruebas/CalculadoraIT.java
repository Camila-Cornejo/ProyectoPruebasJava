package cl.iplacex.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraIT {

    @Test
    void testIntegracionSumaResta() {
        CalculadoraServicio servicio = new CalculadoraServicio();

        int resultado = servicio.calcularResultado(10, 5, 3);

        assertEquals(12, resultado);
    }

    @Test
    void testIntegracionResultadoNegativo() {
        CalculadoraServicio servicio = new CalculadoraServicio();

        int resultado = servicio.calcularResultado(2, 3, 10);

        assertEquals(-5, resultado);
    }

    @Test
    void testIntegracionResultadoCero() {
        CalculadoraServicio servicio = new CalculadoraServicio();

        int resultado = servicio.calcularResultado(5, 5, 10);

        assertEquals(0, resultado);
    }
}