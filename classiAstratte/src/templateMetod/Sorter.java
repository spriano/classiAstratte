package templateMetod;

public abstract class Sorter {
	
    // metodo Template bubble sort
	public void sort(Object v[]) {
		for (int i = 1; i < v.length; ++i) {
			for (int j = 0; j < v.length - i; ++j) {
				if (confronta(v[j], v[j + 1]) > 0) {
					Object o = v[j];
					v[j] = v[j + 1];
					v[j + 1] = o;
				}
			}
		}
	}
	public abstract int confronta(Object a, Object b);
	
	public void stampa(Object[] oggetti) {
		for(Object o:oggetti) {
			System.out.println(o);
		}
	}

}
