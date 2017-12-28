package com.ucabingoCliente.main;

import com.ucabingoCliente.controlador.CompraCartonController;
import com.ucabingoCliente.controlador.MenuController;
import com.ucabingoCliente.controlador.RegistrarUsuarioController;
import com.ucabingoCliente.vista.CompraCarton;
import com.ucabingoCliente.vista.Menu;
import com.ucabingoCliente.vista.RegistrarUsuario;

public class Main {

	public static void main(String[] args) {
		// pruebas
		//CompraCarton vista = new CompraCarton();
		//CompraCartonController controlador = new CompraCartonController(vista);
		//RegistrarUsuario registrar = new RegistrarUsuario();
		//RegistrarUsuarioController controladorRegistrarUsuario = new RegistrarUsuarioController(registrar);
		Menu window = new Menu();
		MenuController controladorWindow = new MenuController(window);
	}

}
