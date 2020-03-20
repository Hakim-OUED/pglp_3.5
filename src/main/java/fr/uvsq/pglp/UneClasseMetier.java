package fr.uvsq.pglp;

import java.time.LocalDateTime;

/**
 * Classe metier
 */
public class UneClasseMetier extends Time {
    //instanciation de TimeProvider
    private final TimeProvider temps;

    /**
     *
     */
    UneClasseMetier(TimeProvider timeProvider) {
        this.temps = timeProvider;
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
