package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.RegistrarUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JFrame;

import java.io.IOException;

/*Recordatorio; se debe agregar ActionListener para que los botones se entiendan
como escuchadores.*/
public class RegistrarUsuarioController implements ActionListener {
	
	private RegistrarUsuario ventana;

	public RegistrarUsuarioController(RegistrarUsuario ventana) {
		// TODO Auto-generated constructor stub
		this.ventana = ventana;
		this.ventana.frame.setVisible(true); 
		this.ventana.botonGuardar.addActionListener(this);
		this.ventana.botonCancelar.addActionListener(this);
	}
	
	//Esta funcion lo que hace es comparar si los campos de la contraseña son iguales.
	public boolean verificarPassword(char[] validacion, char[] validacion2) {
		try {
		if (validacion.length == validacion2.length) {
			for(int i = 0; i <= validacion.length; i++) {
				char control = validacion[i];
				char control2 = validacion2[i];
					if (control != control2) {
						return false;
					}
			}
			return true;
		}
		else{
			return false;
		}
		}
		catch (ArrayIndexOutOfBoundsException evento) {
			return true;
		}
	}
	
	public void actionPerformed(ActionEvent accion) {
		if (this.ventana.botonGuardar == accion.getSource()) {
			if (!(this.ventana.nombreUsuario.getText().equals(""))&&(verificarPassword(this.ventana.passUsuario.getPassword(),this.ventana.passUsuario2.getPassword()))) {
				System.out.printf(" Se guardó de manera correcta");
			}
		}
		if (this.ventana.botonCancelar == accion.getSource()) {
			System.out.printf("Voy por aqui!\n");
			this.ventana.frame.setVisible(false);
			this.ventana.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

}
