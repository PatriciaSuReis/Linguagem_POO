package atividades;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {

	/*1- Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela
	 * possui.*/
	
	private int[][] matriz =  new int[4][4];
	private int[][] matrizMaiorQueDez;
	
	public void lerMatriz() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ler matriz 4 x 4.");
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
	
	public int maiorQueDez() {
		int qtdDeMaiores = 0;
		
		System.out.println("\nValores maiores que 10 na matriz.");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				if (matriz[i][j] > 10) {
					qtdDeMaiores++;
					System.out.print(matriz[i][j] + "   ");
				}
			}
			System.out.println();
		}// fim for
		
		System.out.println("\n\nQuantidade de valores maior que 10: " + qtdDeMaiores);
		
		return qtdDeMaiores;
	}
	
	
	
	
	
	
}





















