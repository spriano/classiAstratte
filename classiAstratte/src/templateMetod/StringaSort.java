package templateMetod;

public class StringaSort extends Sorter{

	@Override
	public int confronta(Object a, Object b) {
	
		String sa = (String) a;
		String sb = (String) b;

		return sa.compareTo (sb);

	}

}
