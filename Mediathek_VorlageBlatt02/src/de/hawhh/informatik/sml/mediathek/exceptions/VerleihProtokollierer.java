package de.hawhh.informatik.sml.mediathek.exceptions;

import de.hawhh.informatik.sml.mediathek.materialien.verleihkarte.Verleihkarte;
import de.hawhh.informatik.sml.mediathek.werkzeuge.VerleihEreignis;

import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{
    /**
     * Protokolliert ein Verleihereignis für eine Verleihkarte.
     * @param ereignis Das Ereignis, das protokolliert werden soll ("Ausleihe" oder "Rückgabe").
     * @param verleihkarte Die Verleihkarte, die protokolliert werden soll.
     */
    public void protokolliere(VerleihEreignis ereignis, Verleihkarte verleihkarte) throws ProtokollierException
    {
    	assert ereignis != null : "Vorbedingung verletzt: ereignis != null";
    	assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte != null";

        try (FileWriter fileWriter = new FileWriter("./protokoll1.txt", true))
        {
            fileWriter.write(ereignis.ereignisString() + " - " + verleihkarte + "\n");
            // fileWriter.close();
        }
        catch (IOException e)
        {
            throw new ProtokollierException(e.getMessage());
        }
    }
}
