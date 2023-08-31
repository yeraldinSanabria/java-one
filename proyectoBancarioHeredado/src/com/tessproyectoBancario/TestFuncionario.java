package com.tessproyectoBancario;

import com.proyectoBancario.Funcionario;
import com.proyectoBancario.Gerente;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario juliana = new Gerente();
		juliana.setNombre("Juli");
		juliana.setDocumento("34567");
		juliana.setSalario(400);
		juliana.setTipo(0);
		
		System.out.println(juliana.getSalario());
	}

}
