package array;

public class IntArray4 {

	double total = 0.0;
	
	public double principal(double array[]) {
		
		for (int contador = 0; contador < array.length; contador++) {
			total += array[contador];
		}
		
		System.out.println("Total: " + total);	
		
		return total;
	}
	
	public double Impar(double vetor[]) {
		
		for (int contador = 0; contador < vetor.length; contador++) {
			
			//conversao pra inteiro
			if ((int)vetor[contador] %2 == 1) {
				System.out.println("Sou um impar: " + vetor[contador]);
			}
			
			total = total + vetor[contador];
		}
		
		return total;
	}

	
	
		
		
}
