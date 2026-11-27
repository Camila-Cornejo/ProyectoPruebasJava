
package cl.iplacex.pruebas;

public class App {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora - Version 1.0");
        System.out.println("Aplicacion iniciada correctamente");

        System.out.println("Suma: 5 + 3 = " 
                + calculadora.sumar(5, 3));

        System.out.println("Resta: 10 - 4 = " 
                + calculadora.restar(10, 4));

    }
}
