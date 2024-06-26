package de.hawhh.informatik.sml.mediathek.werkzeuge;

/**
 * Interface für Beobachter, die sich für Änderungen eines ObservableSubWerkzeug
 * interessieren.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2024
 */
public interface SubWerkzeugObserver
{
    /**
     * Diese Operation wird aufgerufen, sobald sich an an dem beobachteten
     * Werkzeug etwas relevantes geändert hat.
     * 
     * Implementierende Klassen müssen in dieser Operation auf die Aenderung
     * reagieren.
     */
    void reagiereAufAenderung();
}
