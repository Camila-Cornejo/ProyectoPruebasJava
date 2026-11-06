
package cl.iplacex.pruebas;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class CalculadoraPerformance extends AbstractJavaSamplerClient {

    @Override
    public SampleResult runTest(JavaSamplerContext context) {

        SampleResult resultado = new SampleResult();
        resultado.setSampleLabel("Prueba de suma");

        Calculadora calculadora = new Calculadora();

        resultado.sampleStart();

        try {
            int suma = calculadora.sumar(5, 3);

            if (suma == 8) {
                resultado.setSuccessful(true);
                resultado.setResponseCodeOK();
                resultado.setResponseMessage("Operacion correcta");
            } else {
                resultado.setSuccessful(false);
                resultado.setResponseCode("500");
                resultado.setResponseMessage("Resultado incorrecto");
            }

        } catch (Exception e) {
            resultado.setSuccessful(false);
            resultado.setResponseCode("500");
            resultado.setResponseMessage(e.toString());
        } finally {
            resultado.sampleEnd();
        }

        return resultado;
    }
}
