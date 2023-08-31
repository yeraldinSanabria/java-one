package proyectoBancario;

public class TessReferenciaCliente {

	public static void main(String[] args) {
		Cliente yeraldin = new Cliente();
		yeraldin.setNombre("maria");
		yeraldin.setDocumento("364849");
		yeraldin.setTelefono(345678);

		Cuenta cuentaYeraldin = new Cuenta();
		cuentaYeraldin.titular = yeraldin;
		System.out.println(cuentaYeraldin.titular.getNombre());

	}

}
