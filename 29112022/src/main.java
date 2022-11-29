import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declarar variaveis
		int horas, minutos, segundos, 
		horasEmSegundos, minutosEmSegundos,
		totalEmSegundos;
		
		final int TEMPO_1 = 7936;
		
		// Ler horas
		System.out.println("Quantas horas?");
		horas = sc.nextInt();
		
		// Ler minutos
		System.out.println("Quantos minutos?");
		minutos = sc.nextInt();
		
		// Ler segundos
		System.out.println("Quantos segundos?");
		segundos = sc.nextInt();
		
		horasEmSegundos = horas * 3600;
		minutosEmSegundos = minutos * 60;
		totalEmSegundos = horasEmSegundos + minutosEmSegundos + segundos;
		
		if (TEMPO_1 > totalEmSegundos) {
			System.out.println("Atleta 2 venceu");
		} else {
			System.out.println("Atleta 1 venceu");
		}		
		
	}

}
