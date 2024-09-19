#! /bin/bash
echo "Programa d'ajuda a la configuració de l'entorn introprg"

function show_ok() {
    echo -e "\\e[1;37;42mOK\\e[0m: $1"
}

echo "Comprovant si PATH inclou introprg: "
scriptdir=$(dirname "$0")
folder=$(realpath "$scriptdir")
line='export PATH=$PATH:'"$folder"
grep "$line" ~/.bashrc &> /dev/null || echo "$line" >> ~/.bashrc
show_ok "PATH configurada"

echo "Comprovant si CLASSPATH inclou introprg: "
line='export CLASSPATH=${CLASSPATH:-.}:'"$folder"
grep "$line" ~/.bashrc &> /dev/null || echo "$line" >> ~/.bashrc
show_ok "CLASSPATH configurada"

echo
echo "Recorda escriure la següent comanda si vols fer servir els canvis en aquest terminal"
echo -e "\tsource ~/.bashrc"
