
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "Konsole";
    private final KonsolenVideospiel _videospiel;

    public KonsolenVideospielTest()
    {
        _videospiel = getKonsole();
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

    protected KonsolenVideospiel getKonsole()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        KonsolenVideospiel medium = getKonsole();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }

    @Test
    public final void testSetTitel()
    {
        KonsolenVideospiel pc = getKonsole();
        pc.setTitel("Titel2");
        assertEquals(pc.getTitel(), "Titel2");
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        assertEquals("Falscher EuroAnteil",4, _videospiel.berechneMietgebuehr(2).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",13, _videospiel.berechneMietgebuehr(3).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",17, _videospiel.berechneMietgebuehr(5).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",28, _videospiel.berechneMietgebuehr(7).getEuroAnteil());
        assertEquals("Falscher EuroAnteil",95, _videospiel.berechneMietgebuehr(23).getEuroAnteil());

        assertEquals("Falscher CentAnteil",0, _videospiel.berechneMietgebuehr(1).getCentAnteil());

    }

}
