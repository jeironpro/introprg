###############################
Exercici 17_03. Tipus de mòduls
###############################

Autoria
=======
Jeiron Junior Espinal Cruz

Introducció
===========
En aquest exercici vaig a analitzar el codi de un programa real fet en Java.

===== =========================================================================== ====================================================================================================================================================================================================================================================
línia signatura                                                                   classificació
===== =========================================================================== ====================================================================================================================================================================================================================================================
56    MachineTranslateTextArea()                                                  És una classe que s'inicialitza en la línia 56, és anomenada novament en la línia 64 i en la línia 124 s'utilitza com a argument d'una funció (super) acompanyada de .this(no li ho que).
58    String OStrings.getString(String)                                           Funció perquè la crida assigna el valor de retorn a una variable Apostaria que és pura perquè rep un String
62    String displayed                                                            Sembla ser una funció pura perquè comença per String però abans d'això té una paraula estranya private i no té cap paràmetre.
65    super(boolean)                                                              Procediment doncs la crida no recull el valor de retorn. Nota: en realitat no és ben bé un procediment però és una bona aproximació.
67    setEditable(boolean)                                                        Procediment doncs la crida no recull el valor de retorn.
68    AlwaysVisibleCaret.apply(NiIdea)                                            Procediment doncs la crida no recull el valor de retorn. El tipus de l'argument… ni idea. Nota: ni idea és raonable aquí.
69    this.setText(EXPLANATION)                                                   És una funció que inicia amb this. (paraula estranya) i té com a argument una altra funció que retorna un valor de tipus String pel que la fa pura.
72    String OStrings.getString(String)                                           És una funció pura que rep i retorna un valor de tipus String
86    String getDisplayedTranslation()                                            Funció pura que retorna un valor de tipus string
91    onProjectClose()                                                            Procediment que no retorna cap valor perque abans de la signatura té void
97    startSearchThread(final SourceTextEntry newEntry)                           Procediment que no retorna cap valor perque abans de la signatura té void, però aquest procediment té com paràmetre la parula estranya per a mi (final).
108   setFoundResult(final SourceTextEntry se, final MachineTranslationInfo data) Procediment que no retorna cap valor perque abans de la signatura té void, però aquest procediment té com paràmetre la parula estranya per a mi (final).
119   FindThread                                                                  És una classe que torna a ser anomenada d'aquesta manera FindThread(final IMachineTranslation translator, final SourceTextEntry newEntry) en la línia 123, la qual cosa ho fa estrany per a mi, perquè ara aquesta classe rep té paràmetres amb paraula com a final que ni idea.

Aprenentatge
============
He aprés a identificar els móduls de un programa real, a saber quan són un procediment o una funció pura o impura.
