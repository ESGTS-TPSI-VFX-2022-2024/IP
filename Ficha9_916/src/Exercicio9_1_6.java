import java.util.Scanner;

public class Exercicio9_1_6 implements Requisitos9_1_6 {

	public static void main(String[] args) {
		
		String[] cidades = new String[5];
		int[] temperaturas = new int[5];
		int[] precipitacoes = new int[5];
		
		lerDados(cidades, temperaturas, precipitacoes);
		
		Exercicio9_1_6 ex = new Exercicio9_1_6();
		String[] nomes = ex.nomeCidadesNaoChoveu(cidades, precipitacoes);
		for (String nome : nomes) {
			if (nome != null) {
				System.out.println(nome);
			}
		}
		
		
	}
	
	public static void lerDados(String[] cidades, int[] temperaturas, int[] precipitacoes) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < cidades.length; i++) {
			
			System.out.println("Qual o nome da cidade?");
			cidades[i] = sc.next();
			
			System.out.println("Qual a temperatura?");
			temperaturas[i] = sc.nextInt();
			
			System.out.println("Qual a precipitação?");
			precipitacoes[i] = sc.nextInt();
			
		}
		
	}

	
	public String[] nomeCidadesNaoChoveu(String[] cidades, int[] precipitacoes) {
		
		String[] cidadesNaoChoveu = new String[cidades.length];
		int nrCidadesNaoChoveu = 0;
		
		for (int i = 0; i < precipitacoes.length; i++) {
			
			if (precipitacoes[i] == 0) {
				cidadesNaoChoveu[nrCidadesNaoChoveu] = cidades[i];
				nrCidadesNaoChoveu++;
			}
			
		}
		
		return cidadesNaoChoveu;
		
	}

	
	public String[] nomeCidadesChoveuMais30(String[] cidades, int[] temperaturas, int[] precipitacoes) {

		String[] nomesCidadesChoveuMais30 = new String[cidades.length];
		int nrCidadesChoveuMais30 = 0;
		
		for (int i = 0; i < cidades.length; i++) {
			
			if (temperaturas[i] > 30 && precipitacoes[i] > 0) {
				nomesCidadesChoveuMais30[nrCidadesChoveuMais30] = cidades[i];
				nrCidadesChoveuMais30++;
			}
			
		}
		
		return nomesCidadesChoveuMais30;
		
	}

	
	public int quantasCidadesNaoChoveuMenos0(int[] temperaturas, int[] precipitacoes) {

		int nrCidadesNaoChoveuMenos0 = 0;
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			if (temperaturas[i] < 0 && precipitacoes[i] == 0) {
				nrCidadesNaoChoveuMenos0++;
			}
			
		}
		
		return nrCidadesNaoChoveuMenos0;
		
	}

}
