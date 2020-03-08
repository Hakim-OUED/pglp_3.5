package fr.uvsq.pglp;

import java.time.LocalDateTime;

public interface TimeProvider {
    LocalDateTime currentTime();
}
