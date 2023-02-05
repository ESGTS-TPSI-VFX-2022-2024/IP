import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int linhas;
		int colunas;
		
		
		System.out.println("Quantas linhas?");
		linhas = sc.nextInt();
		
		System.out.println("Quantas colunas?");
		colunas = sc.nextInt();
		
		String[][] quadro = CriarQuadro(linhas, colunas);
		PreencherQuadro(quadro);
		System.out.println(MostrarQuadro(quadro));
		
	}
	
	public static String[][] CriarQuadro(int linhas, int colunas){
		return new String[linhas][colunas];	
	}
	
	public static void PreencherQuadro(String[][] quadro) {
		// Percorre todas as linhas da matriz
		for (int i = 0; i < quadro.length; i++) {
			// Percorre todas as colunas de uma LINHA
			for (int j = 0; j < quadro[i].length; j++) {
				
				if (i == 0 
					|| i == quadro.length-1 
					|| j == 0 
					|| j == quadro[i].length-1) {
					
					quadro[i][j] = "*";	
				}
			
			}
		}
	}
	
	public static String MostrarQuadro(String[][] quadro) {
		
		String resultado = "";
		
		for (int i = 0; i < quadro.length; i++) {
			for (int j = 0; j < quadro[i].length; j++) {
				if (quadro[i][j] != null) {
					resultado = resultado + quadro[i][j];
				} else {
					resultado = resultado + " ";
				}
				
			}
			resultado = resultado + "\r\n";
		}
		
		return resultado;
		
	}
	
	
	
	

}
