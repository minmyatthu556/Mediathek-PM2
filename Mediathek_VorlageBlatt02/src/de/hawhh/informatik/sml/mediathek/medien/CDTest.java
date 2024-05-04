package de.hawhh.informatik.sml.mediathek.medien;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CDTest extends AbstractMediumTest
{
    private static final String CD_BEZEICHNUNG = "CD";
    private static final String INTERPRET = "CD Interpret";
    private static final int LAENGE = 100;

    private CD _cd1 = (CD) super.getExamplar();

    @Override
    protected CD getMedium()
    {
        return new CD(TITEL, KOMMENTAR, INTERPRET, LAENGE);
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(CD_BEZEICHNUNG, _cd1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(LAENGE, _cd1.getSpiellaenge());
        assertEquals(INTERPRET, _cd1.getInterpret());
    }

    @Test
    public void testSetter()
    {
        _cd1.setInterpret("Interpret2");
        assertEquals(_cd1.getInterpret(), "Interpret2");
        _cd1.setSpiellaenge(99);
        assertEquals(_cd1.getSpiellaenge(), 99);
    }

    @Test
    public void testBerechneMietgebuehr()
    {
        int euro = _cd1.berechneMietgebuehr(4).getEuroAnteil();
        int cent = _cd1.berechneMietgebuehr(4).getCentAnteil();
        assertEquals("Falscher EuroAnteil",12, euro);
        assertEquals("Falscher CentAnteil",0, cent);
    }

}
