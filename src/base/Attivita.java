package base;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Attivita {
	String titoloAtt;
	
	public Attivita(String titoloAtt){
		this.titoloAtt = titoloAtt;
	}
	public void gestisciAttivita(){
		System.out.println("sono gestisci attivita");
	}//IL METODO CREA_ATTIVITA DEVE PRENDERE ANCHE LA SCADENZA E L'ID UTENTE!!
	
	public String getTitoloAtt(){
		return titoloAtt;
	}
	
}