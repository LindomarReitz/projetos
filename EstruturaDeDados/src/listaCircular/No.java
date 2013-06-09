package listaCircular;

public class No {
	String info;
	No proximo;
	
	public No(String info){
		this.info= info;
		proximo= null;
	}
	
	public String toString(){
		return info;
	}
	
}
