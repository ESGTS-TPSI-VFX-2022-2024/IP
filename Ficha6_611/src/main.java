import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variaveis
		int idade;
		String escalao;
		
		// Perguntar a idade
		System.out.println("Qual a idade?");
		idade = sc.nextInt();
		
		// Verificar qual o escalão
		switch(idade) {
			case 1:
				escalao = "UM";
				break;
			case 2 :
				escalao = "DOIS";
				break;
			case 3 :
				escalao = "TRÊS";
				break;
			case 4 :
				escalao = "QUATRO";
				break;
			default:
				escalao = "N/A";
		}
		
		// Mostrar o escalão
		System.out.println("O escalão é " + escalao);
		
	}

}
