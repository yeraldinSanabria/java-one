package proyectoBancario;

public class CrearCuenta {

	public static void main(String[] args) {
	Cuenta primeraCuenta = new Cuenta();
	primeraCuenta.depositar(300);
	primeraCuenta.getSaldo();
	System.out.println(primeraCuenta.getSaldo());

	}
}