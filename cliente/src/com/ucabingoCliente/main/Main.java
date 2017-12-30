package com.ucabingoCliente.main;

import com.ucabingoCliente.controlador.InicioSesionController;
import com.ucabingoCliente.vista.InicioSesion;

public class Main {

	public static void main(String[] args) {
		InicioSesion window = new InicioSesion();
		InicioSesionController controladorWindow = new InicioSesionController(window);
	}

}
