package mediathek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{
    private static final String SYSTEM = "Konsole";
    private final KonsolenVideospiel _videospiel = (KonsolenVideospiel) super.getExamplar();

    @Override
    protected KonsolenVideospiel getMedium() {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testKonstruktor() {
        assertEquals(SYSTEM, _videospiel.getSystem());
    }

    @Test
    public void testGetSystem()
    {
        assertEquals(SYSTEM, _videospiel.getSystem());
    }

    @Test
    public void testSetSystem()
    {
        KonsolenVideospiel medium = getMedium();
        medium.setSystem("System2");
        assertEquals(medium.getSystem(), "System2");
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
