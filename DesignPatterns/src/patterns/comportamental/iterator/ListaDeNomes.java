package patterns.comportamental.iterator;

import java.util.Iterator;

public class ListaDeNomes implements Iterable<String> {
	private String[] nomes;
	private int length;
	
	public ListaDeNomes(String[] nomes) {
		this.nomes = nomes;
		this.length = this.nomes.length;
	}

	@Override
	public Iterator<String> iterator() {
		return this.new ListaDeNomesInterator();
	}
	
	private class ListaDeNomesInterator implements Iterator<String> {
		private int i = 0;
		
		@Override
		public boolean hasNext() {
			return (this.i) < ListaDeNomes.this.length;
		}
	
		@Override
		public String next() {
			return ListaDeNomes.this.nomes[i++];
		}
	
		@Override
		public void remove() {
			ListaDeNomes.this.nomes[i] = null;
			
			for (int j = 0; j < ListaDeNomes.this.length; j++) {
				ListaDeNomes.this.nomes[j] = ListaDeNomes.this.nomes[j++];
			}
			ListaDeNomes.this.length--;
		}
	}
}