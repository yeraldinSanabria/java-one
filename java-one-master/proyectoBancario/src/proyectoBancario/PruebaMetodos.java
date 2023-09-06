package proyectoBancario;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta cuentaDeYeral = new Cuenta();
		cuentaDeYeral.getSaldo();
		cuentaDeYeral.depositar(200);
		System.out.println(cuentaDeYeral.getSaldo());

		cuentaDeYeral.retirar(100);
		System.out.println(cuentaDeYeral.getSaldo());

		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, cuentaDeYeral);

		if (puedeTransferir) {
			System.out.println("transferencia exitosa");
		} else {
			System.out.println("transferencia rechazada");
		}
		System.out.println("yeraldin su nuevo saldo es de " + cuentaDeYeral.getSaldo());
	}

}
