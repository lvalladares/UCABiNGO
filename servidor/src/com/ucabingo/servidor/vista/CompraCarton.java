package com.ucabingo.servidor.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CompraCarton {

	public JFrame frame;
	public JButton btnRegresar;
	public JButton btnComprar;
	public JSpinner spinner;
	public JLabel labelPrecio;
	public JLabel labelSaldo;
	public JLabel labelTotal;
	public JLabel labelMsjError;

	public CompraCarton() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 253);
		frame.setTitle("Compra de cartón");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblComprarCartonDe = new JLabel("Comprar cartón de bingo");
		lblComprarCartonDe.setBounds(43, 12, 176, 15);
		frame.getContentPane().add(lblComprarCartonDe);
		
		JLabel lblSaldoDisponible = new JLabel("Saldo disponible:");
		lblSaldoDisponible.setBounds(12, 76, 123, 15);
		frame.getContentPane().add(lblSaldoDisponible);
		
		JLabel lblBsf = new JLabel("Bsf.");
		lblBsf.setBounds(167, 49, 27, 15);
		frame.getContentPane().add(lblBsf);
		
		labelPrecio = new JLabel("");
		labelPrecio.setBounds(215, 49, 111, 15);
		frame.getContentPane().add(labelPrecio);
		
		JLabel lblPrecioDeCarton = new JLabel("Precio de carton:");
		lblPrecioDeCarton.setBounds(12, 49, 123, 15);
		frame.getContentPane().add(lblPrecioDeCarton);
		
		JLabel label_1 = new JLabel("Bsf.");
		label_1.setBounds(167, 76, 27, 15);
		frame.getContentPane().add(label_1);
		
		labelSaldo = new JLabel("");
		labelSaldo.setBounds(215, 76, 111, 15);
		frame.getContentPane().add(labelSaldo);
		
		JLabel lblCantidadAComprar = new JLabel("Cantidad a comprar:");
		lblCantidadAComprar.setBounds(12, 103, 144, 15);
		frame.getContentPane().add(lblCantidadAComprar);
		
		String cant[] = {"1", "2", "3", "4"}; 
		spinner = new JSpinner(new SpinnerListModel(cant));
		spinner.setBounds(191, 101, 28, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(72, 136, 70, 15);
		frame.getContentPane().add(lblTotal);
		
		JLabel label_3 = new JLabel("Bsf.");
		label_3.setBounds(129, 136, 27, 15);
		frame.getContentPane().add(label_3);
		
		labelTotal = new JLabel("");
		labelTotal.setBounds(167, 136, 111, 15);
		frame.getContentPane().add(labelTotal);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(157, 190, 117, 25);
		frame.getContentPane().add(btnComprar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 190, 117, 25);
		frame.getContentPane().add(btnRegresar);
		
		labelMsjError = new JLabel("");
		labelMsjError.setHorizontalAlignment(SwingConstants.CENTER);
		labelMsjError.setForeground(Color.RED);
		labelMsjError.setBounds(12, 152, 266, 36);
		frame.getContentPane().add(labelMsjError);
	}
}
