package de.hawhh.informatik.sml.mediathek.materialien.medien;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public abstract class AbstractMediumTest {
    protected static final String KOMMENTAR = "Kommentar";
    protected static final String TITEL = "Titel";
    protected static final String BEZEICHNUNG = "Bezeichnung";
    private Medium _medium;
    private Medium _medium1;

    protected abstract Medium getMedium();

    public Medium getExamplar()
    {
        return _medium;
    }

    public AbstractMediumTest()
    {
        _medium = getMedium();
        _medium1 = getMedium();
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _medium.getTitel());
        assertEquals(KOMMENTAR, _medium.getKommentar());
        assertEquals(BEZEICHNUNG, _medium.getMedienBezeichnung());
    }

    @Test
    public void testSetter()
    {
        _medium.setTitel("Titel2");
        assertEquals(_medium.getTitel(), "Titel2");
        _medium.setKommentar("Kommentar2");
        assertEquals(_medium.getKommentar(), "Kommentar2");
    }

    @Test
    /*
     * Von ein und der selben CD kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen CD sind ungleich",
                _medium.equals(_medium1));
        assertTrue("Dasselbe Exemplare der gleichen CD ist gleich",
                _medium.equals(_medium));
    }

    @Test
    public final void testGetFormatiertenString()
    {
        Medium medium = getMedium();
        assertNotNull(medium.getFormatiertenString());
    }
}
