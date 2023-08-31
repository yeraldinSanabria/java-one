package com.proyectoBancario;

public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public double getBonoficacion() {
		return this.getSalario();
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSeccion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);

	}

}
