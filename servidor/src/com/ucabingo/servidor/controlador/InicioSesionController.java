package com.ucabingo.servidor.controlador;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.ucabingo.servidor.modelo.UsuarioModel;
import com.ucabingo.servidor.vista.InicioSesion;
import com.ucabingo.servidor.vista.Menu;

public class InicioSesionController implements ActionListener {

		private InicioSesion ventana;
		private UsuarioModel usuarioModel;
		
		public InicioSesionController(InicioSesion ventana) {
			this.ventana = ventana;
			this.ventana.frame.setVisible(true);
			
			this.ventana.ingresarBoton.addActionListener(this);
			this.ventana.salirBoton.addActionListener(this);
			
			usuarioModel = new UsuarioModel();
		}
		
		public void actionPerformed(ActionEvent accion) {
			if(this.ventana.ingresarBoton == accion.getSource()) {
				String password = new String(this.ventana.passTxt.getPassword());
				String usuario = this.ventana.usuarioTxt.getText();
				
				if (password.equals("") || usuario.equals("")) {
					JOptionPane.showMessageDialog(null, "Campos invalidos o vacios");
				} else {
					if (usuarioModel.logInUser(usuario, password)) {
						Menu ventanaMenu = new Menu();
						new MenuController(ventanaMenu);
						this.ventana.frame.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Los datos son incorrectos o el usuario no existe");
					}
				}
				
				if(this.ventana.salirBoton == accion.getSource()) {
					this.ventana.frame.dispose();
				}
			}
		}
}
