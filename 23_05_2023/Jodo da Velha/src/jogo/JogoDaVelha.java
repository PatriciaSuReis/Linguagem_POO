package jogo;

import java.util.Scanner;

public class JogoDaVelha {

	public void core() {
		int linha, coluna, i = 0;
		Scanner input = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		Inicializa(matriz);
		
		while (true) {
			System.out.println("\nJogador 1 na rodada " + (i+1));
			imprimMatriz(matriz);
			
			System.out.print("\nDigite a linha:");
			linha = input.nextInt();
			System.out.print("Digite a coluna:");
			coluna = input.nextInt();
			
			matriz[linha][coluna] = 0;
			i++;
			
			if(i==9) {
				break;
			}
		
			// Começar a pegar jogador 2
			System.out.println("\nJogador 2 na rodada " + (i+1));
			imprimMatriz(matriz);
			
			System.out.print("\nDigite a linha: ");
			linha = input.nextInt();
			System.out.print("Digite a coluna: ");
			coluna = input.nextInt();
			
			matriz[linha][coluna] = 1;
			i++;
			
			if(i==9) {
				break;
			}
		}// fim while
			
		System.out.println("\n\nTabuleiro Finalizado\n\n");
		imprimMatriz(matriz);
		
		int colunaLEsquerdo = this.colunaLateralLeft(matriz);
		int colunaLadoMeio = this.colunaLadoMeio(matriz);
		int colunaLDireito = this.colunaLadoRight(matriz);
		
		if(colunaLEsquerdo != -1) {
			System.out.println("Jogador com "+ colunaLEsquerdo + " é o vencedor");
		}

		else if(colunaLadoMeio != -1) {
			System.out.println("Jogador com "+ colunaLadoMeio + " é o vencedor");
		}
		
		else if(colunaLDireito != -1) {
			System.out.println("Jogador com "+ colunaLDireito + " é o vencedor");
		}
			
			
	}// fim core
	
	public void Inicializa(int mat[][]) {
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat[1].length; j++) {
				mat[i][j] = -1;
			}
		}// fim for
	}//fim Inicializa
	
	public void imprimMatriz(int mat[][]) {
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat[1].length; j++) {
				System.out.printf(" %d ", mat[i][j]);
			}
			System.out.println();
		}// fim for
	}// fim imprimMatriz

	public int colunaLateralLeft(int mat[][]) {
		
		if (mat[0][0] == 0 && mat[1][0] == 0 && mat[2][0] == 0) {
			return 0;
		}
		else if (mat[0][0] == 1 && mat[1][0] == 1 && mat[2][0] == 0) {
			return 1;
		}
		
		return -1;
	}// fimr metodo colunaLateralLeft

	public int colunaLadoMeio(int mat[][]) {
		
		if (mat[0][1] == 0 && mat[1][1] == 0 && mat[2][1] == 0) {
			return 0;
		}
		else if (mat[0][1] == 1 && mat[1][1] == 1 && mat[2][1] == 1) {
			return 1;
		}
		
		return -1;
	}// fimr metodo colunaLadoMeio
	
	
	public int colunaLadoRight(int mat[][]) {
		
		if (mat[0][2] == 0 && mat[1][2] == 0 && mat[2][2] == 0) {
			return 0;
		}
		else if (mat[0][2] == 1 && mat[1][2] == 1 && mat[2][2] == 1) {
			return 1;
		}
		
		return -1;
	}// fimr metodo colunaLadoMeio
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
