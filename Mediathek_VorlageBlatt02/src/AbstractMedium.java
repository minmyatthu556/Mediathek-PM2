abstract class AbstractMedium implements Medium
{
    private String _kommentar;
    private String _titel;

    public AbstractMedium(String kommentar, String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";

        _kommentar = kommentar;
        _titel = titel;
    }

    /**
     * Gibt einen formatierten Text mit allen Eigenschaften des Mediums zurück.
     * Jedes Attribute steht in einer eigenen Zeile mit der Form "Attributename:
     * Attributwert". Hinweis: Ein Zeilenumbruch wird durch den Character '\n'
     * dargestellt.
     *
     * @return Eine Textrepräsentation des Mediums.
     *
     * @ensure result != null
     */
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n";
    }

    /**
     * Gibt den Kommentar zu diesem Medium zurück.
     *
     * @return Den Kommentar zu diesem Medium.
     *
     * @ensure result != null
     */
    public String getKommentar()
    {
        return _kommentar;
    }

    /**
     * Ändert den Kommentar des Mediums
     *
     * @param kommentar
     *            Ein Kommentar zu diesem Medium
     *
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    /**
     * Gibt die Bezeichnung für die Medienart zurück.
     *
     * @return Die Bezeichnung für die Medienart.
     *
     * @ensure result != null
     */
    public abstract String getMedienBezeichnung();

    /**
     * Gibt den Titel des Mediums zurück.
     *
     * @return Den Titel des Mediums
     *
     * @ensure result != null
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Ändert den Titel des Mediums.
     *
     * @param titel
     *            Der Titel des Mediums
     *
     * @require titel != null
     * @ensure getTitel() == titel
     */
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }

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

        return Geldbetrag.get(300 * mietTage);
    }
}
