package com.ucabingoCliente.controlador;

import com.ucabingoCliente.vista.InicioSesion;
import com.ucabingoCliente.vista.Menu;
import com.ucabingoCliente.vista.CompraCarton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesionController implements ActionListener {

		private InicioSesion ventana;
		
		public InicioSesionController(InicioSesion ventana) {
			this.ventana = ventana;
			this.ventana.frame.setVisible(true);
			this.ventana.ingresarBoton.addActionListener(this);
			this.ventana.cancelarBoton.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent accion) {
			if(this.ventana.ingresarBoton == accion.getSource()) {
				CompraCarton ventanaCompra = new CompraCarton();
				CompraCartonController controladorCompra = new CompraCartonController(ventanaCompra);
				this.ventana.frame.dispose();
			}
			if(this.ventana.cancelarBoton == accion.getSource()) {
				Menu ventanaNueva = new Menu();
				MenuController controladorMenu = new MenuController(ventanaNueva);
				this.ventana.frame.dispose();
			}
		}

}
