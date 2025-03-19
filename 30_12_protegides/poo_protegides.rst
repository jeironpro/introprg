##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Jeiron Espinal

* Data: Dimecres 19-03-2025

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que *el programa no compila perquè UsaGatRenat està accedint a la propietat vides, i aquesta és privada dins del programa GatRenat, per tant, no és accessible des de fora.*

Penso que passa perquè *la propietat vides dins de la classe GatRenat és privada.*

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és *que ara la instància accedeix a un mètode getter que permet llegir el valor de la propietat privada.*.

El resultat ara és *El gat Renat té 7 vides*

Penso que passa això perquè *ja no accedim directament a la propietat privada vides, sinó que accedeix mitjançant un mètode getter.*

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer *renat.setVides(5)*.

El codi de ``UsaGatRenat`` seria:

::

    public class UsaGatRenat {
        public static void main(String[] args) {
            GatRenat renat = new GatRenat();
            renat.setVides(5);
            System.out.println("El gat Renat té " + renat.getVides() + " vides");
        }
    }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides


La meva explicació de perquè això és així és *que en afegir la línia renat.setVides(5), el valor de vides es modifica.*


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que *el valor no es modifica, perquè el mètode setter no permet assignar-li un nombre negatiu de vides al gat.*

El codi seria:

::

    public class UsaGatRenat {
        public static void main(String[] args) {
            GatRenat renat = new GatRenat();
            renat.setVides(-12);
            System.out.println("El gat Renat té " + renat.getVides() + " vides");
        }
    }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 7 vides


La meva explicació de perquè això és així és *que el setter verifica que el nombre de vides a assignar sigui vàlid per a un gat.*


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què *s'ha fet el canvi*

Comparant-lo amb el que passava a la pregunta 1, veiem que *tot i que la propietat és privada, dins de la seva pròpia classe se pot utilitzar.*.

La meva explicació és *que la propietat privada són accessible des de la seva pròpia classe i des de fora no almenys que s'utilitzi els mètodes accessors.*

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és *que des de fora no és pot, ja que el setter no ho permet. Ara si al que també anomenem un valor absurd és possar-li més de 7 vides a un gat, si que es pot.*.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és *que amb public le donem accés a qualsevol programa i amb private només dins de la pròpia classe.*

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls *getVides()* i *setVides()*.

*Respostes si es des de el mateix programa.
 nomes amb getter: funciona igual perquè no intentem modificar la propietat.
 nomes amb setter: funciona igual perquè no intentem llegir la propietat.
 sense getter ni setter: funciona igual perquè no accedeix a cap mètodes accessors.
*

*Respostes si es des de fora*
En cas que ``GatRenat`` només disposés de *getter*, el resultat seria *El gat Renat té 7 vides, perquè podem llegir la propietat mitjançant el mètode accessor, però no modificar-la.*.

En canvi, si només en tingués *setter* el que passaria és *podem modificar el valor de la propietat però, no podem llegir-la.*.

Finalment, si no en tingués cap dels dos, ens trobaríem que *no podem ni llegir ni modificar la propietat.*.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret *no utilitzen static.*
