import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Attivita {
	static BufferedReader br;
    static String titolo_att;
	public static void gestisci_attivita(){
		System.out.println("sono gestisci attivita");
	}//IL METODO CREA_ATTIVITA DEVE PRENDERE ANCHE LA SCADENZA E L'ID UTENTE!!
	
	public static String crea_attivita(){
		br = new BufferedReader(new InputStreamReader(System.in));
	    try{
	       titolo_att = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println ("errore di flusso");
	    } 
	    System.out.println(titolo_att);
	    return(titolo_att);
	}
	
	public static void elimina_attivita(){
		System.out.println("io elimino attivita");
	}
	
	public static void messaggio_errore(){
		System.out.println("comando errato");
	}
	
}