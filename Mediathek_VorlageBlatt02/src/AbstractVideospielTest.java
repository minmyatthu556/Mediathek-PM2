import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class AbstractVideospielTest extends AbstractMediumTest
{
    protected static final String BEZEICHNUNG = "Videospiel";

    private AbstractVideospiel _videospiel;

    public AbstractVideospiel getExamplar()
    {
        return _videospiel;
    }

    public AbstractVideospielTest() {
        _videospiel = (AbstractVideospiel) getMedium();
    }

    @Test
    public void testGetMedienBezeichnung() {
        assertEquals(BEZEICHNUNG, _videospiel.getMedienBezeichnung());
    }

    @Test
    public abstract void testGetSystem();

    @Test
    public abstract void testSetSystem();
}
