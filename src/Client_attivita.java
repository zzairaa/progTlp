
public class Client_attivita {
	public static void inserisci_crea_attivita(){
		System.out.println("sono inserisci_crea_attivita");
		System.out.println("inserisci il titolo dell'attivita: ");
	      String e = Attivita.crea_attivita();
	      System.out.println("Il titolo inserito è: "+e);
	}
}
