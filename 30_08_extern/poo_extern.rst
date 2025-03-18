#############################
Anotacions sobre accés extern
#############################

* Autor/a: Jeiron Espinal

* Data: Dimecres 19-03-2025

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *accés
extern* dins de la *programació orientada a objectes*.

Disposem ara de dos fitxers amb codi:

* ``GatRenat.java``

  ::

    01   public class GatRenat {
    02       int vides = 7;                // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }



* ``UsaGatRenat.java``

  ::

    01      public class UsaGatRenat {
    02          public static void main(String[] args) {
    03              GatRenat renat = new GatRenat();
    04              System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    05          }
    06      }

Pregunta 1. On està el ``main()``
=================================

El punt d'entrada ``main()`` d'aquest programa es troba al fitxer *gatRenat.java i UsaGatRenat.java, però el que utilitza és el de UsaGatRenat.java*.

Pregunta 2. Distingint dos ``main()``
=====================================

Ara tenim dos fitxers amb ``main()``. Java pot saber quin dels dos volem
executar gracies *a què el main a utilitzar és el de classe del programa a executar, en aquest cas utilitzarem UsaGatRenat.java.*

Pregunta 3. Definició de la classe
==================================

La classe del gat Renat està definida al fitxer *GatRenat.java*

Pregunta 4. Quants programes
============================

El nombre de programes que es podrien construir fent ús de la definició del gat Renat és *indefinit*

Penso això perquè *és una classe pública*

Pregunta 5. Eliminant ``main()``
================================

Quan elimino el ``main()`` de ``GatRenat`` (per exemple, comentant-lo) em trobo que en intentar
tornar a compilar/executar ``UsaGatRenat``, *mostra la mateixa sortida perquè UsaGatRenat no està fent ús del main de GatRenat sinó que de la seva classe.*

El que sí ha deixat de funcionar és *que si intentem executar el programa GatRenat no funciona perquè no té punt d'entrada main().*

Pregunta 6. Diferents directoris
================================

Després de moure el fitxer ``UsaGatRenat.java`` a una carpeta diferent d'on es
troba ``GatRenat.java``, m'he trobat que *no compila perquè a dins de la carpeta no existeix el fitxer GatRenat on es troba la classe que utilitza UsaGatRenat per mostrar el valor de vides.*

