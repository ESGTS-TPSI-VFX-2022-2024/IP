import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declarar vector
		int[] valores = {2, 10, 5, 33};
		
		int indice;
		
		System.out.println("Qual a posição?");
		indice = sc.nextInt();
		
		for(int i = indice; i < valores.length-1; i++) {
			//System.out.println(valores[i]);
			valores[i] = valores[i+1];
		}
		
		valores[valores.length-1] = 0;
		
		//mostrar
		for (int i : valores) {
			System.out.println(i);
		}
		
		
	}

}
