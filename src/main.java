
public class main{
		static int scelta;
	public static void main(String[] args) {
		System.out.println("sono il main, tutto qui!");
		
		Registrazione_utente.registra_nome_utente();
		Registrazione_utente.registra_password_utente();
		Attivita.gestisci_attivita();
		
		scelta=0;
		
		switch(scelta){
		  case 0: Client_attivita.inserisci_crea_attivita();
		  break;
		  case 1: Attivita.elimina_attivita();
		  break;
//		  default Attivita.messaggio_errore();
		};
	}
}
