import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		// Declarar variaveis
		double salario;
		double novoSalario;
		int escalao;
		
		// Perguntar ao utilizador
		System.out.println("Qual o salário atual?");
		salario = sc.nextDouble();
		
		escalao = (salario >= 1000 && salario < 1200) ? 1 : ((salario >= 1200 && salario < 1400) ? 2 : 0);
		//escalao = ((salario >= 1200 && salario < 1400) ? 2 : 0);
		
		switch (escalao) {
			case 1:
				novoSalario = salario + (salario * 0.12);
				break;
			case 2:
				novoSalario = salario + (salario * 0.10);
				break;
			default:
				novoSalario = salario + (salario * 0.08);
				break;
		}
		
		System.out.println("O novo salário é " + novoSalario);
		
	}

}
