package com.proyectoBancario;

public class SistemaInterno {

	private String clave = "yeraldin";

	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("login exitos");
			return true;

		}
		System.out.println("error en login");
		return false;
	}
}
