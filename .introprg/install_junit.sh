#! /bin/bash

# Instal·lació de JUnit al repositori de introprg

scriptdir=$(dirname "$0")
JUNITDEST=$(realpath "$scriptdir")
JUNITJAR=junit-platform-console-standalone.jar
JUNITJARPATH="$JUNITDEST/$JUNITJAR"
JUNITVERSION=1.10.3
JUNITURL=https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/${JUNITVERSION}/junit-platform-console-standalone-${JUNITVERSION}.jar

function show_ok() {
    echo -e "\\e[1;37;42mCORRECTE\\e[0m: $1"
}

function show_error() {
    echo -e "\\e[1;37;41mERROR\\e[0m: $1"
}

echo "Programa d'ajuda a la configuració de l'entorn introprg"
echo "Instal·lació i configuració del framework junit"
echo

# Comprovació general
if java org.junit.platform.console.ConsoleLauncher -h &> /dev/null;
then
    show_ok "JUnit ja està configurat"
    echo
    exit 0
fi

# Descarrega junit
if java -cp "$JUNITJARPATH" org.junit.platform.console.ConsoleLauncher -h &> /dev/null;
then
    show_ok "JUnit ja es troba descarregat"
else
    mkdir -p "$JUNITDEST"
    if ! wget -O "$JUNITJARPATH" -c "$JUNITURL";
    then
        show_error "S'ha produït un error mentre es descarregava el fitxer."
        echo "Intenta-ho més tard o parla amb el teu docent si el problema persisteix."
        echo
        rm -f "$JUNITJAR" > /dev/null
        exit 1
    else
        if ! java -cp "$JUNITJARPATH" org.junit.platform.console.ConsoleLauncher -h &> /dev/null;
        then
            show_error "El fitxer descarregat no és correcte."
            echo "Torna-ho a intentar o parla amb el teu docent si el problema persisteix."
            echo
            rm -f "$JUNITJAR" > /dev/null
            exit 1
        else
            show_ok "JUnit descarregat correctament"
        fi
    fi
fi

# comprova si ja està configurat el CLASSPATH
CLASSPATHLINE='CLASSPATH=$CLASSPATH:'"$JUNITJARPATH"
if grep "$CLASSPATHLINE" ~/.bashrc &> /dev/null;
then
    show_ok "CLASSPATH ja configurat"
else
    echo "$CLASSPATHLINE" >> ~/.bashrc
    echo "S'ha configurat el CLASSPATH a ~/.bashrc"
fi
echo
echo "Recorda escriure la següent comanda si vols fer servir els canvis en aquest terminal"
echo -e "\tsource ~/.bashrc"
