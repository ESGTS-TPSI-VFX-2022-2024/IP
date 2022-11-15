
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestarDados();
	}
	
	public static void TestarDados() {
		// DECLARAÇÃO DE VARIÁVEIS
		int numero1 = 12; // declarar e dar valor inicial
		int numero2 = 14; // declarar e dar valor inicial
		float produto, divisao; // declarar e dar valor inicial
		boolean maior;
		
		// DECLARAÇÃO DE CONSTANTES
		final int NUMERO3 = 4;
		
		// PROCESSAMENTO
		numero1 = numero1 - 4;
		System.out.println("Numero1 = " + numero1);
		produto = numero1 * NUMERO3;
		System.out.println("produto = " + produto);
		divisao = numero1 / NUMERO3;
		System.out.println("divisão = " + divisao);
		System.out.println("produto + 1 = " + produto + 1);
		System.out.println("produto + 1 = " + (produto + 1));
		maior = numero1 > NUMERO3;
		System.out.println("maior = " + maior);
		//NUMERO3 = NUMERO3 + 2;
		
		System.out.println(NUMERO3);
	}

}
