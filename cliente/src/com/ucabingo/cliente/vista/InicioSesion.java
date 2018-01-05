package com.ucabingo.cliente.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.ucabingo.cliente.controlador.InicioSesionController;

import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class InicioSesion {
	public JFrame frame;
	public JTextField usuarioTxt;
	public JPasswordField passTxt;
	public JButton salirBoton;
	public JButton ingresarBoton;
	
	/*public static void main(String[] args) {
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
	}*/
	
	public InicioSesion() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Ingresar Usuario");
		frame.setBounds(200, 200, 350, 300);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel bienvenida = new JLabel("Ingrese los datos");
		bienvenida.setBounds(100, 20, 200, 25);
		frame.getContentPane().add(bienvenida);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(35, 60, 200, 25);
		frame.getContentPane().add(usuario);
		
		usuarioTxt = new JTextField();
		usuarioTxt.setBounds(125, 60, 200, 25);
		frame.getContentPane().add(usuarioTxt);
		
		JLabel password = new JLabel("Contraseña");
		password.setBounds(15, 125, 140, 25);
		frame.getContentPane().add(password);
		
		passTxt = new JPasswordField();
		passTxt.setBounds(125, 125, 200, 25);
		frame.getContentPane().add(passTxt);
		
		ingresarBoton = new JButton("Ingresar");
		ingresarBoton.setBounds(50, 200, 100, 25);
		frame.getContentPane().add(ingresarBoton);
		
		salirBoton = new JButton("Salir");
		salirBoton.setBounds(200, 200, 100, 25);
		frame.getContentPane().add(salirBoton);
		
		frame.repaint();
	}
}
