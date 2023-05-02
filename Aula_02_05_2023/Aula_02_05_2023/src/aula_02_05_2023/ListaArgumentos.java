package aula_02_05_2023;

public class ListaArgumentos {

	public double media(double... numeros) {
		double total = 0.0;
		
		//calcula o total ultilizando a instrução for aprimorada
		for(double numero : numeros) {
			total += numero;
		}
		return total / numeros.length;
	}// fim metodo
	
	public static void main(String[] args) {
		
		ListaArgumentos obj = new ListaArgumentos();
		
		double d1 = 10.0, d2 = 20.0, d3 = 30.0, d4 = 40.0;
		
		System.out.println("Media de d1 e d2: " + obj.media(d1, d2));
		System.out.println("Media de d1, d2 e d3: " + obj.media(d1, d2, d3));
		System.out.println("Media de d1, d2, d3 e d4: " + obj.media(d1, d2, d3, d4));
	}// fim main
	
}
