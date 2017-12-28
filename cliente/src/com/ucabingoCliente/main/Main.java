package com.ucabingoCliente.main;

import com.ucabingoCliente.controlador.CompraCartonController;
import com.ucabingoCliente.controlador.InicioSesionController;
import com.ucabingoCliente.vista.CompraCarton;
import com.ucabingoCliente.vista.InicioSesion;

public class Main {

	public static void main(String[] args) {
		// pruebas
		//CompraCarton vista = new CompraCarton();
		//CompraCartonController controlador = new CompraCartonController(vista);
		InicioSesion inicio = new InicioSesion();
		InicioSesionController controladorInicioSesion = new InicioSesionController(inicio);
	}

}
