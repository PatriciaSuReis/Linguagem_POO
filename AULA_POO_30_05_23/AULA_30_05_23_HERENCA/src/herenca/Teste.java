package herenca;

public class Teste {
	
	public static void main(String[] arg) {
		
		Circulo objeto1 = new Circulo((float)3.2, 2, 1);
		
		Cilindro objeto2 = new Cilindro(4,(float)1.3, 1, 2);
				
				
		System.out.println("Area do Circulo = " + objeto1.area());
		objeto1.Status();
		
		System.out.println("Area do Cilindro = " + objeto2.area());
		objeto2.Status();
		
		
	}

}
