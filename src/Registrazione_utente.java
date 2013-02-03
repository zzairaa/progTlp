import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Registrazione_utente {
	static BufferedReader br;
    static String nome_utente;
    static String password_utente;
	public static String registra_nome_utente(){
		System.out.println("inserire username");
		br = new BufferedReader(new InputStreamReader(System.in));
	    try{
	       nome_utente = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println ("errore di flusso");
	        
	    } 
	    System.out.println("nome utente "+nome_utente);
	    return(nome_utente);
	    
	    }
	
	public static String registra_password_utente(){
		System.out.println("inserire password");
		br = new BufferedReader(new InputStreamReader(System.in));
	    try{
	    	password_utente= br.readLine();
	    }
	    catch (IOException e){
	        System.out.println ("errore di flusso");
	        
	    } 
	    System.out.println("password "+password_utente);
	    return(nome_utente);
	    
	    }
}
	
	