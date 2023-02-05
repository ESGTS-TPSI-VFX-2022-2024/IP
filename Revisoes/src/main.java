
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int nrDobragens = 1;
		
		/*do {
			System.out.println("Dobragem = " + nrDobragens);
			nrDobragens++;
		} while (nrDobragens <= 50);*/
		
		nrDobragens = 0;
		
		/*while (nrDobragens < 50) {
			nrDobragens++;
			System.out.println("Dobragem = " + nrDobragens);
		}*/
		
		for (int i = 0; i <= 50; i = i + 5) {
			//System.out.println("Dobragem = " + i);
		}
		
		String teste = "5454";
		
		System.out.println(teste.substring(1, 2));
		
		int numero = Integer.parseInt(teste);
		System.out.println(numero + 10);
		
		
	}

}
