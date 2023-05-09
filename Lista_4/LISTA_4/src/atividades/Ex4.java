package atividades;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex4 {

	/*4- Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer
	 * uma busca desse valor na matriz e, ao final, escrever a localização (linha e 
	 * coluna) ou uma mensagem de “não encontrado”.*/
	
	private int[][] matriz = new int[5][5];
	private Integer valorX = null;
	
	public void lerMatriz() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("LER MATRIZ 5 x 5");
		System.out.println("Escolher digitar os numeros(0) ou gerar aleatoriamente de -100 a 100(1): ");
		int op =  leia .nextInt();
		
		if(op == 0) {
			System.out.println();
			for(int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[1].length; j++) {
					System.out.printf("Digite um para a linha %d e coluna %d:\n", i , j);
					matriz[i][j] = leia.nextInt();
				}
			}// fim for
			
			System.out.print("Digite tambem um outro valor inteiro: ");
			valorX = leia.nextInt();
			
		}
		else if (op == 1) {
			Random random = new Random();
			
			System.out.println("\n\nMATRIZ ALEATORIA");
			
			for (int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[1].length; j++) {
					matriz[i][j] = random.nextInt(-100,100);
					
					System.out.print(matriz[i][j] + "   ");
				}
				System.out.println();
			}// fim for	
			
			System.out.print("\nDigite tambem um valor x inteiro para pesquisar na matriz: ");
			valorX = leia.nextInt();
			
		}// fim else
	}// fim metodo
	
	public void pesquisarValorX() {
		Scanner leia = new Scanner(System.in);
		Integer linha = null;
		Integer coluna = null;
		
		if(valorX == null) {
			System.out.println("Valor X nao informando.");
			System.out.print("\nDigite um valor x inteiro para pesquisar na matriz: ");
			valorX = leia.nextInt();
		}
		else {
			for (int i = 0; i < matriz[0].length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					if(matriz[i][j] == valorX) {
						linha = i;
						coluna = j;
					}
				}
			}// fim for
			
			if(linha != null || coluna != null) {
				System.out.printf("\nValor %d encontrado.\n", valorX);
				System.out.println("Linha:  " + linha);
				System.out.println("Coluna: " + coluna);
			}
			else {
				System.out.println("Valor X nao encontrado.");
			}
				
		}// fim if else
		
		
		
	}// fim metodo
	
}
