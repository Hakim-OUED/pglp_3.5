package fr.uvsq.pglp;

/**
 * Classe metier
 */
public class UneClasseMetier {
    //instanciation de TimeProvider
    private final TimeProvider temps;

    /**
     *
     */
    UneClasseMetier() {
        this.temps = null;
    }

    /**
     * Methode metier
     */
    public void uneMethodeMetier() {
        System.out.println(temps.currentTime() + ": Debut de uneMethodeMetier");

        // Traitement
        System.out.println(temps.currentTime() + ": Fin de uneMethodeMetier");
    }
}
