
public class EjemploCondicionalesDos {

	public static void main(String[] args) {
		System.out.println("hello work");

		int edad = 18;
		int cantidadPersonas = 2;
		boolean puedeEnrar = (edad >= 18 && cantidadPersonas >= 2);

		if (puedeEnrar) {
			System.out.println("usted puede entrar");
		} else {
			System.out.println("usted no  puede entrar");
		}
	}
}
