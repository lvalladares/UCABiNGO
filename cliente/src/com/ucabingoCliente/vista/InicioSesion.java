package com.ucabingoCliente.vista;

import java.awt.EventQueue;
import com.ucabingoCliente.controlador.InicioSesionController;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class InicioSesion {
	public JFrame frame;
	public JButton cancelarBoton;
	public JButton ingresarBoton;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public InicioSesion() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Ingresar Usuario");
		frame.setBounds(200, 200, 300, 300);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel usuario = new JLabel("Indicar el usuario");
		usuario.setBounds(30, 60, 150, 25);
		frame.getContentPane().add(usuario);
		
		ingresarBoton = new JButton("Ingresar");
		ingresarBoton.setBounds(50, 200, 100, 25);
		frame.getContentPane().add(ingresarBoton);
		
		cancelarBoton = new JButton("Cancelar");
		cancelarBoton.setBounds(160, 200, 100, 25);
		frame.getContentPane().add(cancelarBoton);
	}
}
