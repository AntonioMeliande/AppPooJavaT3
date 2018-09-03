package testes;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		
		final int ANO_ATUAL = 2018;
		
		Scanner ler = new Scanner(System.in);

		String nomeM;
		System.out.printf("Informe o seu nome: ");		
		nomeM = ler.next();		
		
		int idadeM;
		idadeM = ler.nextInt();		
		
		float mensalidadeM;
		System.out.printf("Informe o valor da sua mensalidade: ");		
		mensalidadeM = ler.nextFloat();		
		
		boolean masculinoM;
		System.out.printf("Informe masculino ou femino: ");		
		masculinoM = ler.nextBoolean();
		
		String nomeJ;
		System.out.printf("Informe o seu nome: ");		
		nomeJ = ler.next();		
		
		int idadeJ;
		System.out.printf("Informe sua idade: ");		
		idadeJ = ler.nextInt();		
		
		
		float mensalidadeJ;
		System.out.printf("Informe o valor da sua mensalidade: ");		
		mensalidadeJ = ler.nextFloat();		
		
		
		boolean masculinoJ;
		System.out.printf("Informe masculino ou femino: ");		
		masculinoJ = ler.nextBoolean();
		
		
		System.out.printf("%s %s tem %d anos e paga R$%.2f\n",
				(masculinoM ? "Masculino" : "Femino"),
				nomeM,
				idadeM,
				mensalidadeM
			);
		System.out.println("Ano de nascimento: " + (ANO_ATUAL - idadeM));
		
		if (mensalidadeM >= 1000) {
		System.out.println("Muito Caro!!");	
		} else if (mensalidadeM >= 500 & mensalidadeM < 1000) {
				System.out.println("Barato!!");
			} else {
				System.out.println("Muito Barato!!");
			}
		{
		System.out.printf("%s é o aluno mais velho\n",
				(idadeM >= idadeJ ? nomeM : nomeJ));
		}
		System.out.printf("%s é o aluno com maior mensalidade\n",
				(mensalidadeM >= mensalidadeJ ? nomeM : nomeJ));
}
}