
#!/usr/bin/env bash

set -euo pipefail

BACKUP="backup/calculadora-v1.jar"
STAGING="staging/calculadora.jar"

echo "Iniciando rollback automatico..."

if [ ! -f "$BACKUP" ]; then
    echo "ERROR: No existe una version de respaldo"
    exit 1
fi

cp "$BACKUP" "$STAGING"

echo "Version estable restaurada"

echo "Validando aplicacion recuperada..."

bash acceptance/acceptance-tests.sh "$STAGING"

echo "ROLLBACK SUCCESS"
