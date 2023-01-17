
public interface Requisitos9_1_6 {
	
	public String[] nomeCidadesNaoChoveu(
			String[] cidades, 
			int[] precipitacoes);

	public String[] nomeCidadesChoveuMais30(
			String[] cidades, 
			int[] temperaturas, 
			int[] precipitacoes);
	
	public int quantasCidadesNaoChoveuMenos0(
			int[] temperaturas, 
			int[] precipitacoes);
}
