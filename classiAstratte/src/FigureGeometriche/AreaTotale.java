package FigureGeometriche;

public class AreaTotale {

	public static void main(String[] args) {
		double area=0;
		Figura[] figure= { new Rettangolo(3,5),new Rettangolo(4,7),new Cerchio(5)};
		for(Figura figura : figure) {
			System.out.println(figura.area());
			area+=figura.area();
		}
		System.out.println("area totale: "+area);
	}

}
