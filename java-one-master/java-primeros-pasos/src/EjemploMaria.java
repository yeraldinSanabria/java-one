
public class EjemploMaria {

	public static void main(String[] args) {

		double valorCompra = 500.0;
		double diezPorciento = (((valorCompra * 10) / 100));
		double quincePorciento = ((valorCompra * 15) / 100);
		double veintePorciento = ((valorCompra * 20) / 100);
		double descuentoVeinte = (valorCompra - veintePorciento);

		boolean descuentoDiezPorciento = (valorCompra >= 100.0 && valorCompra <= 199.99);
		boolean descuentoQuincePorciento = (valorCompra >= 200.0 && valorCompra <= 299.99);

		System.out.println();

		if (descuentoDiezPorciento) {
			double descuentoFinal = valorCompra - diezPorciento;
			System.out.println(descuentoFinal + "  " + "su descuento fue del 10 porciento");
		} else if (descuentoQuincePorciento) {
			double descuento = valorCompra - quincePorciento;
			System.out.println(descuento + "  " + "su descuento fue del 15 porciento");
		} else {
			System.out.println(descuentoVeinte + "  " + "su descuento fue del 20 porciento");
		}
	}

}
