package com.tessproyectoBancario;

import com.proyectoBancario.*;

public class TestSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente ();
		Administrador admin = new Administrador();
		
		sistema.autentica(admin);
		sistema.autentica(gerente1);
	}
}
