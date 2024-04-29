package cibi;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"Riso", "Tonno", "Mandorle", "Noci", "Pollo", "Tacchino", "Cocco", "Fegato", "Uova", "Mais"};
		
		System.out.println("La classifica contiene "+cibiPreferiti.length+" cibi");
		System.out.println("Il tuo cibo preferito é il "+cibiPreferiti[0]);
		System.out.println("Il tuo cibo meno preferito é il "+cibiPreferiti[cibiPreferiti.length - 1]);
		
		// se l'array è pari ne mostro 2 altrimenti solo quello che si trova al centro
		if((cibiPreferiti.length % 2) == 0){
			System.out.println("I tuoi cibi a metà classifica sono "+cibiPreferiti[(cibiPreferiti.length / 2)-1]+" e "+cibiPreferiti[(cibiPreferiti.length /2)]);
		}else {
			System.out.println("Il tuo cibo a metà classifica é "+ cibiPreferiti[cibiPreferiti.length / 2]);
		}
		
	}
	
}
