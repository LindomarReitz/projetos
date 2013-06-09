package patterns.criacao.multiton;

public class Main {
	/**
	 * Objetivo: Permitir a cria��o de uma quantidade limitada de inst�ncias de
	 * determinada classe e fornecer um modo para recuper�-las.
	 */
	public static void main(String[] args) {
		Tema temaFire = Tema.getIstance(Tema.FIRE);
		System.out.println("Tema: " + temaFire.getNome());
		System.out.println("Cor da Fonte: " + temaFire.getCorDaFonte());
		System.out.println("Cor do Fundo: " + temaFire.getCorDoFundo());

		Tema temaFire2 = Tema.getIstance(Tema.FIRE);

		System.out.println("---------------------");
		System.out.println("Comparando as refer�ncias...");
		System.out.println(temaFire == temaFire2);
	}
}