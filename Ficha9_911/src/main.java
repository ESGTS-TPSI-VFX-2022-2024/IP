
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Declara um vector
		int[] sequencia = {33, 2, 4, 52, 10};
		
		for (int i = sequencia.length-1; i>=0; i--) {
			//System.out.println(sequencia[i]);
		}
		
		// Ordenar vector decrescente
		int alteracoes = 0;
		boolean continuar = true;
		
		while (continuar == true) {
			
			for(int i = 0; i < sequencia.length - 1; i++) {
				if (sequencia[i] > sequencia[i+1]) {
					int temp = sequencia[i];
					
					sequencia[i] = sequencia[i+1];
					sequencia[i+1] = temp;
					
					alteracoes++;
				}
			}
			
			if (alteracoes == 0) {
				continuar = false;
			}
			
			alteracoes = 0;
			
		}
		
		//mostrar ordenacao
		for (int i : sequencia) {
			System.out.println(i);
		}
		
	}

}
