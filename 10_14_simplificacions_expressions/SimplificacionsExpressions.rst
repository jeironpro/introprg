###########################################
Exercici 10_14. Simplificació d'expressions
###########################################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a utilitzar les taules de veritat i simplificar les expressions. 

**true && A, A**

==== ===== =========
true A     true && A
==== ===== =========
true true  true
true false false
==== ===== =========

**A && A, A**

===== ===== ======
A     A     A && A
===== ===== ======
true  true  true
true  false false
false true  false
false false false
===== ===== ======

**A || false, A**

===== ===== ==========
A     false A || false
===== ===== ==========
true  false true
false false false
===== ===== ==========

**A || A, A**

===== ===== ======
A     A     A || A
===== ===== ======
true  true  true  
true  false true  
false true  true  
false false false 
===== ===== ======

**A && false, false**

===== ===== ==========
A     false A && false
===== ===== ==========
true  false false
false false false
===== ===== ==========

**A || true, true**

===== ==== =========
A     true A || true
===== ==== =========
true  true true
false true true
===== ==== =========

**! (A && B), !A || !B**

===== ===== ===== ===== ========
A     B     !A    !B    !A || !B
===== ===== ===== ===== ========
true  true  false false false 
true  false false true  true
false true  true  false true
false false true  true  true
===== ===== ===== ===== ========

**! (A || B), !A && !B**

===== ===== ===== ===== ========
A     B     !A    !B    !A && !B
===== ===== ===== ===== ========
true  true  false false false 
true  false false true  false
false true  true  false false
false false true  true  true
===== ===== ===== ===== ========
