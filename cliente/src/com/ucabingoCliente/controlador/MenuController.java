package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.Menu;
import com.ucabingoCliente.vista.CompraCarton;
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
		this.ventana.inicioSesion.addActionListener(this);
		this.ventana.comprarCarton.addActionListener(this);
		this.ventana.cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent accion) {
		// TODO Auto-generated method stub
		if(this.ventana.inicioSesion == accion.getSource()) {
			System.out.print("Voy a ingresar al sistema\n");
		}
		if (this.ventana.comprarCarton == accion.getSource()) {
			CompraCarton ventanaNueva = new CompraCarton();
			CompraCartonController controladorNuevo = new CompraCartonController(ventanaNueva);
			this.ventana.frame.dispose();
			
		}
		if (this.ventana.cerrar == accion.getSource()) {
			this.ventana.frame.setVisible(false);
			this.ventana.frame.dispose();
		}
	}
}
