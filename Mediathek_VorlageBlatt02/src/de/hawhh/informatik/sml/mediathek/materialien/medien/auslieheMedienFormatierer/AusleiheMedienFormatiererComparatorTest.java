package de.hawhh.informatik.sml.mediathek.materialien.medien.auslieheMedienFormatierer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.hawhh.informatik.sml.mediathek.materialien.medien.Medium;
import org.junit.Test;

import de.hawhh.informatik.sml.mediathek.materialien.medien.cd.CD;
import de.hawhh.informatik.sml.mediathek.materialien.medien.dvd.DVD;
import de.hawhh.informatik.sml.mediathek.materialien.medien.videospiel.PCVideospiel;

/**
 * Testklasse für den MedienComparator
 * 
 * @author SE2-Team, PM2-Team
 * 
 */
public class AusleiheMedienFormatiererComparatorTest
{

    private CD _cd1;
    private CD _cd2;
    private CD _cd3;
    private DVD _dvd;
    private PCVideospiel _videospiel;
    private AusleiheMedienFormatiererComparator _medienComparator;

    public AusleiheMedienFormatiererComparatorTest()
    {

        _cd1 = new CD("Titel a", "Kommentar", "Interpret", 100);
        _cd2 = new CD("Titel b", "Kommentar", "Interpret", 100);
        _cd3 = new CD("Titel b", "Kommentar", "Interpret", 100);

        _dvd = new DVD("Titel a", "Kommentar", "Regisseur", 100);
        _videospiel = new PCVideospiel("Titel a", "Kommentar", "Wii");

        _medienComparator = new AusleiheMedienFormatiererComparator();
    }

    @Test
    public void testCompareEinMedium()
    {
        assertTrue(_medienComparator.compare(erzeugeFormatierer(_cd3),
                erzeugeFormatierer(_cd1)) > 0);
        assertTrue(_medienComparator.compare(erzeugeFormatierer(_cd1),
                erzeugeFormatierer(_cd2)) < 0);
        assertEquals(0, _medienComparator.compare(erzeugeFormatierer(_cd3),
                erzeugeFormatierer(_cd2)));
    }

    @Test
    public void testCompareVerschiedeneMedien()
    {
        assertTrue(_medienComparator.compare(erzeugeFormatierer(_cd2),
                erzeugeFormatierer(_dvd)) < 0);
        assertTrue(_medienComparator.compare(erzeugeFormatierer(_dvd),
                erzeugeFormatierer(_videospiel)) < 0);
    }

    private AusleiheMedienFormatierer erzeugeFormatierer(Medium medium)
    {
        return new AusleiheMedienFormatierer(medium, false);
    }
}
