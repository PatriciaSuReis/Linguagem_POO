package atividades;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {

	/*3- Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a
	 * coluna) do maior valor*/
	
	private int[][] matriz = new int[4][4];
	
	public void lerMatriz() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("LER MATRIZ 4 x 4");
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
			
			System.out.println("\nMATRIZ ALEATORIA");
			
			for (int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[1].length; j++) {
					matriz[i][j] = random.nextInt(100);
					
					System.out.print(matriz[i][j] + "   ");
				}
				System.out.println();
			}// fim for			
		}// fim else
	}// fim metodo
	
	public void maiorValor() {
		int maiorValor = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				if(matriz[i][j] > maiorValor) {
					maiorValor = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
		}// fim for
		
		System.out.println("\nMAIOR VALOR DA MATRIZ.");
		System.out.println("Valor:  " + maiorValor);
		System.out.println("Linha:  " + linha);
		System.out.println("Coluna: " + coluna);
		
	}// fim metodo
	
}
