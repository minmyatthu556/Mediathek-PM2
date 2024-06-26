package de.hawhh.informatik.sml.mediathek.materialien.medien.videospiel;

public class PCVideospiel extends AbstractVideospiel
{
    /**
     * Initialisiert ein neues PC Videospiel.
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
    public PCVideospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar, system, "PC-Videospiel");
    }

//    public int getPreisNachTagen(int tage)
//    {
//        if (tage <= 7)
//        {
//            return 0;
//        }
//        else
//        {
//            int counter = ((tage - 8) / 5) + 1;
//            return 500 * counter;
//        }
//    }
    
    protected int getPreisNachTagen(int mietTage)
    {
    	if((mietTage-7) % 5 > 0)
    	{
    		return   500 * ((mietTage -7) /5+1);
    	}
    	else if(mietTage > 7)
    	{
    		return 500 *  (mietTage-7)/5;
    	}
    	return 0;
    }
}
