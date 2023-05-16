package atividades;

import java.util.Random;
import java.util.Scanner;

public class Ex6 {

	/*6- Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva:
	● a soma dos números ímpares fornecidos;
	● a soma de cada uma das 5 colunas;
	● a soma de cada uma das 5 linhas*/

	private int[][] matriz = new int[5][5];
	
	public void lerMatriz() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------------------- LER MATRIZ 5 x 5 --------------------------");
		System.out.println("Escolher digitar os numeros(0) ou gerar aleatoriamente de 0 a 100(1):");
		int op =  leia .nextInt();
		
		if(op == 0) {
			System.out.println();
			System.out.println("Preenchar a MATRIZ com valores inteiros");
			for(int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[1].length; j++) {
					System.out.printf("Digite um para a linha %d e coluna %d: ", i , j);
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
					
					System.out.print(matriz[i][j] + " | ");
				}
				System.out.println();
			}// fim for	
		}// fim else
		
	}// fim metodo
	
	public void somaDosImpares() {
		int somaImpar = 0;
		
		System.out.println("\n------------------------------");
		System.out.println("Soma dos impares a matriz\n");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				if (matriz[i][j] % 2 == 1) {
					somaImpar += matriz[i][j];
				}
			}
		}// fim for
		
		System.out.println("Resulado: " + somaImpar);
		
	}// fim metodo
	
	public void somaColuna() {
		int[] somaColuna = new int[matriz[0].length];
		
		System.out.println("\n------------------------------");
		System.out.println("Soma das colunas");
		
		for (int j = 0; j < matriz[1].length; j++) {
			for (int i = 0; i < matriz[0].length; i++) {
				somaColuna[j] += matriz[i][j]; 
			}
		}// fim for
		
		for (int j = 0; j < somaColuna.length; j++) {
			System.out.printf("Coluna %d: %d\n", j, somaColuna[j]);
		}
		
	}// fim metodo
	
	public void somaLinha() {
		int[] somaLinha = new int[matriz[0].length];
		
		System.out.println("\n------------------------------");
		System.out.println("Soma das linhas");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				somaLinha[i] += matriz[i][j];
			}
		}// fim for
		
		for (int i = 0; i < somaLinha.length; i++) {
			System.out.printf("Coluna %d: %d\n", i, somaLinha[i]); 
		}
		
	}// fim metodo
	
}// fim class
