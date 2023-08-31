package com.proyectoBancario;

public class GuardarCuentas {
// crea un objeto para guardas muchas cuentas 
// permitirnos agregar cuentas con un metodo
//  guardarCuentas.adiciona(cuentas)
// obtemer, remover, etc

	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;

	public void adicionar(Cuenta cc) {
		cuenta[indice] = cc;

	}

	public Cuenta obtener(int indice) {
		return cuenta[indice];
		
	}

	
}
