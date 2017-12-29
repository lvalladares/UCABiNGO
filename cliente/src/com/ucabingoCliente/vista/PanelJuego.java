package com.ucabingoCliente.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;

import com.ucabingoCliente.modelo.Matriz;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.SwingConstants;

public class PanelJuego {

	public JFrame frame;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel4;
	
	public JLabel lblB1;
	public JLabel lblB2;
	public JLabel lblB3;
	public JLabel lblB4;
	public JLabel lblI1;
	public JLabel lblI2;
	public JLabel lblI3;
	public JLabel lblI4;
	public JLabel lblN1;
	public JLabel lblN2;
	public JLabel lblN3;
	public JLabel lblN4;
	public JLabel lblG1;
	public JLabel lblG2;
	public JLabel lblG3;
	public JLabel lblG4;
	public JLabel lblO1;
	public JLabel lblO2;
	public JLabel lblO3;
	public JLabel lblO4;

	/**
	 * Create the application.
	 */
	public PanelJuego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 625);
		frame.setTitle("Compra de cartón");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFormaDeJuego = new JLabel("Forma de juego:");
		lblFormaDeJuego.setBounds(224, 12, 120, 15);
		frame.getContentPane().add(lblFormaDeJuego);
		
		JLabel lblColumna = new JLabel("Columna");
		lblColumna.setBounds(346, 12, 70, 15);
		frame.getContentPane().add(lblColumna);
		
		JLabel lblNumeroJugado = new JLabel("Numero jugado:");
		lblNumeroJugado.setBounds(224, 39, 125, 15);
		frame.getContentPane().add(lblNumeroJugado);
		
		JLabel lblB_1 = new JLabel("B12");
		lblB_1.setBounds(346, 39, 70, 15);
		frame.getContentPane().add(lblB_1);
		
		JLabel lblFelicidades = new JLabel("Felicidades! Ha ganado la partida!");
		lblFelicidades.setBounds(172, 572, 244, 15);
		frame.getContentPane().add(lblFelicidades);
		
		panel1 = new JPanel( null );
		panel1.setBounds(12, 107, 250, 198);
		frame.getContentPane().add(panel1);
		
		panel2 = new JPanel( null );
		panel2.setBounds(330, 107, 250, 198);
		frame.getContentPane().add(panel2);
		
		panel3 = new JPanel( null );
		panel3.setBounds(12, 362, 250, 198);
		frame.getContentPane().add(panel3);
		
		panel4 = new JPanel( null );
		panel4.setBounds(330, 362, 250, 198);
		frame.getContentPane().add(panel4);
		
		lblB1 = new JLabel("B");
		lblB1.setBounds(35, 80, 15, 15);
		frame.getContentPane().add(lblB1);

		lblI1 = new JLabel("I");
		lblI1.setBounds(86, 80, 15, 15);
		frame.getContentPane().add(lblI1);

		lblN1 = new JLabel("N");
		lblN1.setBounds(131, 80, 15, 15);
		frame.getContentPane().add(lblN1);

		lblG1 = new JLabel("G");
		lblG1.setBounds(183, 80, 15, 15);
		frame.getContentPane().add(lblG1);

		lblO1 = new JLabel("O");
		lblO1.setBounds(233, 80, 15, 15);
		frame.getContentPane().add(lblO1);

		lblB2 = new JLabel("B");
		lblB2.setBounds(350, 80, 15, 15);
		frame.getContentPane().add(lblB2);

		lblI2 = new JLabel("I");
		lblI2.setBounds(405, 80, 15, 15);
		frame.getContentPane().add(lblI2);
		lblN2 = new JLabel("N");
		lblN2.setBounds(450, 80, 15, 15);
		frame.getContentPane().add(lblN2);

		lblG2 = new JLabel("G");
		lblG2.setBounds(500, 80, 15, 15);
		frame.getContentPane().add(lblG2);

		lblO2 = new JLabel("O");
		lblO2.setBounds(550, 80, 15, 15);
		frame.getContentPane().add(lblO2);

		lblB3 = new JLabel("B");
		lblB3.setBounds(35, 335, 15, 15);
		frame.getContentPane().add(lblB3);

		lblI3 = new JLabel("I");
		lblI3.setBounds(86, 335, 15, 15);
		frame.getContentPane().add(lblI3);

		lblN3 = new JLabel("N");
		lblN3.setBounds(131, 335, 15, 15);
		frame.getContentPane().add(lblN3);

		lblG3 = new JLabel("G");
		lblG3.setBounds(183, 335, 15, 15);
		frame.getContentPane().add(lblG3);

		lblO3 = new JLabel("O");
		lblO3.setBounds(233, 335, 15, 15);
		frame.getContentPane().add(lblO3);

		lblB4 = new JLabel("B");
		lblB4.setBounds(350, 335, 15, 15);
		frame.getContentPane().add(lblB4);

		lblI4 = new JLabel("I");
		lblI4.setBounds(405, 335, 15, 15);
		frame.getContentPane().add(lblI4);

		lblN4 = new JLabel("N");
		lblN4.setBounds(450, 335, 15, 15);
		frame.getContentPane().add(lblN4);

		lblG4 = new JLabel("G");
		lblG4.setBounds(500, 335, 15, 15);
		frame.getContentPane().add(lblG4);

		lblO4 = new JLabel("O");
		lblO4.setBounds(550, 335, 15, 15);
		frame.getContentPane().add(lblO4);
		
	}
}
