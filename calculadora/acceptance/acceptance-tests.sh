
#!/usr/bin/env bash

set -euo pipefail

JAR="${1:-target/calculadora-1.0-SNAPSHOT.jar}"

echo "Iniciando pruebas de aceptacion..."

RESULTADO=$(java -cp "$JAR" cl.iplacex.pruebas.App)

echo "$RESULTADO"

echo "$RESULTADO" | grep -Fq "Aplicacion iniciada correctamente"
echo "CA-01: Inicio de aplicacion - OK"

echo "$RESULTADO" | grep -Fq "Suma: 5 + 3 = 8"
echo "CA-02: Operacion de suma - OK"

echo "$RESULTADO" | grep -Fq "Resta: 10 - 4 = 6"
echo "CA-03: Operacion de resta - OK"

echo "ACCEPTANCE TESTS SUCCESS"
