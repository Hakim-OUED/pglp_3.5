package fr.uvsq.pglp;

import java.time.LocalDateTime;

public class Time implements TimeProvider {
    /**
     *
     * @return heure actuelle
     */
    @Override
    public LocalDateTime currentTime() {
       return LocalDateTime.now();

    }
}
