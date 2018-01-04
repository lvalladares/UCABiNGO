package com.ucabingo.cliente.main;

import com.ucabingo.cliente.controlador.InicioSesionController;
import com.ucabingo.cliente.vista.InicioSesion;

public class Main {

	public static void main(String[] args) {
		InicioSesion window = new InicioSesion();
		InicioSesionController controladorWindow = new InicioSesionController(window);
	}

}
