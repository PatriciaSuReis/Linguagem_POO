package lista_2;

import java.util.Scanner;

public class Ex3 {

	protected int qtdPositivo, qtdNegativo, qtdTotal;
	
	public int core() {
		
		Scanner leia = new Scanner(System.in);
		int sentinela = 1;
		int somatorio = 0;
		int receberValor;
		
		while( sentinela != 0) {
			System.out.print("Digite um valor: ");
			receberValor = leia.nextInt();
			
			if (receberValor == 0) {
				break;
			}
			
			somatorio = somatorio + receberValor;
			
			if (receberValor < 0) {
				qtdNegativo = qtdNegativo + 1;
			}
			else {
				qtdPositivo = qtdPositivo + 1;
			}
			
			qtdTotal = qtdTotal + 1;
		}// fim while
		return somatorio;
	}// fim core
	
	public void relatorio(int somaTotal) {
		
		System.out.println("\notal de entradas: " + qtdTotal);
		System.out.println("Total de positivos: " + qtdPositivo);
		System.out.println("Total de negativos: " + qtdNegativo);
		
		double percePositivo = ((double)qtdPositivo / (double)qtdTotal) * 100.0;
		
		System.out.println("Percentual de positivos: " + percePositivo);
		
		double perceNegativo = ((double)qtdNegativo / (double)qtdTotal) * 100.0;
		
		System.out.println("Percentual de negativos: " + perceNegativo);
		
		System.out.println("Media: " + somaTotal / qtdTotal);
		
	}
	
	
}
