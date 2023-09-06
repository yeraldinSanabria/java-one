package com.proyectoBancario;
 
public class Gerente extends Funcionario implements Autenticable {


	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBonoficacion() {
		// TODO Auto-generated method stub
		return 0;
	}
}
