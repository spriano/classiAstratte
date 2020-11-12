package templateMetod;

public class PersonaSorter extends Sorter{

	@Override
	public int confronta(Object a, Object b) {
		Persona pa = (Persona) a;
		Persona pb = (Persona) b;
		String sa=pa.getNome();
		String sb=pb.getNome();
		return (sa).compareTo(sb);
	}

}
