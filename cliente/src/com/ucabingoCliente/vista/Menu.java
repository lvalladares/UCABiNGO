package com.ucabingoCliente.vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Menu {
	public JFrame frame;
	public JButton inicioSesion;
	public JButton comprarCarton;
	public JButton cerrar;

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
	
	public Menu() {
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("Menu");
		frame.setBounds(250, 250, 300, 300);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel bienvenida = new JLabel("Bienvenido a UCABiNGO");
		bienvenida.setBounds(60, 20, 250, 50);
		frame.getContentPane().add(bienvenida);
		
		inicioSesion = new JButton("Iniciar Sesión");
		inicioSesion.setBounds(80, 80, 150, 25);
		frame.getContentPane().add(inicioSesion);
		
		comprarCarton = new JButton("Comprar Cartón");
		comprarCarton.setBounds(80, 120, 150, 25);
		frame.getContentPane().add(comprarCarton);
		
		cerrar = new JButton("Cerrar");
		cerrar.setBounds(80,160,150,25);
		frame.getContentPane().add(cerrar);
	}

}
