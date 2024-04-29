/**
 * {@link Videospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2024
 */
class Videospiel extends AbstractMedium
{
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel
     *            Der Titel des Spiels
     * @param kommentar
     *            Ein Kommentar zum Spiel
     * @param system
     *            Die Bezeichnung des System
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        super(kommentar, titel);

        assert system != null : "Vorbedingung verletzt: system != null";

        _system = system;
    }

    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String getFormatiertenString()
    {
        String str = super.getFormatiertenString();
        return str + "    "
                + "System: " + _system + "\n";
    }

    @Override
    /**
     * Berechnet die Mietgebühr in Eurocent für eine angegebene Mietdauer in Tagen
     *
     * @param mietTage Die Anzahl der Ausleihtage eines Mediums
     * @return Die Mietgebühr in Eurocent als Geldbetrag
     *
     * @require mietTage > 0
     *
     * @ensure result != null
     */
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0: "Vorbedingung verletzt: mietTage > 0";

        return Geldbetrag.get(200 * mietTage);
    }
}
