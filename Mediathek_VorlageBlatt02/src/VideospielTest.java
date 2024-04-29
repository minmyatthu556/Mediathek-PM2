
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class VideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private Videospiel _videoSpiel;

    public VideospielTest()
    {
        _videoSpiel = getMedium();
    }

    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        Videospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        Videospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        int euro = _videoSpiel.berechneMietgebuehr(4).getEuroAnteil();
        int cent = _videoSpiel.berechneMietgebuehr(4).getCentAnteil();
        assertEquals("Falscher EuroAnteil",8, euro);
        assertEquals("Falscher CentAnteil",0, cent);
    }

}
