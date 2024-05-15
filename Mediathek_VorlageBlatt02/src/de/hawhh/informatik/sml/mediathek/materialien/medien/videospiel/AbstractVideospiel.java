package de.hawhh.informatik.sml.mediathek.materialien.medien.videospiel;

import de.hawhh.informatik.sml.mediathek.fachwerte.geldbetrag.Geldbetrag;
import de.hawhh.informatik.sml.mediathek.materialien.medien.AbstractMedium;
import de.hawhh.informatik.sml.mediathek.materialien.medien.Medium;

/**
 * {@link AbstractVideospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2024
 */
public abstract class AbstractVideospiel extends AbstractMedium
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
    public AbstractVideospiel(String titel, String kommentar, String system)
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

    public void setSystem(String system)
    {
        assert system != null : "Vorbedingung verletzt: system != null";

        _system = system;
    }

    @Override
    public String getFormatiertenString()
    {
        String str = super.getFormatiertenString();
        return str + "    "
                + "System: " + _system + "\n";
    }

    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0: "Vorbedingung verletzt: mietTage > 0";

        int basispreis = 200 * mietTage;
        int total = basispreis + getPreisNachTagen(mietTage);
        return Geldbetrag.get(total);
    }

    public abstract int getPreisNachTagen(int tage);
}
