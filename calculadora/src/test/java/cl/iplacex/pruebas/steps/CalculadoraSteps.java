
package cl.iplacex.pruebas.steps;

import cl.iplacex.pruebas.Calculadora;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private Calculadora calculadora;
    private int resultado;

    @Given("que tengo una calculadora")
    public void queTengoUnaCalculadora() {
        calculadora = new Calculadora();
    }

    @When("sumo {int} y {int}")
    public void sumoDosNumeros(int numero1, int numero2) {
        resultado = calculadora.sumar(numero1, numero2);
    }

    @When("resto {int} y {int}")
    public void restoDosNumeros(int numero1, int numero2) {
        resultado = calculadora.restar(numero1, numero2);
    }

    @Then("el resultado debe ser {int}")
    public void verificarResultado(int esperado) {
        assertEquals(esperado, resultado);
    }
}
