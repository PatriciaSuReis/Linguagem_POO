package array;

public class IntArray {

	public static void main(String[] args) {
	//ARRAY INT 1		
		int array[];//declara array
		array = new int [10];//criar objeto do array
		
		System.out.printf("%s%7s\n", "Indice", "Valor");
		
		array[3]= 10;
		array[9]= 5;
		array[3]= 13;
		
		for (int contador = 0; contador < array.length; contador++) {
			System.out.printf("%d%10d\n", contador, array[contador]);	
		
		}//fim for
		
		
	}

}
