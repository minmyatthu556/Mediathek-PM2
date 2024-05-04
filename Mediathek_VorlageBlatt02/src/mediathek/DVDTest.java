package mediathek;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DVDTest extends AbstractMediumTest
{
    private static final String BEZEICHNUNG = "DVD";
    private static final int LAENGE = 100;
    private static final String REGISSEUR = "DVD Regisseur";

    private DVD _dvd = (DVD) super.getExamplar();

    @Override
    protected DVD getMedium()
    {
        return new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _dvd.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(LAENGE, _dvd.getLaufzeit());
        assertEquals(REGISSEUR, _dvd.getRegisseur());
    }

    @Test
    public final void testSetter()
    {
        _dvd.setLaufzeit(90);
        assertEquals(90, _dvd.getLaufzeit());
        _dvd.setRegisseur("Regisseur2");
        assertEquals("Regisseur2", _dvd.getRegisseur());
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        int euro = _dvd.berechneMietgebuehr(4).getEuroAnteil();
        int cent = _dvd.berechneMietgebuehr(4).getCentAnteil();
        assertEquals("Falscher EuroAnteil",12, euro);
        assertEquals("Falscher CentAnteil",0, cent);
    }
}
