===========================
Trapelleries a Mostrat.java
===========================

Resum de trapelleries al codi de ``Mostrat.java``


Trapelleria 1. Fitxer inexistent
================================

Canvia el nom del fitxer de la línia 11 per ``inexistent.txt``. Compila
i intenta executar el programa.

L'error que genera és: ::

    $ java Mostrat
    Exception in thread "main" java.io.FileNotFoundException: inexistent.txt (El fitxer o directori no existeix)
    at java.base/java.io.FileInputStream.open0(Native Method)
    at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
    at java.base/java.io.FileReader.<init>(FileReader.java:60)
    at Mostrat.main(Mostrat.java:12)


Trapelleria 2. Fitxer protegit
==============================

Crea ara un fitxer anomenat ``existent.txt`` però protegeix-lo perquè
no pugui ser llegit.

Aquí tens unes instruccions que t'ajudaran: ::

    $ touch existent.txt
    $ chmod -r existent.txt

Ara reemplaça ``inexistent.txt`` per ``existent.txt`` a ``Mostrat.java`` i
executa'l.

L'error que genera és: ::

    $ java Mostrat
    Exception in thread "main" java.io.FileNotFoundException: existent.txt (S’ha denegat el permís)
    at java.base/java.io.FileInputStream.open0(Native Method)
    at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
    at java.base/java.io.FileReader.<init>(FileReader.java:60)
    at Mostrat.main(Mostrat.java:12)


Trapelleria 3. Un directori en comptes d'un fitxer
==================================================

Canvia el nom de ``existent.txt`` per ``/tmp``. Compila i torna a
intentar executar-ho i copia aquí el que et genera: ::

    $ java Mostrat
    Exception in thread "main" java.io.FileNotFoundException: /tmp (És un directori)
    at java.base/java.io.FileInputStream.open0(Native Method)
    at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
    at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
    at java.base/java.io.FileReader.<init>(FileReader.java:60)
    at Mostrat.main(Mostrat.java:12)
