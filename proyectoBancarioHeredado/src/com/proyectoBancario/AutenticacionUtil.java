package com.proyectoBancario;

public class AutenticacionUtil {

	private String clave;

	public boolean iniciarSeccion(String clave) {
		return this.clave == clave;
	}

	public void setClave(String clave) {
		this.clave = clave;

	}


}
