package InterfaceArea;

public class Teste {
	
	public static void main(String args[]) {
		
		Quadrado quadrado = new Quadrado(5);
		
		System.out.println("Area do Quadrado: "+quadrado.calculaArea());
		
		Retangulo retangulo = new Retangulo(4, 6);
		
		System.out.println("Area do Retangulo: "+retangulo.calculaArea());
		
	}

}
