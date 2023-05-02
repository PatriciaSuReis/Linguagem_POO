package PROVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Gabriel_Patricia {

	protected ArrayList<Double> altura;
	protected ArrayList<Integer> sexo;
	protected double maiorAltura = Double.MIN_NORMAL;
	protected double menorAltura = Double.MAX_VALUE;
	protected double mediaHomens;
	protected int qtdM = 0;
	protected int qtdH = 0;
	
	public Gabriel_Patricia() {
		this.altura = new ArrayList<Double>();
		this.sexo = new ArrayList<Integer>();
	}
	
	public void valorRecebido() {
		Scanner input = new Scanner(System.in);

		double alt;
		int sex;

		for (int i = 0; i < 10; i++) {
			
            System.out.print("Digite altura: ");
            alt = input.nextDouble();
            
            System.out.println("Digite sexo: 1(masculino) ou 2(feminino)");
            sex = input.nextInt();

            if (alt != 0) {
                altura.add(alt);           
            }
            
            if (sex == 1 || sex == 2) {
                sexo.add(sex);           
            } else {
            	System.out.println("\nSexo tem que ser 1 ou 2.");
            }
		}// fim for
		
	}// FIM METODO 
		
	
	//Implemente um método que retorna a maior e menor altura do grupo.
	public void menorMaiorAltura(ArrayList<Double> altura) {
		
		for(double i : altura) {
			
			if (i > maiorAltura) {
				maiorAltura = i;
			} 
			if (i < menorAltura) {
				menorAltura = i;
			}
			
		}// fim for
		
	}// fim questao1_2
	
	// media nao esta fun
	/*public void mediaH (ArrayList<Double> altura, ArrayList<Integer> sexo) {
		
		double mediaH = 0.0;
		int contaH = 0;
		
		// popular sexo altura
		for (int sex : sexo ) {
			if (sex == 1) {
				qtdH++;	
				alturah += alt;
			}
			
		}// fim for
		
		mediaHomens = alturah / qtdH; 
		
	}// fim questao3
	*/
	
	public void quantadadeM ( ArrayList<Integer> sexo) {
		for (int sex : sexo) {
			
			if (sex == 2) {
				qtdM++;	
			}
		}// fim
		
	}// fim questao4
	
	public void exibir() {
		System.out.println("\nAltura:" + altura);
		System.out.println("Sexo:" + sexo);
		System.out.println("\nMaior altura: " + maiorAltura);
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("\nQuantidade mulheres: " + qtdM);
		System.out.println("\nMedia Homens: " + mediaHomens);
	}// fim
	
}
