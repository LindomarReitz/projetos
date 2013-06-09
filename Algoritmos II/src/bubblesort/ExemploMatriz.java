package bubblesort;

public class ExemploMatriz {	
	public static void main(String[] args) {
		String tabela[][] = new String[5][4];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				tabela[i][j] = "Teste" + i;
				System.out.println(tabela[i][j]);
			}
		}		
	}
}