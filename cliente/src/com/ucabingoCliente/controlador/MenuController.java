package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.Menu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MenuController implements ActionListener{
	private Menu ventana;
	
	public MenuController(Menu ventana) {
		this.ventana = ventana;
		this.ventana.frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent accion) {
		// TODO Auto-generated method stub
		if (this.ventana.cerrar == accion.getSource()) {
			this.ventana.frame.setVisible(false);
			this.ventana.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}
