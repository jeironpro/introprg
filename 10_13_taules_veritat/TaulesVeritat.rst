##############################
Exercici 10_13. Algunes taules
##############################

Autoria:
========
Jeiron Junior Espinal Cruz

Introducció:
============
En aquest exercici vaig aprendre a composar taules de veritat segons el concepte.

**la Clara és major d'edat o bé la Clara és més jove que el Marc**

============== ==================== ======================================
edadClara > 18 edatClara < edatMarc edadClara > 18 || edatClara < edatMarc
============== ==================== ======================================
true           true                 true
true           false                true 
false          true                 true
false          false                false
============== ==================== ======================================

**Al menys un de vosaltres, la Clara, el Marc o tu, és major d'edat**

============== ============= ============= =============================== ===================================
edatClara > 18 edatMarc > 18 edatMeva > 18 edatClara > 18 || edatMarc > 18 edatClaraMarc > 18 || edatMeva > 18
============== ============= ============= =============================== ===================================
true           true          true          true                            true                       
true           true          false         true                            true
true           false         true          true                            true
true           false         false         true                            true
false          true          true          true                            true
false          true          false         true                            true
false          false         true          false                           true
false          false         false         false                           false
============== ============= ============= =============================== ===================================

**la Clara és major d'edat, i tu ets major que el Marc però no major que la Clara**

============== =================== ======================= =========================================== =======================================
edatClara > 18 edatMeva > edatMarc !(edatMeva > edatClara) edatMeva > edatMarc && edatMeva < edatClara ellEllaMajorEdat > 18 && edatClara > 18
============== =================== ======================= =========================================== =======================================
true           true                true                    true                                        true
true           true                false                   false                                       false
true           false               true                    false                                       false
true           false               false                   false                                       false
false          true                true                    true                                        false
false          true                false                   false                                       false
false          false               true                    false                                       false
false          false               false                   false                                       false
============== =================== ======================= =========================================== =======================================

Aprenentatge:
=============
He après a composar taules de veritat segons el concepte. (una mica difícil).
