import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[5];
		double[] precos = new double[5];
		int nrPlacasMenos100 = 0;
		String nomePlacaMaisCara = "";
		double precoPlacaMaisCara = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			
			System.out.println("Qual o nome?");
			nomes[i] = sc.next();
			
			System.out.println("Qual o preco?");
			precos[i] = sc.nextDouble();
			
			if (precos[i] < 100) {
				nrPlacasMenos100++;
			}
			
		}
		
		System.out.println("Existem " + nrPlacasMenos100 + " placas com o valor inferior a 100 euros.");
		
		// Percorrer todas as placas
		for (int i = 0; i < nomes.length; i++) {
			
			//Verificar o preço da placa
			if (precos[i] >= 70 && precos[i] <= 90) {
				//Mostrar o nome da placa
				System.out.println("A placa com o nome " + nomes[i] + " custa entre 70 e 90 euros.");
			}
			
			if (precos[i] > precoPlacaMaisCara) {
				nomePlacaMaisCara = nomes[i];
				precoPlacaMaisCara = precos[i];
			}
			
		}
		
		System.out.println("A placa " + nomePlacaMaisCara + " é a mais cara.");
	}

}
