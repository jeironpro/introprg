####################################
Anotacions sobre propietats mutables
####################################

* Autor/a: Jeiron Espinal

* Data: Diumenge 9/3/2025

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats mutables*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01    public class GatRenat {
    02        int vides = 7;                // vides disponibles del gat Renat
    03        public static void main(String[] args) {
    04            GatRenat renat;           // declarem l'objecte (la referència) al gat
    05            renat = new GatRenat();   // creem la instància del gat Renat.
    06            System.out.println("Abans el gat Renat tenia " + renat.vides + " vides");
    07            renat.vides = renat.vides - 1;  // Renat ha tingut un accident
    08            System.out.println("Ara el gat Renat té " + renat.vides);
    09        }
    10    }

Pregunta 1. Obtenir
===================

Per consultar (llegir, obtenir) el valor d'una propietat de la instància,
cal *Cal posar devant del nom de la propietat el nom de la instància de la classe: renat.vides.*

Pregunta 2. Assignar
====================

Per canviar (escriure, assignar) el valor d'una propietat de la instància,
cal *cal posar devant del nom de la propietat el nom de la instancia de la classe: renat.vides, abans i després del signe =.* 

*renat.vides = renat.vides -1*

Pregunta 3. Valors absurds
==========================

A la pregunta següent:

    És possible indicar que el gat Renat té -12 vides? Com? És quelcom
    desitjable que pugui passar? En cas que es pugui, com ho podries
    evitar fent servir els coneixements de programació estructurada i
    modular que hem treballat fins ara?

La meva resposta és: *Si és possible, assignant renat.vides = -12 o en la inicialització int vides = -12, però no és una cosa desitjable perquè un gat no pot tenir -12 vides. Amb els coneixements que tenim fins ara, no podem fer res per a evitar-ho.*
