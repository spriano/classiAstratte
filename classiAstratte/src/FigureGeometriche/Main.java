package FigureGeometriche;

public class Main {

	public static void main(String[] args) {
		Figura f1=new Rettangolo(3,5);
		Figura f2=new Cerchio(5);
		System.out.println(f1.perimetro());
		System.out.println(f1.area());
		System.out.println(f2.perimetro());
		System.out.println(f2.area());
	}
}
