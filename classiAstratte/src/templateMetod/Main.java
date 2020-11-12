package templateMetod;

public class Main {

	public static void main(String[] args) {
		Sorter ps=new PersonaSorter();
		Sorter ss=new StringaSort();
		String[] stringhe= {"Giovanni","Aldo","Giacomo"};
		Persona[] persone = {new Persona("Tino"),new Persona("Gino"),new Persona("Pino")};
		
		System.out.println("------Persone prima-----");
		ps.stampa(persone);
		
		ps.sort(persone);
		System.out.println("------Persone dopo-----");
		ps.stampa(persone);
		
		System.out.println("------prima-----");
		ss.stampa(stringhe);
		
		ss.sort(stringhe);
		System.out.println("------dopo-----");
		ss.stampa(stringhe);
	}
	
}
