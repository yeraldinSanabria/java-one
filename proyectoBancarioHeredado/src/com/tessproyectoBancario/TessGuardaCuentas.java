package com.tessproyectoBancario;

import com.proyectoBancario.Cuenta;
import com.proyectoBancario.CuentaCorriente;
import com.proyectoBancario.GuardarCuentas;

public class TessGuardaCuentas {

	public static void main(String[] args) {

		GuardarCuentas guardaCunetas = new GuardarCuentas();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaCunetas.adicionar(cc);

		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaCunetas.adicionar(cc2);

		guardaCunetas.obtener(1);

		System.out.println(guardaCunetas.obtener(0));
		System.out.println(guardaCunetas.obtener(2));
	}

}
