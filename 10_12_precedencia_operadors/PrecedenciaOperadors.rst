##########################################
Exercici 10_12. Precedència dels operadors
##########################################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a utilitzar les precedències dels operadors.

1. 5 + 4 * 3

5 + 4 * 3 **->** 5 + (4 * 3) **->** 5 + 12 **->** 17

2. -5 * 4 + -3

(-(5) * 4)) + -(3) **->** -(20) + -(3) **->** -23

3. true && false || ! true

true || false **->** false

4. false && (10 > 3) || ! (4 > 5)

false && true || true **->** true

5. (false == (5 > 4)) && (false == ! true) || (false != true)

(false == true) && true || true **->** false && true || true **->** false || true **->** true

6. true || (4 > 10) && ((true == ! true) && (5 < 3))

true || (4 > 10) && (false && false) **->** true || false && true **->** true || false **->** true

7. (42 > 30) || true && (true != false) || (30 > 42)

true || true && (true != false) || false **->** true || true && true || false **->** true && true **->** true 


Aprenentatge:
=============
He après a agregar-li parèntesis a les operacions tenint en compte les precedències del operadors.
