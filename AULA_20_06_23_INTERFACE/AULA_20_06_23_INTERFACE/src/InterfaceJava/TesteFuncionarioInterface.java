package InterfaceJava;

public class TesteFuncionarioInterface {

	public static void main(String args[]) {
		
		Diretor diretor = new Diretor("12Bmudar", "Bruno", "Bermudez", "030123-4345");
		var gerente = new Gerente("431457", "Maria", "Fernanda", "15556743-55");
		
		System.out.println("Gerente logou? " + gerente.autentica("4567j85"));
		
		System.out.println(gerente + "\n");
		System.out.println(diretor + "\n");
		
		System.out.println("Diretor logou? " + diretor.autentica("12Bmudar"));
	}
	
}
