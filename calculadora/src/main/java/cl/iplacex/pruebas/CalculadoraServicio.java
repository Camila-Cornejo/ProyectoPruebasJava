package cl.iplacex.pruebas;

public class CalculadoraServicio {

    private final Calculadora calculadora = new Calculadora();

    // Combina las operaciones de suma y resta
    public int calcularResultado(int a, int b, int c) {
        int suma = calculadora.sumar(a, b);
        return calculadora.restar(suma, c);
    }
}