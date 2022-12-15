
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("####### CASO 1 #######");
		
		int soma = 0;
		
		for (int i = 1; i <= 5; i++) {
			soma = soma + i;
		}
		
		System.out.println("Soma = " + soma);
		
		
		
		
		
		System.out.println("####### CASO 2 #######");
		
		soma = 0;
		
		for (int i = 1; i <= 5; i++) {

			System.out.println("i = " + i);
			
			if (i % 2 == 0)
				soma = soma + i;
			
		}
		
		System.out.println("Soma = " + soma);
		
	}

}
