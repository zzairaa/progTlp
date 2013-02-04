package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import base.Attivita;

public class Input {

	private static BufferedReader br;
	
	public static String getTitoloAttivita(){
		String titoloAtt = "";
		br = new BufferedReader(new InputStreamReader(System.in));
		try{
	    	titoloAtt = br.readLine();
		}
		catch (IOException e){
			System.out.println ("errore di flusso");
	    } 
		return titoloAtt;
	}
	public static void inserisci_crea_attivita(){
		System.out.println("sono inserisci_crea_attivita");
		System.out.println("inserisci il titolo dell'attivita: ");
		System.out.println("Il titolo inserito e': ");
	}

}
