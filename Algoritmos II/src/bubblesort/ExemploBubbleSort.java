package bubblesort;

import javax.swing.JOptionPane;

public class ExemploBubbleSort {
	public static void main(String[] args) {
        int troca, fim, i, aux;
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
        int vetorOrdenar[] = new int[tamanho];
        
        System.out.println("Vetor antes da ordenação:");
        for (int k = 0; k < vetorOrdenar.length; k++) {
        	vetorOrdenar[k] = (int) (Math.random() * 35);
        
        	System.out.println(vetorOrdenar[k]);
        }
        System.out.println("-----------------------\n");
        
        troca = 1;
		fim = tamanho - 1;
        while(troca == 1) {
             troca = 0;
             for(i=0; i<fim;i++) {
                  if (vetorOrdenar[i] > vetorOrdenar[i+1]) { 
                       aux = vetorOrdenar[i];
                       vetorOrdenar[i] = vetorOrdenar[i+1];
                       vetorOrdenar[i+1]=aux;
                       troca = 1;
                  } 
             }
        }
        
        System.out.println("Vetor depois da ordenação:");
        for (int valor : vetorOrdenar) {
        	System.out.println(valor);
        }
        System.out.println("-----------------------");
	}
}