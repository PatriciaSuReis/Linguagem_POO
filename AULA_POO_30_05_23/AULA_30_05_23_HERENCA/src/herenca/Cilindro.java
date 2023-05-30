package herenca;

public class Cilindro extends Circulo {
	
	protected float altura;
	
	public Cilindro(float altura, float raio, float x, float y) {
		super(raio, x, y);
		setAlrura(altura);
	}
	
	public void setAlrura(float altura) {
		if(altura <= 0) {
			this.altura = 0;
		} else {
			this.altura = altura;
		}
	}

	public float getAltura() {
		return altura;
	}
	
	public float area() {
		return (float) (2 * super.area() + Math.PI * raio * altura);
	}
	
	public void Status() {
		System.out.println("Centro: " + x + " , " + y + " Raio: " + raio 
						+ " Altura: " + altura);

	}
	
}
