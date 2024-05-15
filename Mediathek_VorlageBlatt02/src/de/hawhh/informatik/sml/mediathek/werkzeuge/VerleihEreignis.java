package de.hawhh.informatik.sml.mediathek.werkzeuge;

public enum VerleihEreignis
{
    AUSLEIHE, RUECKGABE;

    public String ereignisString()
    {
        switch (this)
        {
            case AUSLEIHE: return "Ausleihe";
            case RUECKGABE: return "Rückgabe";
            default: return null;
        }
    }
}
