package testes;

import java.util.Scanner;

public class TestaProfessor {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		System.out.printf("Informe o seu nome: ");		
		nome = ler.nextLine();		

		int matricula;
		System.out.printf("Informe a sua matr�cula: ");		
		matricula = ler.nextInt();		

		float salario;
		System.out.printf("Informe o seu sal�rio: ");		
		salario = ler.nextFloat();		

		boolean temporario;
		System.out.printf("Informe se � um professor tempor�rio: ");		
		temporario = ler.nextBoolean();
		
		int experiencia;
		System.out.printf("Informe a sua experiencia: ");		
		experiencia = ler.nextInt();	
		
		float bonus;
		System.out.printf("Informe o valor do bonus: ");		
		bonus = ler.nextFloat();	
		
		float gratificacao;
		System.out.printf("Informe o valor da gratificacao: ");		
		gratificacao = ler.nextFloat();	
		
		int desconto;
		System.out.printf("Informe o desconto: ");		
		desconto = ler.nextInt();	
		
		int disciplinas;
		System.out.printf("Informe a quantidade de disciplinas: ");		
		disciplinas = ler.nextInt();

		float salarioBruto = 0;
		final float VL_EXPERIENCIA = 50;
		final float VL_DISCIPLINA = 100;
				
		salarioBruto = (salario + bonus + gratificacao - desconto);
		salarioBruto = salarioBruto + (experiencia * VL_EXPERIENCIA);
		salarioBruto = salarioBruto + (disciplinas * VL_DISCIPLINA);

				
		System.out.println("Nome: " + nome);
		System.out.println("Matr�cula: " + matricula);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Tempor�rio? " + (temporario ? "Sim" : "N�o"));
		System.out.println("Experiencia: " + experiencia);
		System.out.println("Bonus: " + bonus);
		System.out.println("Gratifica��o: " + gratificacao);
		System.out.println("Desconto: " + desconto);
		System.out.println("Disciplinas: " + disciplinas);
		System.out.printf("O professor %s (%d) � %s, pois ganha R$%.2f\n",
				nome,
				matricula,
				(salarioBruto >= 10000 ? "rico" : "pobre"),
				salarioBruto);
		
	}
}
