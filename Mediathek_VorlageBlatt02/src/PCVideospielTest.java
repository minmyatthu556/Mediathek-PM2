
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "PC";
    private final PCVideospiel _videospiel;

    public PCVideospielTest()
    {
        _videospiel = getPC();
    }

    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videospiel.getTitel());
        assertEquals(KOMMENTAR, _videospiel.getKommentar());
        assertEquals(SYSTEM, _videospiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _videospiel.getMedienBezeichnung());
    }

    protected PCVideospiel getPC()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        PCVideospiel medium = getPC();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        PCVideospiel pc = getPC();
        pc.setTitel("Titel2");
        assertEquals(pc.getTitel(), "Titel2");
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        assertEquals("Falscher EuroAnteil",6, _videospiel.berechneMietgebuehr(3).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",14, _videospiel.berechneMietgebuehr(7).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",21, _videospiel.berechneMietgebuehr(8).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",40, _videospiel.berechneMietgebuehr(15).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",85, _videospiel.berechneMietgebuehr(30).getEuroAnteil());

        assertEquals("Falscher CentAnteil",0, _videospiel.berechneMietgebuehr(3).getCentAnteil());

    }

}
