package patterns.criacao.multiton;

public class Main {
	/**
	 * Objetivo: Permitir a criação de uma quantidade limitada de instâncias de
	 * determinada classe e fornecer um modo para recuperá-las.
	 */
	public static void main(String[] args) {
		Tema temaFire = Tema.getIstance(Tema.FIRE);
		System.out.println("Tema: " + temaFire.getNome());
		System.out.println("Cor da Fonte: " + temaFire.getCorDaFonte());
		System.out.println("Cor do Fundo: " + temaFire.getCorDoFundo());

		Tema temaFire2 = Tema.getIstance(Tema.FIRE);

		System.out.println("---------------------");
		System.out.println("Comparando as referências...");
		System.out.println(temaFire == temaFire2);
	}
}