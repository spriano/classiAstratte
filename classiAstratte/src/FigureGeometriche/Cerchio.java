package FigureGeometriche;

public class Cerchio extends Figura{
	private double raggio;
		
	public Cerchio(double raggio) {
        
		this.raggio = raggio;
	}

	@Override
	public double area() {
		return raggio*raggio*Math.PI;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*raggio*Math.PI;
	}
	
}
