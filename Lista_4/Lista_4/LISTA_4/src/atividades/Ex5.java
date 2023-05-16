package atividades;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {

	/*5- Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de
	 * cada posi��o das matrizes lidas.
	 * */
	
	private int[][] matriz1 =  new int[4][4];
	private int[][] matriz2 =  new int[4][4];
	private int[][] matriz3 =  new int[4][4] ;
	
	public void lerMatriz() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ler matriz 4 x 4.");
		System.out.println("Escolher digitar os numeros(0) ou gerar aleatoriamente de 0 a 100(1): ");
		int op =  leia .nextInt();
		
		if(op == 0) {
			System.out.println();
			System.out.println("Preenchar a MATRIZ 1");
			for(int i = 0; i < matriz1[0].length; i++) {
				for (int j = 0; j < matriz1[1].length; j++) {
					System.out.printf("Digite um para a linha %d e coluna %d:\n", i , j);
					matriz1[i][j] = leia.nextInt();
				}
			}// fim for
			
			System.out.println("\nPreenchar a MATRIZ 2");
			for(int i = 0; i < matriz2[0].length; i++) {
				for (int j = 0; j < matriz2[1].length; j++) {
					System.out.printf("Digite um para a linha %d e coluna %d:\n", i , j);
					matriz1[i][j] = leia.nextInt();
				}
			}// fim fo
		}
		else if (op == 1) {
			Random random = new Random();
			
			System.out.println("\nMATRIZ 1 ALEATORIA");
			for (int i = 0; i < matriz1[0].length; i++) {
				for (int j = 0; j < matriz1[1].length; j++) {
					matriz1[i][j] = random.nextInt(100);
					
					System.out.print(matriz1[i][j] + " | ");
				}
				System.out.println();
			}// fim for	
			
			System.out.println("\nMATRIZ 2 ALEATORIA");
			for (int i = 0; i < matriz2[0].length; i++) {
				for (int j = 0; j < matriz2[1].length; j++) {
					matriz2[i][j] = random.nextInt(100);
					
					System.out.print(matriz2[i][j] + " | ");
				}
				System.out.println();
			}// fim for		
		}// fim else	
	}// fim metodo
	
	public void matrizValoresMaiores() {
		System.out.println("\nMATRIZ COM VALORES MAIORES DE CADA MATRIZ");
		
		boolean b = Arrays.equals ( matriz1 , matriz2 ) ;
		 
		if(b == false) {
			System.out.println("\nMatriz diferentes.");
			for (int i = 0; i < matriz1[0].length; i++) {
				for (int j = 0; j < matriz2[1].length; j++) {
					// A função Math. max() retorna o maior de um ou mais números.
					matriz3[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
					
				}
			}// fim for
		}// fim if
		else {
			System.out.println("Matrizes iguais! ");
		}// fim else
		
		System.out.println("\nMatriz com os valores maiores da matriz 1 e 2.\n");
		
		for (int i = 0; i < matriz3[0].length; i++) {
			for (int j = 0; j < matriz3[1].length; j++) {
				System.out.print(matriz3[i][j] + " | ");
			}
			System.out.println();
		}// fim for
		
	}// fim metodo
	
}
