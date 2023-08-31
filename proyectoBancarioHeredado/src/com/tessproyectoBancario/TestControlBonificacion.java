package com.tessproyectoBancario;

import com.proyectoBancario.*;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario yeral = new Contador();
		yeral.setSalario(2000);
		
		
		Contador alexis = new Contador();
		alexis.setSalario(8000);

		ControlBonificacion controlBonifocacion  = new ControlBonificacion();
		controlBonifocacion.resgistrarSalario(yeral);
		controlBonifocacion.resgistrarSalario(alexis);
		
	}

}
