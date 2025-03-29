/*
 * Interfície amb tres mètodes esDret(), esAssegut(), esEstirat(), aixecat(),
 * seu() i estirat() que permet que altres classes la facin servir. Aquesta
 * interfície es fa servir en GatRenat.
 */
 
interface Ensinistrable {
    // Mètodes de l'interfície
    boolean esDret();
    boolean esAssegut();
    boolean esEstirat();
    String aixecat();
    String seu();
    String estirat();
}
