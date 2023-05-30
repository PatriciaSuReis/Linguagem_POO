package herenca;

public class Ponto {

	protected float x, y;
	
	public Ponto(float x, float y) {
		this.setPonto(x, y);
	}
	
	public void setPonto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void Status() {
		System.out.println(x + " , " + y);
	}
}
