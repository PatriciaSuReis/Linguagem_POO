package atividade3;

public class ContadorFor {

	public void mostrarPar() {
		int contador;
		
		for (contador = 0; contador <= 10; contador++) {
			if(contador % 2 == 0) {
				System.out.println(contador);
			}		
		}//fim for
	}
	
	public int somarPar() {
		int contador;
		int acumulaPar= 0;
				
		for (contador = 0; contador <= 10; contador++) {
			if(contador % 2 == 0) {
				acumulaPar = acumulaPar + contador;
			}		
		}//fim for
		
		return acumulaPar;
	}
	
	public void mostrarImpar() {
		int contador;
		
		for (contador = 0; contador <= 10; contador++) {
			if(contador % 2 == 1) {
				System.out.println(contador);
			}
		}//fim for
	}
	
	public int somarImpar() {
		int contador;
		int acumulaImpar= 0;
				
		for (contador = 0; contador <= 10; contador++) {
			if(contador % 2 == 1) {
				acumulaImpar = acumulaImpar + contador;
			}		
		}//fim for
		
		return acumulaImpar;
	}
	
	
}
