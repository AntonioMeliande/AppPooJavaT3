package negocios;

public class Politico {
	
	String nome;
	public float salario;
	public boolean senador;
	public int qtdeMandatos;
	
	final int MESES_ANO = 12;
	final int MAND_4 = 4;
	final int MAND_8 = 8;
	
	private float CalcularSalarioTotal(){
		int meses = MESES_ANO * (senador ? MAND_8 : MAND_4);
		
		meses = qtdeMandatos * meses;
		
		return meses * salario;
		
	
	}
		
	public void Show() {
		System.out.printf(
				"%s arrecadou R$%.2f em sua vida politica.\n",
				nome,
				CalcularSalarioTotal()
				);
	}

}
