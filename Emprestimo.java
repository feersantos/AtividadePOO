package Financiamento;

import java.util.*;

public class Emprestimo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		InfoEmprestimo infoEmprestimo = new InfoEmprestimo();
		
		System.out.print("Valor: ");
		double valorEmprestimo = sc.nextDouble();
		System.out.print("Taxa anual: ");
		double taxa = sc.nextDouble();
		System.out.print("Tempo (anos): ");
		int nTempo = sc.nextInt();
		
		double prestacao = InfoEmprestimo.prestacao(taxa, valorEmprestimo, nTempo);
		System.out.println("\nPrestação: R$ " + prestacao);
				
		sc.close();
	}
}