package com.ucabingoCliente.vista;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RegistrarUsuario {

	public JFrame frame;
	public JTextField nombreUsuario;
	public JPasswordField passUsuario;
	public JPasswordField passUsuario2;
	public JButton botonGuardar;
	public JButton botonCancelar;
	private JLabel labelUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarUsuario window = new RegistrarUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistrarUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Inicio de Sesión");
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel labelUsuario = new JLabel("Ingrese nombre de Usuario");
		labelUsuario.setBounds(20, 20, 200, 25);
		frame.getContentPane().add(labelUsuario);
		
		JLabel labelFlag1 = new JLabel("*");
		labelFlag1.setBounds(215, 20, 10, 10);
		labelFlag1.setForeground(Color.red);
		frame.getContentPane().add(labelFlag1);
		/*Antonio-Recordatorio: se usa el foreground para cambiar el color,
		  usando la variable predeterminada color.*/
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(225, 20, 200, 25);
		frame.getContentPane().add(nombreUsuario);
		
		JLabel labelPass = new JLabel("Ingrese Contraseña");
		labelPass.setBounds(35, 60, 200, 25);
		frame.getContentPane().add(labelPass);
		
		JLabel labelFlag2 = new JLabel("*");
		labelFlag2.setBounds(215, 60, 10, 10);
		labelFlag2.setForeground(Color.red);
		frame.getContentPane().add(labelFlag2);
		
		passUsuario = new JPasswordField();
		passUsuario.setBounds(225, 60, 200, 25);
		frame.getContentPane().add(passUsuario);
		
		JLabel labelRepetirPass = new JLabel("Repetir Contraseña");
		labelRepetirPass.setBounds(35, 100, 200, 25);
		frame.getContentPane().add(labelRepetirPass);
		
		JLabel labelFlag3 = new JLabel("*");
		labelFlag3.setBounds(215, 100, 10, 10);
		labelFlag3.setForeground(Color.red);
		frame.getContentPane().add(labelFlag3);
		
		passUsuario2 = new JPasswordField();
		passUsuario2.setBounds(225, 100, 200, 25);
		frame.getContentPane().add(passUsuario2);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.setBounds(50,225,100,40);
		frame.getContentPane().add(botonGuardar);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(300, 225, 100, 40);
		frame.getContentPane().add(botonCancelar);
	}

}
