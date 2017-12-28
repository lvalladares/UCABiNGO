package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.InicioSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*Recordatorio; se debe agregar ActionListener para que los botones se entiendan
como escuchadores.*/
public class InicioSesionController implements ActionListener {
	
	private InicioSesion ventana;

	public InicioSesionController(InicioSesion ventana) {
		// TODO Auto-generated constructor stub
		this.ventana = ventana;
		this.ventana.frame.setVisible(true); 
		this.ventana.botonGuardar.addActionListener(this);
		this.ventana.botonCancelar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent accion) {
		if (this.ventana.botonGuardar == accion.getSource()) {
			if ((this.ventana.nombreUsuario.getText().equals(""))) {
				System.out.printf(" Se guardó de manera correcta");
			}
		}
		if (this.ventana.botonCancelar == accion.getSource()) {
			System.out.printf(" Ocurrio un error, revisar y volver a intentar");
		}
	}

}
