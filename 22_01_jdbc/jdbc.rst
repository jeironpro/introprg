#########################
A veure si ho he entès bé
#########################

* Autor/a: Jeiron Espinal

* Data: Dilluns 19-05-2025

Enunciat
========
*Indica quines de les següents afirmacions són certes respecte JDBC. Intenta argumentar-les:*

Preguntes
=========
1 - És un sistema que ens permet accedir des d'una base de dades relacional, a un programa fet en Java. **Fals** -> és al contrari és un sistema que ens permetre accedir a una base de dades des de un programa Java. 

2 - Per a poder accedir a un SGBD concret, ens caldrà una implementació adequada del JDBC, doncs JDBC per si sol només defineix interfaces i poc més. **Veritat** -> Cada SGBD té la seva implementació concreta, per aquesta raó al JDBC es necessita implementar-li les interfícies que ens dona.

3 - Si els nostres programes fan servir les interfícies definides per JDBC en comptes de les classes concretes dels drivers, hauria de ser raonablement fàcil canviar de SGBD sense haver de modificar els nostres programes. **Veritat** -> Si perquè només hauríem de canviar la configuració del driver, ja que estem fer servir les interfícies del JDBC.

4 - Donada una implementació concreta de JDBC, coneguda com a driver, podríem accedir a diverses fonts de dades, no només bases de dades. **Veritat** -> Si els drivers ens ofereixen implementacions per poder accedir a qualsevol font de dades. 

5 - Amb el driver adequat, el nostre programa hauria de poder accedir a un full de càlcul fent servir JDBC. **Veritat** -> Si l'interfície correcta està bé implementada es pot accedir a un full de càlcul sense problemes, clar hauríem de fer servir alguns mecanismes per poder llegir i escriure dades.
