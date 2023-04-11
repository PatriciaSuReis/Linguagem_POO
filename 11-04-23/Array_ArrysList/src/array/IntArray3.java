package array;

public class IntArray3 {

	public static void main(String[] args) {
		
		final int Array_Tamanho = 10;//declarando constante
		int array[] = new int[Array_Tamanho];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = 2 + 2 * contador;
		}
		
		System.out.printf("%s%7s\n", "Indice", "Valor");
	
		for (int contador = 0; contador < array.length; contador++) {
			System.out.printf("%d%10d\n", contador, array[contador]);	
		
		}//fim for
		
	}

}
