import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declarar vector
		int[] aposta = new int[5];
		int[] chave = {10, 15, 32, 41, 48};
		int numerosCertos =  0;
		
		for (int i = 0; i < aposta.length; i++) {
			
			System.out.println("Qual o numero?");
			aposta[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < aposta.length; i++) {
			
			for (int j = 0; j < chave.length; j++) {
				
				if (aposta[i] == chave[j]) {
					numerosCertos++;
				}
				
			}
			
		}
		
		System.out.println("Acertou " + numerosCertos + " numeros...");
		
	}

}
