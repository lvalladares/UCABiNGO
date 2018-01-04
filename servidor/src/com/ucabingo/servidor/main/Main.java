package com.ucabingo.servidor.main;

import com.ucabingo.servidor.controlador.InicioSesionController;
import com.ucabingo.servidor.vista.InicioSesion;

public class Main {

	public static void main(String[] args) {
		
		InicioSesion window = new InicioSesion();
		new InicioSesionController(window);
	}

}
