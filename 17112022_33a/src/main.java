import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// É necessário para ler dados da consola
		Scanner sc = new Scanner(System.in);
		
		// Declarar váriaveis e constantes
		double raio;
		double volume;
		final double PI = Math.PI;
		
		//2. ESCREVER “Qual o raio?”
		System.out.println("Qual o raio?");
		
		//3. FAZER
		do {
			// LER raio
			raio = sc.nextDouble();
		// ENQUANTO (raio <= 0)
		} while (raio <= 0);

		//4. volume = (4 * PI * raio3) / 3
		volume = (4 * PI * Math.pow(raio, 3)) / 3;
		
		//5. ESCREVER “O volume é “ + volume
		System.out.println("O volume é " + volume);
		
		// raio = 10 , volume = 4188.79
	}

}
