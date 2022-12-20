import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declaração de variáveis
		String letraEstadoCivil;
		String estadoCivil;
		String genero;
		
		//Perguntar ao utilizador
		System.out.println("Qual a letra inicial do estado civil?");
		letraEstadoCivil = sc.next();
		
		// Pergutar ao utilizador o genero
		System.out.println("Qual o genero?");
		genero = sc.next();
		
		switch(letraEstadoCivil.toUpperCase()) {
			case "S":
				estadoCivil = genero.toUpperCase() == "M" ?  "Solteiro" : "Solteira";
				break;
			case "C":
				estadoCivil = genero.toUpperCase() == "M" ? "Casado" : "Casada";
				break;
			case "V":
				estadoCivil = genero.toUpperCase() == "M" ? "Viúvo" : "Viúva";
				break;
			case "D":
				estadoCivil = genero.toUpperCase() == "M" ? "Divorciado" : "Divorciada";
				break;
			default:
				estadoCivil = "N/A";
		}
		
		System.out.println("Estado Civil = " + estadoCivil);
		
	}

}
