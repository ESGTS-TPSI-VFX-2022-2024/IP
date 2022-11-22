import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declarar variaveis
		int a, b;
		
		System.out.println("Qual o A?");
		a = sc.nextInt();
		
		System.out.println("Qual o B?");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a);
		} else {
			if (b > a) {
				System.out.println(b);
			} else {
				System.out.println("A = B");
			}
		}
		
	}

}
