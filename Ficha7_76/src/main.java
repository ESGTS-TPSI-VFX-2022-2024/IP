import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Variaveis
		int nrVezes;
		int nrVezesCara = 0;
		int nrVezesCoroa = 0;
		boolean resultado;
		int nrVezesTotal = 0;
		
		System.out.println("Quantas vezes?");
		nrVezes = sc.nextInt();
		
		while (nrVezes > nrVezesCara && nrVezes > nrVezesCoroa) {
			// Fazer lançamento
			
			resultado = Math.random() > 0.5 ? true : false;
			
			if (resultado) {
				nrVezesCoroa++;
			} else {
				nrVezesCara++;
			}
			
			nrVezesTotal++;
			
		}
		
		System.out.println("Caras = " + nrVezesCara);
		System.out.println("Coroas = " + nrVezesCoroa);
		
		System.out.println("Percentagem Caras = " + (double)nrVezesCara / nrVezesTotal * 100 + " %");
		System.out.println("Percentagem Coroas = " + (double)nrVezesCoroa / nrVezesTotal * 100 + " %");
		
	}

}
