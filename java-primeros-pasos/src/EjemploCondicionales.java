
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("hello work");

		int edad = 10;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("usted puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("usted es menor de edad pero esta permitido su ingreso");
			} else {
				System.out.println("usted no esta permitido entrar");
			}
		}
	}
}
