package aulas;

import java.util.Random;

public class Ocorrencia {
	
	public void contaFace() {
		
		Random objeto = new Random(); //objeto do tipo Random
		
		int []frequencia = new int[7];//array contadores da frequencia
		
		for (int  i = 0; i <= 6000; i++)
			++frequencia[1 + objeto.nextInt(6)];
		
		System . out . printf ("%s %14s\n"," Face ", " Frequencia ") ;

		
		//gerar saida do valor de cada elemento do array
		for (int face = 1; face < frequencia.length; face++) 
			System.out.printf("%4d%10d\n", face, frequencia[face]);
		
	}

}
