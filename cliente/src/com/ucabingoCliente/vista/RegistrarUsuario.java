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
	public JTextField telefonoUsuario;
	public JTextField saldoUsuario;
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
		
		nombreUsuario = new JTextField();
		nombreUsuario.setBounds(225, 20, 200, 25);
		frame.getContentPane().add(nombreUsuario);
		
		JLabel labelPass = new JLabel("Ingrese Contraseña");
		labelPass.setBounds(35, 60, 200, 25);
		frame.getContentPane().add(labelPass);
		
		passUsuario = new JPasswordField();
		passUsuario.setBounds(225, 60, 200, 25);
		frame.getContentPane().add(passUsuario);
		
		JLabel labelRepetirPass = new JLabel("Repetir Contraseña");
		labelRepetirPass.setBounds(35, 100, 200, 25);
		frame.getContentPane().add(labelRepetirPass);
		
		passUsuario2 = new JPasswordField();
		passUsuario2.setBounds(225, 100, 200, 25);
		frame.getContentPane().add(passUsuario2);
		
		JLabel labelTelf = new JLabel("Número de teléfono");
		labelTelf.setBounds(35, 140, 200, 25);
		frame.getContentPane().add(labelTelf);
		
		telefonoUsuario = new JTextField();
		telefonoUsuario.setBounds(225, 140, 200, 25);
		frame.getContentPane().add(telefonoUsuario);
		
		JLabel labelSaldo = new JLabel("Saldo a ingresar");
		labelSaldo.setBounds(35, 180, 200, 25);
		frame.getContentPane().add(labelSaldo);
		
		saldoUsuario = new JTextField();
		saldoUsuario.setBounds(225, 180, 200, 25);
		frame.getContentPane().add(saldoUsuario);
		
		botonGuardar = new JButton("Guardar");
		botonGuardar.setBounds(50,225,100,40);
		frame.getContentPane().add(botonGuardar);
		
		botonCancelar = new JButton("Cancelar");
		botonCancelar.setBounds(300, 225, 100, 40);
		frame.getContentPane().add(botonCancelar);
	}

}
