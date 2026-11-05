\# Proyecto de Pruebas Automatizadas Java



\## 1. Objetivo

Implementar pruebas automatizadas utilizando Java, Maven, JUnit y GitHub Actions, aplicando buenas prácticas de control de versiones e integración continua.



\## 2. Herramientas utilizadas

\- Java 17

\- Apache Maven 3.10.0

\- JUnit 5

\- Git y GitHub

\- GitHub Actions

\- Maven Surefire Report



\## 3. Estructura del proyecto

El proyecto utiliza la estructura estándar de Maven:



\- `src/main/java`: código fuente.

\- `src/test/java`: pruebas unitarias.

\- `pom.xml`: configuración de Maven.

\- `.github/workflows/ci.yml`: pipeline de integración continua.

\- `.gitignore`: exclusión de archivos temporales.



\## 4. Control de versiones

Se utilizó Git para gestionar los cambios mediante dos ramas:



\- `main`: rama principal.

\- `desarrollo`: rama de implementación y pruebas.



Los cambios se registraron mediante commits y se publicaron en GitHub.



\## 5. Pruebas unitarias

Se implementó una clase Calculadora con dos operaciones:



\- Suma: 5 + 3 = 8.

\- Resta: 5 - 3 = 2.



Las pruebas fueron desarrolladas utilizando JUnit 5, verificando cada operación de forma independiente.



\## 6. Ejecución de pruebas

Para ejecutar las pruebas desde la carpeta `calculadora`:



`mvn clean test`



Para generar el reporte HTML:



`mvn surefire-report:report-only`



\## 7. Integración continua

Se configuró GitHub Actions para ejecutar automáticamente las pruebas al realizar cambios en el repositorio.



El pipeline realiza las siguientes tareas:



1\. Descarga el código.

2\. Configura Java 17.

3\. Ejecuta las pruebas mediante Maven.

4\. Genera un reporte HTML.

5\. Publica los resultados como artefactos.



\## 8. Resultados obtenidos

\- Pruebas ejecutadas: 3.

\- Errores: 0.

\- Fallos: 0.

\- Pruebas omitidas: 0.

\- Porcentaje de éxito: 100 %.



\## 9. Reportes

Se utilizó Maven Surefire Report para generar un informe HTML navegable.



Los reportes están disponibles como artefactos descargables desde GitHub Actions bajo el nombre `reportes-pruebas`.



\## 10. Conclusión

Mediante este proyecto pude aplicar conocimientos relacionados con las pruebas automatizadas, el control de versiones y la integración continua.



La utilización de Java, Maven, JUnit y GitHub Actions permitió ejecutar las pruebas de manera automática y comprobar el correcto funcionamiento de las operaciones implementadas.



Además, los reportes HTML facilitaron la visualización de los resultados, contribuyendo a mejorar el seguimiento y la calidad del software.

