package com.ucabingoCliente.vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Menu {
	public JFrame frame;
	public JButton registrarUsuario;
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
		
		JLabel bienvenida = new JLabel("Bienvenid@ a UCABiNGO");
		bienvenida.setBounds(60, 20, 250, 50);
		frame.getContentPane().add(bienvenida);
		
		registrarUsuario = new JButton("Registrar Usuario");
		registrarUsuario.setBounds(40, 80, 220, 25);
		frame.getContentPane().add(registrarUsuario);
		
		comprarCarton = new JButton("Comprar Cartón y Jugar");
		comprarCarton.setBounds(40, 120, 220, 25);
		frame.getContentPane().add(comprarCarton);
		
		cerrar = new JButton("Cerrar");
		cerrar.setBounds(40,160,220,25);
		frame.getContentPane().add(cerrar);
	}

}
