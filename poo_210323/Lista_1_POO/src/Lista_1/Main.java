package Lista_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int op;
		
		do {
			System.out.println("---------------------------------");
			System.out.println("Lista 1 - POO");
			System.out.println("Escolher o exercicio de 1 a 11 ou 0 para sair: ");
			op = leia.nextInt();
			
			if (op == 0) {
				break;
			}
			
			switch (op) {
				case 1:
					System.out.println("---------------------------------");
					System.out.println("Digite tres valores interios:");
						int numA = leia.nextInt();
						int numB = leia.nextInt();
						int numC = leia.nextInt();
						
					Exercicio1 exer1 = new Exercicio1();
					System.out.println("---------------------------------");
					exer1.somaEMenor(numA, numB, numC);
					
					break;
					
				case 2:
					System.out.println("---------------------------------");
					System.out.println("Informe seu nome: ");
						String nome = leia.nextLine();
					System.out.println("Informe seu sexo F(feminino) ou M(masculino)");
						String sexo = leia.nextLine();
					System.out.println("Informe seu estado civil: \n0-Solteira \n1-Casada");
						String estC = leia.nextLine();
					
					Exercicio2 exer2 = new Exercicio2(nome, sexo, estC);
					//setar valores
					exer2.setNome(nome);
					exer2.setSexo(sexo);
					exer2.setEstadoCivil(estC);
					////terminarr
					exer2.casadaInfo();
					
					
						
					break;
					
				case 3:
					System.out.println("---------------------------------");
					break;
					
				case 4:
					System.out.println("---------------------------------");
					break;
				
				case 5:
					System.out.println("---------------------------------");
					break;
				
				case 6:
					System.out.println("---------------------------------");
					break;
					
				case 7:
					System.out.println("---------------------------------");
					break;
				
				case 8:
					System.out.println("---------------------------------");
					break;
				
				case 9:
					System.out.println("---------------------------------");
					break;
				
				case 10:
					System.out.println("---------------------------------");
					break;
				
				case 11:
					System.out.println("---------------------------------");
					break;
					
				default:
					System.out.println("---------------------------------");
					System.out.println("Opcao invalida!");
					break;
			}
		/*dentro do DO*/	
		  System.out.println("---------------------------------");
		  System.out.println("Continuar S(Sim) ou N(Não): ");
		  leia.nextLine();
		} 
		while (leia.nextLine().equalsIgnoreCase("s"));	
		System.out.println("Bye!");
		
		leia.close();
	}

}
