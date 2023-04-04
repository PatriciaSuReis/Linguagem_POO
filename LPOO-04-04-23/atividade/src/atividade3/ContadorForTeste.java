package atividade3;

public class ContadorForTeste {
	
	public static void main(String args[]) {
		ContadorFor objeto = new ContadorFor();
		
		System.out.println("Par:");
		objeto.mostrarPar();
		System.out.println("\nImpar:");
		objeto.mostrarImpar();
		System.out.println("\nO resultado da soma dos pares: " + objeto.somarPar());
		System.out.println("O resultado da soma dos impares: " + objeto.somarImpar());
	}

}
