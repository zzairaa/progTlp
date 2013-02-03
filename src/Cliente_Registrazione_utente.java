
public class Cliente_Registrazione_utente {
	public static void inserisci_nome_utente(){
			System.out.println("sono inserisci_nome_utente");
			System.out.println("inserisci il nome utente: ");
		    String nome = Registrazione_utente.registra_nome_utente();
		    System.out.println("n: "+nome);
		      
	}
	public static void inserisci_password_utente(){
		System.out.println("sono inserisci_password_utente");
		System.out.println("inserisci la password: ");
	    String nome = Registrazione_utente.registra_password_utente();
	    System.out.println("n: "+nome);
	      
}
}