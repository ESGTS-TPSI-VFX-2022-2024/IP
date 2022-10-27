import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Declarar variáveis
		int lado1;
		int lado2;
		int area;
		int perimetro;
		
		// Escrever na consola
		System.out.println("Introduza o lado 1");
		
		// Ler da consola o lado 1
		lado1 = sc.nextInt();
		
		// Perguntar o lado 2
		System.out.println("Introduza o lado2");
		
		//Ler da consola o lado 2
		lado2 = sc.nextInt();
		
		// Calcular area
		area = lado1 * lado2;
		
		// Calcular o perimetro
		perimetro = (lado1 + lado2) * 2;
		
		// Mostrar resultados
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
	}

}
