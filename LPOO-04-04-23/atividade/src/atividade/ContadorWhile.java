package atividade;

public class ContadorWhile {
	
	public int multiplicar() {
		int contador = 0;
		int acumulador = 1;
		
		while (contador <= 5) {
			contador++; // contador = contador + 1
			acumulador = acumulador * contador; //acumulador *= contador
		}
		return acumulador;	
	}

}
