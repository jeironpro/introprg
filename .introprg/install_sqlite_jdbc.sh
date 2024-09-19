#! /bin/bash

# Instal·lació de SQLite i SQLite JDBC
function show_ok() {
    echo -e "\\e[1;37;42mCORRECTE\\e[0m: $1"
}

function show_error() {
    echo -e "\\e[1;37;41mERROR\\e[0m: $1"
}

function show_warning() {
    echo -e "\\e[1;37;43mAVíS\\e[0m: $1"
}

function check_driver() {
    javac TestSQLite.java && java TestSQLite &> /dev/null
}

function download_driver() {
    if [ -f "$DRIVERDEST/$DRIVERJAR" ];
    then
        show_ok "El driver ja es troba descarregat"
    else
        echo -n "Descarregant el driver… "
        wget -O $DRIVERJAR -c $INTROPRG_SQLITEURL &> /dev/null
        if [ "$?" -ne 0 ];
        then
            echo
            show_error "S'ha produït un error mentre es descarregava el fitxer."
            echo "Intenta-ho més tard o parla amb el teu docent si el problema persisteix."
            echo
            rm -f $DRIVERJAR > /dev/null
        else
            echo "fet!"
        fi
    fi
}

echo "================================================"
echo "Instal·lació i configuració del driver de SQLite"
echo "================================================"
echo

# Comprova la disponibilitat de sqlite3
if ! which sqlite3 &> /dev/null;
then
    show_error "Sembla que no està instal·lat sqlite3"
    echo "       Considera: $ sudo apt install sqlite3"
    exit 1
fi
show_ok "sqlite3 instal·lat"

# Obtenció dels noms dels paràmeters
scriptdir=$(dirname "$0")
if [[ "$scriptdir" != ".introprg" ]]; then
    show_error "Hi ha un problema amb la teva instal·lació. Comenta-li al teu docent."
    exit 1
fi
INTROPRG_SQLITEURL='https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.41.2.1/sqlite-jdbc-3.41.2.1.jar'
DRIVERJAR=$(echo $INTROPRG_SQLITEURL | cut -d \/ -f 9)
DRIVERDEST=$(realpath "$scriptdir")
DRIVERPATH="$DRIVERDEST/$DRIVERJAR"

# Preparació de la carpeta destinació
mkdir -p "$DRIVERDEST"
cd "$DRIVERDEST"

# Decisió de si cal descarregar
if ! check_driver;
then
    download_driver
    if [ "$?" -ne 0 ];
    then
        show_error "No s'ha pogut descarregar el driver. Comprova accés a internet o/i consulta al teu docent"
        exit 1
    fi
fi

# comprova si ja es troba al CLASSPATH
if grep "$DRIVERPATH" ~/.bashrc &> /dev/null;
then
    show_ok "CLASSPATH ja configurat"
else
    echo 'CLASSPATH=$CLASSPATH:'"$DRIVERPATH" >> ~/.bashrc
    show_ok "Configurat el CLASSPATH a ~/.bashrc"
    export CLASSPATH=$CLASSPATH:$DRIVERPATH
fi

# Darrera comprovació un cop el driver està descarregat
if check_driver;
then
    show_ok "El driver de SQLite es troba instal·lat correctament"
else
    show_error "Problemes amb la configuració automàtica. Consulta al teu docent."
    exit 1
fi
