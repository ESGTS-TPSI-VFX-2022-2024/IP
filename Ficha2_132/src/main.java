import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variaveis
		int lado1;
		int lado2;
		int perimetro;
		int area;
		Scanner sc = new Scanner(System.in);
		
		// Pedir lado1 até ser maior do que zero
		do {
			System.out.println("Introduza o lado 1");
			lado1 = sc.nextInt();
		} while (lado1 <= 0);
		
		// Pedir lado2 até ser maior do que zero
		do {
			System.out.println("Introduza o lado 2");
			lado2 = sc.nextInt();
		} while (lado2 <= 0);
		
		// Calcular area
		area = lado1 * lado2;
		
		// Calcular o perimetro
		perimetro = (lado1 + lado2) * 2;
		
		// Mostrar resultados
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
		
	}

}
