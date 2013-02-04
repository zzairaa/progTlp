
import java.util.LinkedList;
import java.util.List;

import base.Attivita;

import gestoreAttivita.GestoreAttivita;
import input.Input;


public class Main{
	enum  Scelta{ADD_PROJ,ADD_ATT, DEL_ATT};
	static Scelta scelta;
	
	public static void main(String[] args) {
		System.out.println("sono il main, tutto qui!");
		
			GestoreAttivita gA = new GestoreAttivita();
			
			Registrazione_utente.registra_nome_utente();
			Registrazione_utente.registra_password_utente();
			String titoloAttivita = Input.getTitoloAttivita();
			Attivita a = new Attivita(titoloAttivita);
			gA.addAttivita(a);
			
			scelta=Scelta.ADD_PROJ;
			
			switch(scelta){
			case ADD_PROJ: ;
			break;
			case DEL_ATT: gA.eliminaAttivita(titoloAttivita);
			break;
//			default Attivita.messaggio_errore();
		};
	}
}
