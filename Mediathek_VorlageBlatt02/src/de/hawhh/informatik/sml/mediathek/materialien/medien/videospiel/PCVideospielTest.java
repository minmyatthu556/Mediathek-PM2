package de.hawhh.informatik.sml.mediathek.materialien.medien.videospiel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hawhh.informatik.sml.mediathek.fachwerte.geldbetrag.Geldbetrag;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{
    private static final String SYSTEM = "PC";
    private final PCVideospiel _videospiel = (PCVideospiel) super.getExamplar();

    @Override
    protected PCVideospiel getMedium() {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testKonstruktor() {
        assertEquals(SYSTEM, _videospiel.getSystem());
    }

    @Test
    public void testSetSystem()
    {
        PCVideospiel medium = getMedium();
        medium.setSystem("System2");
        assertEquals(medium.getSystem(), "System2");
    }

    @Test
    public void testGetSystem()
    {
        assertEquals(SYSTEM, _videospiel.getSystem());
    }

//    @Test
//    public void testBerechneMietgebuehr()
//    {
//    	assertEquals("Falscher EuroAnteil",2, _videospiel.berechneMietgebuehr(1).getEuroAnteil());
//        assertEquals("Falscher EuroAnteil",6, _videospiel.berechneMietgebuehr(3).getEuroAnteil());
//        assertEquals("Falscher EuroAnteil",14, _videospiel.berechneMietgebuehr(7).getEuroAnteil());
//        assertEquals("Falscher EuroAnteil",21, _videospiel.berechneMietgebuehr(8).getEuroAnteil());
//        assertEquals("Falscher EuroAnteil",40, _videospiel.berechneMietgebuehr(15).getEuroAnteil());
//        assertEquals("Falscher EuroAnteil",85, _videospiel.berechneMietgebuehr(30).getEuroAnteil());
//
//        assertEquals("Falscher CentAnteil",0, _videospiel.berechneMietgebuehr(3).getCentAnteil());
//
//    }

    @Test
    public void testBerechneMietgebuehr()
    {
    	assertEquals(_videospiel.berechneMietgebuehr(1), Geldbetrag.get(200));
    	assertEquals(_videospiel.berechneMietgebuehr(3), Geldbetrag.get(200));
    	assertEquals(_videospiel.berechneMietgebuehr(7), Geldbetrag.get(200));
    	assertEquals(_videospiel.berechneMietgebuehr(8), Geldbetrag.get(700));
    	assertEquals(_videospiel.berechneMietgebuehr(10), Geldbetrag.get(700));
    	assertEquals(_videospiel.berechneMietgebuehr(12), Geldbetrag.get(700));
    	assertEquals(_videospiel.berechneMietgebuehr(13), Geldbetrag.get(1200));
    	assertEquals(_videospiel.berechneMietgebuehr(15), Geldbetrag.get(1200));
    	assertEquals(_videospiel.berechneMietgebuehr(17), Geldbetrag.get(1200));
    	assertEquals(_videospiel.berechneMietgebuehr(18), Geldbetrag.get(1700));
    	assertEquals(_videospiel.berechneMietgebuehr(20), Geldbetrag.get(1700));
    	assertEquals(_videospiel.berechneMietgebuehr(22), Geldbetrag.get(1700));
    	assertEquals(_videospiel.berechneMietgebuehr(23), Geldbetrag.get(2200));
    }
}
