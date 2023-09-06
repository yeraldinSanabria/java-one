 package com.tessproyectoBancario;

import com.proyectoBancario.CuentaCorriente;
import com.proyectoBancario.*;

public class TessCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = null;
		CuentaAhorros ca = new CuentaAhorros (2, 3);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
