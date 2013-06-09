package listaCircular;


public class Main {

	public static void main(String[] args) {
		ListaCircular lista= new ListaCircular();
		
		lista.inserir("Z");
		lista.inserir("B");
		lista.inserir("C");
		
		System.out.println(lista);
		
		lista.excluir("C");
		System.out.println(lista);
		
		lista.excluir("B");
		System.out.println(lista);
		
		lista.excluir("A");
		System.out.println(lista);
		
	}//Main
	
}//Class
