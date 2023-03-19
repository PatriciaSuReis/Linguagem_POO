package programa1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//ler valor digito no console
		Scanner leia = new Scanner(System.in);
		
	do {
		//inicialmente dados ja fixo na conta
		Conta conta1 = new Conta(50.00);
		Conta conta2 = new Conta(7.53);
		
		//exibir saldo incial dos objetos
		System.out.println("------------DADOS------------");
		System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
		System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
		
		//DEPOSITO
		//varialvel para amazenar dados digito pelo usuario
		double deposito; 
		
		//CONTA 1
		System.out.println("---------------------------------------");
		System.out.print("Digite o deposito da conta 1: \nR$");
		//entrada de dados
		deposito = leia.nextDouble();
		
		//passar dados para o metodo deposito da conta
		conta1.deposito(deposito);
		
		//saida de dados
		System.out.println("------------DADOS------------");
		System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
		System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
		
		//CONTA 2	
		System.out.println("---------------------------------------");
		System.out.print("Digite o deposito da conta 2: \nR$");
		deposito = leia.nextDouble();
		
		conta2.deposito(deposito);
		
		//saida de dados
		System.out.println("------------DADOS------------");
		System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
		System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
		
		//SAQUE
		int op;
		double saque;
		
		//CONTA 1
		System.out.println("---------------------------------------");
		System.out.println("Deseja sacar da conta 1?");
		System.out.println("1- Sim \n2- Nao");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
				
			System.out.println("Quanto deseja sacar? \nR$");
			saque = leia.nextDouble();
			
			conta1.saque(saque);
			
			System.out.println("------------DADOS------------");
			System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
			System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
			break;
			
		case 2:
			System.out.println("Até mais!!");
			break;
			
		default:
			System.out.println("------------------------------");
			System.out.println("Opcao invalida!");
			break;
		}
			
		//CONTA 2
		System.out.println("---------------------------------------");
		System.out.println("Deseja sacar da conta 2?");
		System.out.println("1- Sim \n2- Nao");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
				
			System.out.println("Quanto deseja sacar? \nR$");
			saque = leia.nextDouble();
			
			conta2.saque(saque);
			
			System.out.println("------------DADOS------------");
			System.out.println("Saldo da conta 1: R$" + conta1.getSaldo());
			System.out.println("Saldo da conta 2: R$" + conta2.getSaldo());
			break;
			
		case 2:
			System.out.println("Até mais!!");
			break;
			
		default:
			System.out.println("------------------------------");
			System.out.println("Opcao invalida!");
			break;
		}
		
		//////////////////
		System.out.println("------------------------------");
	    System.out.println("Tenta novamente? \nSim(s) ou Nao(n)");
	    leia.nextLine();
	
	} while (leia.nextLine().equalsIgnoreCase("s") );

	System.out.println("------------------------------");
	System.out.println("Ate a proxima! Bye!"); 
		
	leia.close();
	}

}
