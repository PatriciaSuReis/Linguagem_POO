package atividades;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

	/*2- Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
	 * demais elementos. Escreva ao final a matriz obtida.
	 */
	
	private int[][] matriz = new int [5][5];
	
	public void declaraMatriz() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ler matriz 5 x 5.");
		System.out.println("Escolher digitar os numeros(0) ou gerar aleatoriamente de 1 a 100(1): ");
		int op =  leia .nextInt();
		
		if(op == 0) {
			System.out.println();
			for(int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[1].length; j++) {
					System.out.printf("Digite um para a linha %d e coluna %d:\n", i , j);
					matriz[i][j] = leia.nextInt();
				}
			}// fim for
		}
		else if (op == 1) {
			Random random = new Random();
			
			System.out.println("\nMatriz aleatoria");
			
			for (int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[1].length; j++) {
					matriz[i][j] = random.nextInt(100);
					
					System.out.print(matriz[i][j] + "   ");
				}
				System.out.println();
			}// fim for			
		}// fim else
	}// fim metodo

	public void preencherMatriz() {
		System.out.println("\nMatriz preenchida com 1 na diagonal principal e com 0 os"
				         + " demais elementos.");
		System.out.println("\nMATRIZ");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				if(i == j) {
					matriz[i][j] = 1;
					System.out.print(matriz[i][j] + "   ");
				}
				else {
					matriz[i][j] = 0;
					System.out.print(matriz[i][j] + "   ");
				}// fim if else
			}
			System.out.println();
		}// fim for
		
	}
	
}






