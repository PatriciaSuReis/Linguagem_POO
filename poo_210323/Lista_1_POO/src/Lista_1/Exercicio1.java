package Lista_1;

public class Exercicio1 {

	/*Faça um programa que leia os valores A, B, C e imprima na tela se a 
	 * soma de A + B é menor que C.*/
	
	int A;
	int B;
	int C;
	
	int valor;
	
	public void somaEMenor(int A, int B , int C) {
		valor = A + B;
		
		System.out.println("A= "+ A + "\nB= " + B + "\nC=" + C);
		
		System.out.println("Soma de A e B= " + valor);
		
		if (valor < C) {
			System.out.println("A soma de A+B é menor que o valor C.");
		}
		else if (valor == C) {
			System.out.println("A soma é igua o valor C.");
		}
		else {
			System.out.print("fA soma de A+B é maior que o valor C.");
		}
	}
	
}
