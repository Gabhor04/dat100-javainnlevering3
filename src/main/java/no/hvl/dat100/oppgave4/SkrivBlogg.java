package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        boolean skrevet;
        PrintWriter skrivar;

        try {
            skrivar = new PrintWriter(mappe + filnavn);
            skrivar.print(samling.toString());
            skrivar.close();
            skrevet = true;
        }
        catch(FileNotFoundException e) {
            System.out.println("Fil ikkje funnet");
            skrevet = false;
        } return skrevet;
	}
}
