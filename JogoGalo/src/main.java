import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Declarar variaveis
		String[][] tabuleiro = new String[3][3];
		int linhaJogada, colunaJogada;
		boolean jogoNaoTerminou = true;
		int jogadorAtual = 1;
		int nrJogadas = 0;
		
		
		while(jogoNaoTerminou) {
			
			System.out.println("JOGADOR " + jogadorAtual);
			
			System.out.println("Qual a linha?");
			linhaJogada = sc.nextInt();
			
			System.out.println("Qual a coluna?");
			colunaJogada = sc.nextInt();
			
			if (tabuleiro[linhaJogada-1][colunaJogada-1] == null) {
				tabuleiro[linhaJogada-1][colunaJogada-1] = (jogadorAtual == 1 ? "X" : "O");
				jogadorAtual = (jogadorAtual == 1 ? 2 : 1);
				nrJogadas ++;
			} else {
				System.out.println("JOGADA INVÁLIDA");
			}
			
			System.out.println(MostrarTabuleiro(tabuleiro));
			
			if (VerificarJogadorGanhou(tabuleiro, "X")) {
				System.out.println("JOGADOR 1 GANHOU!!!");
				jogoNaoTerminou = false;
			} else if (VerificarJogadorGanhou(tabuleiro, "O")) {
				System.out.println("JOGADOR 2 GANHOU!!!");
				jogoNaoTerminou = false;
			} else if (nrJogadas == 9) {
				System.out.println("EMPATE!!!");
				jogoNaoTerminou = false;
			}
			
			
		} // FIM DO WHILE
		
		

	}
	
	public static String MostrarTabuleiro(String[][] tabuleiro) {
		
		String resultado = "";
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {	
				resultado = resultado + " " + tabuleiro[i][j];
			}
			
			//Quebra de linha
			resultado = resultado + "\r\n";
		}
		
		return resultado;
		
	} // FIM MOSTRAR TABULEIRO
	
	public static boolean VerificarJogadorGanhou(String[][] tabuleiro, String letra) {
		boolean jogadorGanhou = false;
		int contaXLinha = 0;
		int contaXColuna = 0;
		
		//Verificar Linhas
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == letra) {
					contaXLinha++;
				}	
			}
			
			if (contaXLinha == 3) {
				jogadorGanhou = true;
			}
			
			contaXLinha = 0;
		}
		
		// Verificar colunas
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[j][i] == letra) {
					contaXColuna++;
				}	
			}
			
			if (contaXColuna == 3) {
				jogadorGanhou = true;
			}
			
			contaXColuna = 0;
		}
		
		// Verificar Diagonal 1 
		if(tabuleiro[0][0] == letra) {
			if(tabuleiro[1][1] == letra) {
				if(tabuleiro[2][2] == letra) {
					jogadorGanhou = true;
				}
			}
		}
		
		// Verificar Diagonal 2 
		if(tabuleiro[0][2] == letra) {
			if(tabuleiro[1][1] == letra) {
				if(tabuleiro[2][0] == letra) {
					jogadorGanhou = true;
				}
			}
		}
		
		return jogadorGanhou;
	} // FIM VerificarJogador1Ganhou
	
}
