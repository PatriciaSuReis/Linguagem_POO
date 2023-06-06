package conta;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta obj1 = new Conta("311-5", "452111", 2350.34, "Maria", "03099138162", "Antonieta", "12/10/1996");
		
		/*
		obj1.imprimeCliente();
		
		obj1.sacar(476.45);
		obj1.sacar(204);
		obj1.sacar(900);
		obj1.sacar(150);
		
		obj1.depositar(500);
		
		obj1.sacar(700);
		obj1.sacar(234);
		obj1.sacar(350);
		
		obj1.mostraExtrato();
		*/
		
		ContaCorrente obj2 = new ContaCorrente(16, 150, "12/05/2023", "311-5", "452111", 2350.34, "Maria", "03099138162", "Antonieta", "12/10/1996");

		System.out.println(obj2.getLimite());
	}

}
