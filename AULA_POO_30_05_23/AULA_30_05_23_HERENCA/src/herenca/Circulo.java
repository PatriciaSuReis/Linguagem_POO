package herenca;

public class Circulo extends Ponto {
	
	protected float raio;
	
	public Circulo(float raio, float x, float y) {
		super(x, y);
		setRaio(raio);
	}
	
	public void setRaio(float raio) {
		if (raio <= 0.0) {
			this.raio = (float) 0.0;
		} else {
			this.raio = raio;
		}
	}
	
	public float getRaio() {
		return raio;
	}
	
	public float area() {
		return (float) (Math.PI * raio * raio);
	}

	public void Status() {
		System.out.println("Centro: " + x + " , " + y + " Raio: " + raio);
	}
	
	
	
}
