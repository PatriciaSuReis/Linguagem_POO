package lista_2;

import java.util.Scanner;

public class ManipulaArray {

	protected int idade[];
	protected String nome[];
	
	public ManipulaArray(int tamanho) {
		idade = new int[tamanho];
		nome = new String[tamanho];
	}
	
	public void core() {
		Scanner leia = new Scanner(System.in);
		String n;
		int i;
		
		for (int contador = 0; contador < idade.length; contador++) 
		{
			System.out.print("\nInsira o nome: ");
			n = leia.next();
			
			nome[contador] = n;
			
			System.out.print("Insira a idade: ");
			i = leia.nextInt();
			
			idade[contador] = i;
		}// fim for
		
		System.out.println();
		
		for (int contador = 0; contador < idade.length; contador++) 
		{
			System.out.println("Nome: " + nome[contador] 
							+ " possui: " + idade[contador]);		
		}// fim for
		
		System.out.println("--------------FIM-------------");
		
	}// fim core
	
	public int maiorIdade(int idadeBase) {
		
		int maisVivido = -1;
		String nomeVivido = "";
		
		for (int contador = 0; contador < idade.length; contador++)
		{
			if (idade[contador] >= idadeBase) {
				System.out.println(nome[contador] + " é de maior e possui: " + idade[contador]);	
				
				if(idade[contador] > maisVivido) 
				{
					maisVivido = idade[contador];
					nomeVivido = nome[contador];
				}
			}
		}// fim for
		
		System.out.println("O mais vivido é: " + nomeVivido 
						+ " e possui " + maisVivido);
	
		return idadebase;
		
	}// fim maiorIdade
	
}
