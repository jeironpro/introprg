#!/bin/bash
# Directori de l'exercici
EXERCICI="$(basename "$(pwd)")"
# Definir el num de l'exercici
NUM_EXERCICI="${EXERCICI%_*}"

# Guardar els canvis realitzat
git add .

# Guardar l'instancia dels canvis
git commit -am "Completat l'exercici $NUM_EXERCICI"

# Enviar l'instancia al repositori
git push
