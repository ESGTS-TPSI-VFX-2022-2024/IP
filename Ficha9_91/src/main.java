import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declara vector
		int[] valores = {10, 11, 15, 3, 6, 7, 19, 1, 3, 6}; 
		
		System.out.println("O vector tem " + valores.length + " elementos.");
		
		//saber o maior
		int nrMaior = valores[0];
		
		for (int i : valores) {
			if (i > nrMaior) {
				nrMaior = i;
			}
		}
		
		System.out.println("O maior numero é " + nrMaior);
		
		//saber o menor
		int nrMenor = valores[0];
		
		for (int i : valores) {
			if (i < nrMenor) {
				nrMenor = i;
			}
		}
		
		System.out.println("O menor numero é " + nrMenor);
		
		// saber a média
		double media;
		double soma = 0;
		
		for (int i = 0; i < valores.length; i = i + 1) {
			//System.out.println(i);
			soma = soma + valores[i];
		}
		
		media = soma / valores.length;
		
		System.out.println("A média é " + media);
		
		// saber a média (sem maior e menor)
		soma = 0;
		
		for (int i = 0; i < valores.length; i = i + 1) {
			//System.out.println(i);
			
			if (valores[i] != nrMaior && valores[i] != nrMenor) {
				soma = soma + valores[i];
			}
			
		}
		
		media = soma / (valores.length - 2);
		//media = (soma - nrMaior - nrMenor) / (valores.length - 2);
		
		System.out.println("A média é " + media);
		
	}

}
