package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.Menu;
import com.ucabingoCliente.vista.RegistrarUsuario;
import com.ucabingoCliente.vista.InicioSesion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author antonio
 *
 */
public class MenuController implements ActionListener{
	private Menu ventana;
	
	public MenuController(Menu ventana) {
		this.ventana = ventana;
		this.ventana.frame.setVisible(true);
		//Recordatorio: se debe agregar el actionListener para que funcione los botones.
		this.ventana.registrarUsuario.addActionListener(this);
		this.ventana.comprarCarton.addActionListener(this);
		this.ventana.cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent accion) {
		// TODO Auto-generated method stub
		if(this.ventana.registrarUsuario == accion.getSource()) {
			System.out.print("Voy a ingresar al sistema\n");
			RegistrarUsuario ventanaRegistrar = new RegistrarUsuario();
			RegistrarUsuarioController controladorRegistrar = new RegistrarUsuarioController(ventanaRegistrar);
			this.ventana.frame.dispose();
		}
		if (this.ventana.comprarCarton == accion.getSource()) {
			InicioSesion ventanaNueva = new InicioSesion();
			InicioSesionController controladorNuevo = new InicioSesionController(ventanaNueva);
			this.ventana.frame.dispose();
		}
		if (this.ventana.cerrar == accion.getSource()) {
			this.ventana.frame.dispose();
		}
	}
}
