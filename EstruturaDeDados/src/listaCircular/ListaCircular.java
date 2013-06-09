package listaCircular;

public class ListaCircular {
	int tamanho;
	No local = null;
	
	public void inserir(String in){
		No no= new No(in); //Criando o objeto no
		if(local == null){
			local = no;
			local.proximo= local;
			
		}else{
			no.proximo= local.proximo;
			local.proximo= no;
		}
		tamanho++;
	}
	
	public void limpar(){
		tamanho= 0;
		local= null;
	}
	
	public String pegarProximo(){
		local= local.proximo;
		return local.info;
	}
	
	public void excluir(String str){
		No anterior= local;
		String strNo= pegarProximo();
		int i=0;
		
		while(!str.equals(strNo) && (i<tamanho)){
			anterior= local;
			strNo= pegarProximo();
			i++;
		}
		if(strNo.equals(str)){
			if(tamanho == i){
				local= null;
			}
			anterior.proximo= local.proximo;
			local= anterior;
			tamanho--;
		}	
	}
	
	public String toString(){
		String saida="(";
		for(int i=0; i<tamanho; i++){
			saida+= pegarProximo()+", ";
		}
		saida+=")";
		
		return saida;
	}
}
