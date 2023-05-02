package aula_02_05_2023;

import java.util.Scanner;

public class Matriz {
	
	public double [][] atualizar(double[][] mat, int linha, int coluna) {
		mat[linha][coluna] = 0.0;
		return mat;
	}// fim metodo
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		Matriz teste = new Matriz();
		
		double matriz[][] = new double[2][2];
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				System.out.printf("Digite o valor da linha %d coluna %d:", i, j);
				matriz[i][j] = input.nextDouble();
			}
		}// fim for
		
		System.out.println("\n************** IMPRIMINDO MATRIZ *************");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				System.out.printf("%.0f ", matriz[i][j]);
			}// fim for
			
			System.out.println();// começar uma nova linha na matriz
			
		}// fim for
 		
		matriz = teste.atualizar(matriz, 0, 1);		
		
		System.out.println("\n************** IMPRIMINDO MATRIZ ATUALIZADA *************");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				System.out.printf("%.0f ", matriz[i][j]);
			}// fim for
			
			System.out.println();// começar uma nova linha na matriz
			
		}// fim for
 		
		
	}// fim main

}
