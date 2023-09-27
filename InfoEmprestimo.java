package Financiamento;

public class InfoEmprestimo {

	double taxa, valorEmprestimo; //valor do emprestimo e valor da taxa
	int nTempo; //duração do emprestimo
	
    static double prestacao(double taxa, double valorEmprestimo, int nTempo) {
    	double taxaMensal = (taxa / 100) / 12; //calculo da taxa mensal
    	int nMeses = nTempo * 12;
    	
    	if(taxa == 0) {
    		return valorEmprestimo / nMeses;
    	} else {
    		double valorPrestacao = valorEmprestimo * (taxaMensal * Math.pow(1 + taxaMensal, nMeses)) / (Math.pow(1 + taxaMensal, nMeses) -1);
    		return valorPrestacao;
    	}
    }
}
