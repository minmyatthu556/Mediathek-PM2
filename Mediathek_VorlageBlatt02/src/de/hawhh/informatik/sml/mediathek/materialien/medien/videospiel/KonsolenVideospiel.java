package de.hawhh.informatik.sml.mediathek.materialien.medien.videospiel;

public class KonsolenVideospiel extends AbstractVideospiel
{
    /**
     * Initialisiert ein neues KonsolenVideospiel.
     *
     * @param titel     Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system    Die Bezeichnung des Systems
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public KonsolenVideospiel(String titel, String kommentar, String system) {
        super(titel, kommentar, system, "Konsolenvideospiel");
    }

//    public int getPreisNachTagen(int tage) {
//        int counter = tage / 3;
//        return 700 * counter;
//    }
    
    @Override
    public int getPreisNachTagen(int mietTage)
    {
    	if (mietTage >= 3)
    	{
    		return (mietTage/3) * 700;
    	}
    	return 0;
    }
}
