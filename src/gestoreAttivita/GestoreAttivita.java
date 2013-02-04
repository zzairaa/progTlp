package gestoreAttivita;

import java.util.List;

import base.Attivita;

public class GestoreAttivita {

	private List<Attivita> listaAttivita;
	
	public void addAttivita(Attivita a){
		listaAttivita.add(a);
	}
	public Attivita getAttivita(int index){
		return listaAttivita.get(index);
	}
	public void eliminaAttivita(String toRemove){
		for( Attivita a: listaAttivita ){ // Per ogni attivita in listaAttivita
			if( a.getTitoloAtt().equals(toRemove) ){ // E' quella da rimuovere
				listaAttivita.remove(a);
			}
		}
	}
}
