package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.Menu;
import com.ucabingoCliente.vista.RegistrarUsuario;
import com.ucabingoCliente.controlador.MenuController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
	
	public boolean revision(String nombreR, String telfR, String saldoR) {
		if((nombreR.equals(""))||(telfR.equals(""))||(saldoR.equals(""))) {
			return false;
		}
		return true;
	}
	
	public void actionPerformed(ActionEvent accion) {
		if (this.ventana.botonGuardar == accion.getSource()) {
			boolean datosR = revision(this.ventana.nombreUsuario.getText(),this.ventana.telefonoUsuario.getText(),this.ventana.saldoUsuario.getText());
			boolean passR = verificarPassword(this.ventana.passUsuario.getPassword(),this.ventana.passUsuario2.getPassword());
			if ((datosR)&&(passR)) {
				System.out.print("Campos completos\n");
			}
			if (!(datosR)){
				JOptionPane.showMessageDialog(null, "Campo(s) vacio(s)");
			}
			if (!(passR)) {
				JOptionPane.showMessageDialog(null, "Contraseñas no son iguales");
			}
		}
		if (this.ventana.botonCancelar == accion.getSource()) {
			Menu ventanaMenu = new Menu();
			MenuController controladorMenu = new MenuController(ventanaMenu);
			this.ventana.frame.dispose();
		}
	}

}
