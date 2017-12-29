package com.ucabingoCliente.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Bingo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bingo window = new Bingo();
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
	public Bingo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 585);
		frame.setTitle("Compra de cartón");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFormaDeJuego = new JLabel("Forma de juego:");
		lblFormaDeJuego.setBounds(224, 12, 120, 15);
		frame.getContentPane().add(lblFormaDeJuego);
		
		JLabel lblColumna = new JLabel("Columna");
		lblColumna.setBounds(346, 12, 70, 15);
		frame.getContentPane().add(lblColumna);
		
		JPanel panelCarton1 = new JPanel();
		panelCarton1.setBounds(12, 91, 270, 185);
		frame.getContentPane().add(panelCarton1);
		GridBagLayout gbl_panelCarton1 = new GridBagLayout();
		gbl_panelCarton1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCarton1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCarton1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCarton1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCarton1.setLayout(gbl_panelCarton1);
		
		JLabel lblCarton = new JLabel("Carton 1");
		GridBagConstraints gbc_lblCarton = new GridBagConstraints();
		gbc_lblCarton.gridwidth = 2;
		gbc_lblCarton.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarton.gridx = 0;
		gbc_lblCarton.gridy = 0;
		panelCarton1.add(lblCarton, gbc_lblCarton);
		
		JLabel lblSerialCtn1 = new JLabel("serial");
		GridBagConstraints gbc_lblSerialCtn1 = new GridBagConstraints();
		gbc_lblSerialCtn1.gridwidth = 2;
		gbc_lblSerialCtn1.insets = new Insets(0, 0, 5, 0);
		gbc_lblSerialCtn1.gridx = 3;
		gbc_lblSerialCtn1.gridy = 0;
		panelCarton1.add(lblSerialCtn1, gbc_lblSerialCtn1);
		
		JLabel lblB = new JLabel("B");
		GridBagConstraints gbc_lblB = new GridBagConstraints();
		gbc_lblB.insets = new Insets(0, 0, 5, 5);
		gbc_lblB.gridx = 0;
		gbc_lblB.gridy = 1;
		panelCarton1.add(lblB, gbc_lblB);
		
		JLabel lblI = new JLabel("I");
		GridBagConstraints gbc_lblI = new GridBagConstraints();
		gbc_lblI.insets = new Insets(0, 0, 5, 5);
		gbc_lblI.gridx = 1;
		gbc_lblI.gridy = 1;
		panelCarton1.add(lblI, gbc_lblI);
		
		JLabel lblN = new JLabel("N");
		GridBagConstraints gbc_lblN = new GridBagConstraints();
		gbc_lblN.insets = new Insets(0, 0, 5, 5);
		gbc_lblN.gridx = 2;
		gbc_lblN.gridy = 1;
		panelCarton1.add(lblN, gbc_lblN);
		
		JLabel lblG = new JLabel("G");
		GridBagConstraints gbc_lblG = new GridBagConstraints();
		gbc_lblG.insets = new Insets(0, 0, 5, 5);
		gbc_lblG.gridx = 3;
		gbc_lblG.gridy = 1;
		panelCarton1.add(lblG, gbc_lblG);
		
		JLabel lblO = new JLabel("O");
		GridBagConstraints gbc_lblO = new GridBagConstraints();
		gbc_lblO.insets = new Insets(0, 0, 5, 0);
		gbc_lblO.gridx = 4;
		gbc_lblO.gridy = 1;
		panelCarton1.add(lblO, gbc_lblO);
		
		JButton button = new JButton("12");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 2;
		panelCarton1.add(button, gbc_button);
		
		JButton button_1 = new JButton("12");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 2;
		panelCarton1.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("12");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 2;
		panelCarton1.add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("12");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 2;
		panelCarton1.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("12");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 0);
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 2;
		panelCarton1.add(button_4, gbc_button_4);
		gbc_button_4.gridx = 2;
		gbc_button_4.gridy = 2;
		
		JButton button_5 = new JButton("12");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 3;
		panelCarton1.add(button_5, gbc_button_5);
		
		JButton button_9 = new JButton("12");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 1;
		gbc_button_9.gridy = 3;
		panelCarton1.add(button_9, gbc_button_9);
		
		JButton button_13 = new JButton("12");
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 2;
		gbc_button_13.gridy = 3;
		panelCarton1.add(button_13, gbc_button_13);
		
		JButton button_17 = new JButton("12");
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 3;
		gbc_button_17.gridy = 3;
		panelCarton1.add(button_17, gbc_button_17);
		
		JButton button_21 = new JButton("12");
		GridBagConstraints gbc_button_21 = new GridBagConstraints();
		gbc_button_21.insets = new Insets(0, 0, 5, 0);
		gbc_button_21.gridx = 4;
		gbc_button_21.gridy = 3;
		panelCarton1.add(button_21, gbc_button_21);
		
		JButton button_6 = new JButton("12");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 4;
		panelCarton1.add(button_6, gbc_button_6);
		
		JButton button_10 = new JButton("12");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 1;
		gbc_button_10.gridy = 4;
		panelCarton1.add(button_10, gbc_button_10);
		
		JButton button_14 = new JButton("12");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 2;
		gbc_button_14.gridy = 4;
		panelCarton1.add(button_14, gbc_button_14);
		
		JButton button_18 = new JButton("12");
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 3;
		gbc_button_18.gridy = 4;
		panelCarton1.add(button_18, gbc_button_18);
		
		JButton button_22 = new JButton("12");
		GridBagConstraints gbc_button_22 = new GridBagConstraints();
		gbc_button_22.insets = new Insets(0, 0, 5, 0);
		gbc_button_22.gridx = 4;
		gbc_button_22.gridy = 4;
		panelCarton1.add(button_22, gbc_button_22);
		
		JButton button_7 = new JButton("12");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 5;
		panelCarton1.add(button_7, gbc_button_7);
		
		JButton button_11 = new JButton("12");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 1;
		gbc_button_11.gridy = 5;
		panelCarton1.add(button_11, gbc_button_11);
		
		JButton button_15 = new JButton("12");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 2;
		gbc_button_15.gridy = 5;
		panelCarton1.add(button_15, gbc_button_15);
		
		JButton button_19 = new JButton("12");
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.insets = new Insets(0, 0, 5, 5);
		gbc_button_19.gridx = 3;
		gbc_button_19.gridy = 5;
		panelCarton1.add(button_19, gbc_button_19);
		
		JButton button_23 = new JButton("12");
		GridBagConstraints gbc_button_23 = new GridBagConstraints();
		gbc_button_23.insets = new Insets(0, 0, 5, 0);
		gbc_button_23.gridx = 4;
		gbc_button_23.gridy = 5;
		panelCarton1.add(button_23, gbc_button_23);
		
		JButton button_8 = new JButton("12");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 0, 5);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 6;
		panelCarton1.add(button_8, gbc_button_8);
		
		JButton button_12 = new JButton("12");
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 0, 5);
		gbc_button_12.gridx = 1;
		gbc_button_12.gridy = 6;
		panelCarton1.add(button_12, gbc_button_12);
		
		JButton button_16 = new JButton("12");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 0, 5);
		gbc_button_16.gridx = 2;
		gbc_button_16.gridy = 6;
		panelCarton1.add(button_16, gbc_button_16);
		
		JButton button_20 = new JButton("12");
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.insets = new Insets(0, 0, 0, 5);
		gbc_button_20.gridx = 3;
		gbc_button_20.gridy = 6;
		panelCarton1.add(button_20, gbc_button_20);
		
		JButton button_24 = new JButton("12");
		GridBagConstraints gbc_button_24 = new GridBagConstraints();
		gbc_button_24.gridx = 4;
		gbc_button_24.gridy = 6;
		panelCarton1.add(button_24, gbc_button_24);
		
		JPanel panelCarton2 = new JPanel();
		panelCarton2.setBounds(359, 91, 270, 185);
		frame.getContentPane().add(panelCarton2);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCarton2.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Carton 2");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panelCarton2.add(label, gbc_label);
		
		JLabel lblSerialCtn2 = new JLabel("serial");
		GridBagConstraints gbc_lblSerialCtn2 = new GridBagConstraints();
		gbc_lblSerialCtn2.gridwidth = 2;
		gbc_lblSerialCtn2.insets = new Insets(0, 0, 5, 0);
		gbc_lblSerialCtn2.gridx = 3;
		gbc_lblSerialCtn2.gridy = 0;
		panelCarton2.add(lblSerialCtn2, gbc_lblSerialCtn2);
		
		JLabel label_1 = new JLabel("B");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panelCarton2.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("I");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 1;
		panelCarton2.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("N");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 2;
		gbc_label_3.gridy = 1;
		panelCarton2.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("G");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 3;
		gbc_label_4.gridy = 1;
		panelCarton2.add(label_4, gbc_label_4);
		
		JLabel label_5 = new JLabel("O");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 4;
		gbc_label_5.gridy = 1;
		panelCarton2.add(label_5, gbc_label_5);
		
		JButton button_25 = new JButton("12");
		GridBagConstraints gbc_button_25 = new GridBagConstraints();
		gbc_button_25.insets = new Insets(0, 0, 5, 5);
		gbc_button_25.gridx = 0;
		gbc_button_25.gridy = 2;
		panelCarton2.add(button_25, gbc_button_25);
		
		JButton button_26 = new JButton("12");
		GridBagConstraints gbc_button_26 = new GridBagConstraints();
		gbc_button_26.insets = new Insets(0, 0, 5, 5);
		gbc_button_26.gridx = 1;
		gbc_button_26.gridy = 2;
		panelCarton2.add(button_26, gbc_button_26);
		
		JButton button_27 = new JButton("12");
		GridBagConstraints gbc_button_27 = new GridBagConstraints();
		gbc_button_27.insets = new Insets(0, 0, 5, 5);
		gbc_button_27.gridx = 2;
		gbc_button_27.gridy = 2;
		panelCarton2.add(button_27, gbc_button_27);
		
		JButton button_28 = new JButton("12");
		GridBagConstraints gbc_button_28 = new GridBagConstraints();
		gbc_button_28.insets = new Insets(0, 0, 5, 5);
		gbc_button_28.gridx = 3;
		gbc_button_28.gridy = 2;
		panelCarton2.add(button_28, gbc_button_28);
		
		JButton button_29 = new JButton("12");
		GridBagConstraints gbc_button_29 = new GridBagConstraints();
		gbc_button_29.insets = new Insets(0, 0, 5, 0);
		gbc_button_29.gridx = 4;
		gbc_button_29.gridy = 2;
		panelCarton2.add(button_29, gbc_button_29);
		
		JButton button_30 = new JButton("12");
		GridBagConstraints gbc_button_30 = new GridBagConstraints();
		gbc_button_30.insets = new Insets(0, 0, 5, 5);
		gbc_button_30.gridx = 0;
		gbc_button_30.gridy = 3;
		panelCarton2.add(button_30, gbc_button_30);
		
		JButton button_31 = new JButton("12");
		GridBagConstraints gbc_button_31 = new GridBagConstraints();
		gbc_button_31.insets = new Insets(0, 0, 5, 5);
		gbc_button_31.gridx = 1;
		gbc_button_31.gridy = 3;
		panelCarton2.add(button_31, gbc_button_31);
		
		JButton button_32 = new JButton("12");
		GridBagConstraints gbc_button_32 = new GridBagConstraints();
		gbc_button_32.insets = new Insets(0, 0, 5, 5);
		gbc_button_32.gridx = 2;
		gbc_button_32.gridy = 3;
		panelCarton2.add(button_32, gbc_button_32);
		
		JButton button_33 = new JButton("12");
		GridBagConstraints gbc_button_33 = new GridBagConstraints();
		gbc_button_33.insets = new Insets(0, 0, 5, 5);
		gbc_button_33.gridx = 3;
		gbc_button_33.gridy = 3;
		panelCarton2.add(button_33, gbc_button_33);
		
		JButton button_34 = new JButton("12");
		GridBagConstraints gbc_button_34 = new GridBagConstraints();
		gbc_button_34.insets = new Insets(0, 0, 5, 0);
		gbc_button_34.gridx = 4;
		gbc_button_34.gridy = 3;
		panelCarton2.add(button_34, gbc_button_34);
		
		JButton button_35 = new JButton("12");
		GridBagConstraints gbc_button_35 = new GridBagConstraints();
		gbc_button_35.insets = new Insets(0, 0, 5, 5);
		gbc_button_35.gridx = 0;
		gbc_button_35.gridy = 4;
		panelCarton2.add(button_35, gbc_button_35);
		
		JButton button_36 = new JButton("12");
		GridBagConstraints gbc_button_36 = new GridBagConstraints();
		gbc_button_36.insets = new Insets(0, 0, 5, 5);
		gbc_button_36.gridx = 1;
		gbc_button_36.gridy = 4;
		panelCarton2.add(button_36, gbc_button_36);
		
		JButton button_37 = new JButton("12");
		GridBagConstraints gbc_button_37 = new GridBagConstraints();
		gbc_button_37.insets = new Insets(0, 0, 5, 5);
		gbc_button_37.gridx = 2;
		gbc_button_37.gridy = 4;
		panelCarton2.add(button_37, gbc_button_37);
		
		JButton button_38 = new JButton("12");
		GridBagConstraints gbc_button_38 = new GridBagConstraints();
		gbc_button_38.insets = new Insets(0, 0, 5, 5);
		gbc_button_38.gridx = 3;
		gbc_button_38.gridy = 4;
		panelCarton2.add(button_38, gbc_button_38);
		
		JButton button_39 = new JButton("12");
		GridBagConstraints gbc_button_39 = new GridBagConstraints();
		gbc_button_39.insets = new Insets(0, 0, 5, 0);
		gbc_button_39.gridx = 4;
		gbc_button_39.gridy = 4;
		panelCarton2.add(button_39, gbc_button_39);
		
		JButton button_40 = new JButton("12");
		GridBagConstraints gbc_button_40 = new GridBagConstraints();
		gbc_button_40.insets = new Insets(0, 0, 5, 5);
		gbc_button_40.gridx = 0;
		gbc_button_40.gridy = 5;
		panelCarton2.add(button_40, gbc_button_40);
		
		JButton button_41 = new JButton("12");
		GridBagConstraints gbc_button_41 = new GridBagConstraints();
		gbc_button_41.insets = new Insets(0, 0, 5, 5);
		gbc_button_41.gridx = 1;
		gbc_button_41.gridy = 5;
		panelCarton2.add(button_41, gbc_button_41);
		
		JButton button_42 = new JButton("12");
		GridBagConstraints gbc_button_42 = new GridBagConstraints();
		gbc_button_42.insets = new Insets(0, 0, 5, 5);
		gbc_button_42.gridx = 2;
		gbc_button_42.gridy = 5;
		panelCarton2.add(button_42, gbc_button_42);
		
		JButton button_43 = new JButton("12");
		GridBagConstraints gbc_button_43 = new GridBagConstraints();
		gbc_button_43.insets = new Insets(0, 0, 5, 5);
		gbc_button_43.gridx = 3;
		gbc_button_43.gridy = 5;
		panelCarton2.add(button_43, gbc_button_43);
		
		JButton button_44 = new JButton("12");
		GridBagConstraints gbc_button_44 = new GridBagConstraints();
		gbc_button_44.insets = new Insets(0, 0, 5, 0);
		gbc_button_44.gridx = 4;
		gbc_button_44.gridy = 5;
		panelCarton2.add(button_44, gbc_button_44);
		
		JButton button_45 = new JButton("12");
		GridBagConstraints gbc_button_45 = new GridBagConstraints();
		gbc_button_45.insets = new Insets(0, 0, 0, 5);
		gbc_button_45.gridx = 0;
		gbc_button_45.gridy = 6;
		panelCarton2.add(button_45, gbc_button_45);
		
		JButton button_46 = new JButton("12");
		GridBagConstraints gbc_button_46 = new GridBagConstraints();
		gbc_button_46.insets = new Insets(0, 0, 0, 5);
		gbc_button_46.gridx = 1;
		gbc_button_46.gridy = 6;
		panelCarton2.add(button_46, gbc_button_46);
		
		JButton button_47 = new JButton("12");
		GridBagConstraints gbc_button_47 = new GridBagConstraints();
		gbc_button_47.insets = new Insets(0, 0, 0, 5);
		gbc_button_47.gridx = 2;
		gbc_button_47.gridy = 6;
		panelCarton2.add(button_47, gbc_button_47);
		
		JButton button_48 = new JButton("12");
		GridBagConstraints gbc_button_48 = new GridBagConstraints();
		gbc_button_48.insets = new Insets(0, 0, 0, 5);
		gbc_button_48.gridx = 3;
		gbc_button_48.gridy = 6;
		panelCarton2.add(button_48, gbc_button_48);
		
		JButton button_49 = new JButton("12");
		GridBagConstraints gbc_button_49 = new GridBagConstraints();
		gbc_button_49.gridx = 4;
		gbc_button_49.gridy = 6;
		panelCarton2.add(button_49, gbc_button_49);
		
		JPanel panelCarton3 = new JPanel();
		panelCarton3.setBounds(12, 320, 270, 185);
		frame.getContentPane().add(panelCarton3);
		GridBagLayout gbl_panelCarton3 = new GridBagLayout();
		gbl_panelCarton3.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCarton3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCarton3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCarton3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCarton3.setLayout(gbl_panelCarton3);
		
		JLabel label_6 = new JLabel("Carton 3");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.gridwidth = 2;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 0;
		panelCarton3.add(label_6, gbc_label_6);
		
		JLabel lblSerialCtn3 = new JLabel("serial");
		GridBagConstraints gbc_lblSerialCtn3 = new GridBagConstraints();
		gbc_lblSerialCtn3.gridwidth = 2;
		gbc_lblSerialCtn3.insets = new Insets(0, 0, 5, 5);
		gbc_lblSerialCtn3.gridx = 3;
		gbc_lblSerialCtn3.gridy = 0;
		panelCarton3.add(lblSerialCtn3, gbc_lblSerialCtn3);
		
		JLabel label_7 = new JLabel("B");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 1;
		panelCarton3.add(label_7, gbc_label_7);
		
		JLabel label_8 = new JLabel("I");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 1;
		panelCarton3.add(label_8, gbc_label_8);
		
		JLabel label_9 = new JLabel("N");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 2;
		gbc_label_9.gridy = 1;
		panelCarton3.add(label_9, gbc_label_9);
		
		JLabel label_10 = new JLabel("G");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 3;
		gbc_label_10.gridy = 1;
		panelCarton3.add(label_10, gbc_label_10);
		
		JLabel label_11 = new JLabel("O");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 0);
		gbc_label_11.gridx = 4;
		gbc_label_11.gridy = 1;
		panelCarton3.add(label_11, gbc_label_11);
		
		JButton button_50 = new JButton("12");
		GridBagConstraints gbc_button_50 = new GridBagConstraints();
		gbc_button_50.insets = new Insets(0, 0, 5, 5);
		gbc_button_50.gridx = 0;
		gbc_button_50.gridy = 2;
		panelCarton3.add(button_50, gbc_button_50);
		
		JButton button_51 = new JButton("12");
		GridBagConstraints gbc_button_51 = new GridBagConstraints();
		gbc_button_51.insets = new Insets(0, 0, 5, 5);
		gbc_button_51.gridx = 1;
		gbc_button_51.gridy = 2;
		panelCarton3.add(button_51, gbc_button_51);
		
		JButton button_52 = new JButton("12");
		GridBagConstraints gbc_button_52 = new GridBagConstraints();
		gbc_button_52.insets = new Insets(0, 0, 5, 5);
		gbc_button_52.gridx = 2;
		gbc_button_52.gridy = 2;
		panelCarton3.add(button_52, gbc_button_52);
		
		JButton button_53 = new JButton("12");
		GridBagConstraints gbc_button_53 = new GridBagConstraints();
		gbc_button_53.insets = new Insets(0, 0, 5, 5);
		gbc_button_53.gridx = 3;
		gbc_button_53.gridy = 2;
		panelCarton3.add(button_53, gbc_button_53);
		
		JButton button_54 = new JButton("12");
		GridBagConstraints gbc_button_54 = new GridBagConstraints();
		gbc_button_54.insets = new Insets(0, 0, 5, 0);
		gbc_button_54.gridx = 4;
		gbc_button_54.gridy = 2;
		panelCarton3.add(button_54, gbc_button_54);
		
		JButton button_55 = new JButton("12");
		GridBagConstraints gbc_button_55 = new GridBagConstraints();
		gbc_button_55.insets = new Insets(0, 0, 5, 5);
		gbc_button_55.gridx = 0;
		gbc_button_55.gridy = 3;
		panelCarton3.add(button_55, gbc_button_55);
		
		JButton button_56 = new JButton("12");
		GridBagConstraints gbc_button_56 = new GridBagConstraints();
		gbc_button_56.insets = new Insets(0, 0, 5, 5);
		gbc_button_56.gridx = 1;
		gbc_button_56.gridy = 3;
		panelCarton3.add(button_56, gbc_button_56);
		
		JButton button_57 = new JButton("12");
		GridBagConstraints gbc_button_57 = new GridBagConstraints();
		gbc_button_57.insets = new Insets(0, 0, 5, 5);
		gbc_button_57.gridx = 2;
		gbc_button_57.gridy = 3;
		panelCarton3.add(button_57, gbc_button_57);
		
		JButton button_58 = new JButton("12");
		GridBagConstraints gbc_button_58 = new GridBagConstraints();
		gbc_button_58.insets = new Insets(0, 0, 5, 5);
		gbc_button_58.gridx = 3;
		gbc_button_58.gridy = 3;
		panelCarton3.add(button_58, gbc_button_58);
		
		JButton button_59 = new JButton("12");
		GridBagConstraints gbc_button_59 = new GridBagConstraints();
		gbc_button_59.insets = new Insets(0, 0, 5, 0);
		gbc_button_59.gridx = 4;
		gbc_button_59.gridy = 3;
		panelCarton3.add(button_59, gbc_button_59);
		
		JButton button_60 = new JButton("12");
		GridBagConstraints gbc_button_60 = new GridBagConstraints();
		gbc_button_60.insets = new Insets(0, 0, 5, 5);
		gbc_button_60.gridx = 0;
		gbc_button_60.gridy = 4;
		panelCarton3.add(button_60, gbc_button_60);
		
		JButton button_61 = new JButton("12");
		GridBagConstraints gbc_button_61 = new GridBagConstraints();
		gbc_button_61.insets = new Insets(0, 0, 5, 5);
		gbc_button_61.gridx = 1;
		gbc_button_61.gridy = 4;
		panelCarton3.add(button_61, gbc_button_61);
		
		JButton button_62 = new JButton("12");
		GridBagConstraints gbc_button_62 = new GridBagConstraints();
		gbc_button_62.insets = new Insets(0, 0, 5, 5);
		gbc_button_62.gridx = 2;
		gbc_button_62.gridy = 4;
		panelCarton3.add(button_62, gbc_button_62);
		
		JButton button_63 = new JButton("12");
		GridBagConstraints gbc_button_63 = new GridBagConstraints();
		gbc_button_63.insets = new Insets(0, 0, 5, 5);
		gbc_button_63.gridx = 3;
		gbc_button_63.gridy = 4;
		panelCarton3.add(button_63, gbc_button_63);
		
		JButton button_64 = new JButton("12");
		GridBagConstraints gbc_button_64 = new GridBagConstraints();
		gbc_button_64.insets = new Insets(0, 0, 5, 0);
		gbc_button_64.gridx = 4;
		gbc_button_64.gridy = 4;
		panelCarton3.add(button_64, gbc_button_64);
		
		JButton button_65 = new JButton("12");
		GridBagConstraints gbc_button_65 = new GridBagConstraints();
		gbc_button_65.insets = new Insets(0, 0, 5, 5);
		gbc_button_65.gridx = 0;
		gbc_button_65.gridy = 5;
		panelCarton3.add(button_65, gbc_button_65);
		
		JButton button_66 = new JButton("12");
		GridBagConstraints gbc_button_66 = new GridBagConstraints();
		gbc_button_66.insets = new Insets(0, 0, 5, 5);
		gbc_button_66.gridx = 1;
		gbc_button_66.gridy = 5;
		panelCarton3.add(button_66, gbc_button_66);
		
		JButton button_67 = new JButton("12");
		GridBagConstraints gbc_button_67 = new GridBagConstraints();
		gbc_button_67.insets = new Insets(0, 0, 5, 5);
		gbc_button_67.gridx = 2;
		gbc_button_67.gridy = 5;
		panelCarton3.add(button_67, gbc_button_67);
		
		JButton button_68 = new JButton("12");
		GridBagConstraints gbc_button_68 = new GridBagConstraints();
		gbc_button_68.insets = new Insets(0, 0, 5, 5);
		gbc_button_68.gridx = 3;
		gbc_button_68.gridy = 5;
		panelCarton3.add(button_68, gbc_button_68);
		
		JButton button_69 = new JButton("12");
		GridBagConstraints gbc_button_69 = new GridBagConstraints();
		gbc_button_69.insets = new Insets(0, 0, 5, 0);
		gbc_button_69.gridx = 4;
		gbc_button_69.gridy = 5;
		panelCarton3.add(button_69, gbc_button_69);
		
		JButton button_70 = new JButton("12");
		GridBagConstraints gbc_button_70 = new GridBagConstraints();
		gbc_button_70.insets = new Insets(0, 0, 0, 5);
		gbc_button_70.gridx = 0;
		gbc_button_70.gridy = 6;
		panelCarton3.add(button_70, gbc_button_70);
		
		JButton button_71 = new JButton("12");
		GridBagConstraints gbc_button_71 = new GridBagConstraints();
		gbc_button_71.insets = new Insets(0, 0, 0, 5);
		gbc_button_71.gridx = 1;
		gbc_button_71.gridy = 6;
		panelCarton3.add(button_71, gbc_button_71);
		
		JButton button_72 = new JButton("12");
		GridBagConstraints gbc_button_72 = new GridBagConstraints();
		gbc_button_72.insets = new Insets(0, 0, 0, 5);
		gbc_button_72.gridx = 2;
		gbc_button_72.gridy = 6;
		panelCarton3.add(button_72, gbc_button_72);
		
		JButton button_73 = new JButton("12");
		GridBagConstraints gbc_button_73 = new GridBagConstraints();
		gbc_button_73.insets = new Insets(0, 0, 0, 5);
		gbc_button_73.gridx = 3;
		gbc_button_73.gridy = 6;
		panelCarton3.add(button_73, gbc_button_73);
		
		JButton button_74 = new JButton("12");
		GridBagConstraints gbc_button_74 = new GridBagConstraints();
		gbc_button_74.gridx = 4;
		gbc_button_74.gridy = 6;
		panelCarton3.add(button_74, gbc_button_74);
		
		JPanel panelCarton4 = new JPanel();
		panelCarton4.setBounds(359, 320, 270, 185);
		frame.getContentPane().add(panelCarton4);
		GridBagLayout gbl_panelCarton4 = new GridBagLayout();
		gbl_panelCarton4.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCarton4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCarton4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCarton4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCarton4.setLayout(gbl_panelCarton4);
		
		JLabel label_12 = new JLabel("Carton 4");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.gridwidth = 2;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 0;
		panelCarton4.add(label_12, gbc_label_12);
		
		JLabel lblSerialCtn4 = new JLabel("serial");
		GridBagConstraints gbc_lblSerialCtn4 = new GridBagConstraints();
		gbc_lblSerialCtn4.gridwidth = 2;
		gbc_lblSerialCtn4.insets = new Insets(0, 0, 5, 5);
		gbc_lblSerialCtn4.gridx = 3;
		gbc_lblSerialCtn4.gridy = 0;
		panelCarton4.add(lblSerialCtn4, gbc_lblSerialCtn4);
		
		JLabel label_13 = new JLabel("B");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 1;
		panelCarton4.add(label_13, gbc_label_13);
		
		JLabel label_14 = new JLabel("I");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 1;
		gbc_label_14.gridy = 1;
		panelCarton4.add(label_14, gbc_label_14);
		
		JLabel label_15 = new JLabel("N");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 2;
		gbc_label_15.gridy = 1;
		panelCarton4.add(label_15, gbc_label_15);
		
		JLabel label_16 = new JLabel("G");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 3;
		gbc_label_16.gridy = 1;
		panelCarton4.add(label_16, gbc_label_16);
		
		JLabel label_17 = new JLabel("O");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 5, 0);
		gbc_label_17.gridx = 4;
		gbc_label_17.gridy = 1;
		panelCarton4.add(label_17, gbc_label_17);
		
		JButton button_75 = new JButton("12");
		GridBagConstraints gbc_button_75 = new GridBagConstraints();
		gbc_button_75.insets = new Insets(0, 0, 5, 5);
		gbc_button_75.gridx = 0;
		gbc_button_75.gridy = 2;
		panelCarton4.add(button_75, gbc_button_75);
		
		JButton button_76 = new JButton("12");
		GridBagConstraints gbc_button_76 = new GridBagConstraints();
		gbc_button_76.insets = new Insets(0, 0, 5, 5);
		gbc_button_76.gridx = 1;
		gbc_button_76.gridy = 2;
		panelCarton4.add(button_76, gbc_button_76);
		
		JButton button_77 = new JButton("12");
		GridBagConstraints gbc_button_77 = new GridBagConstraints();
		gbc_button_77.insets = new Insets(0, 0, 5, 5);
		gbc_button_77.gridx = 2;
		gbc_button_77.gridy = 2;
		panelCarton4.add(button_77, gbc_button_77);
		
		JButton button_78 = new JButton("12");
		GridBagConstraints gbc_button_78 = new GridBagConstraints();
		gbc_button_78.insets = new Insets(0, 0, 5, 5);
		gbc_button_78.gridx = 3;
		gbc_button_78.gridy = 2;
		panelCarton4.add(button_78, gbc_button_78);
		
		JButton button_79 = new JButton("12");
		GridBagConstraints gbc_button_79 = new GridBagConstraints();
		gbc_button_79.insets = new Insets(0, 0, 5, 0);
		gbc_button_79.gridx = 4;
		gbc_button_79.gridy = 2;
		panelCarton4.add(button_79, gbc_button_79);
		
		JButton button_80 = new JButton("12");
		GridBagConstraints gbc_button_80 = new GridBagConstraints();
		gbc_button_80.insets = new Insets(0, 0, 5, 5);
		gbc_button_80.gridx = 0;
		gbc_button_80.gridy = 3;
		panelCarton4.add(button_80, gbc_button_80);
		
		JButton button_81 = new JButton("12");
		GridBagConstraints gbc_button_81 = new GridBagConstraints();
		gbc_button_81.insets = new Insets(0, 0, 5, 5);
		gbc_button_81.gridx = 1;
		gbc_button_81.gridy = 3;
		panelCarton4.add(button_81, gbc_button_81);
		
		JButton button_82 = new JButton("12");
		GridBagConstraints gbc_button_82 = new GridBagConstraints();
		gbc_button_82.insets = new Insets(0, 0, 5, 5);
		gbc_button_82.gridx = 2;
		gbc_button_82.gridy = 3;
		panelCarton4.add(button_82, gbc_button_82);
		
		JButton button_83 = new JButton("12");
		GridBagConstraints gbc_button_83 = new GridBagConstraints();
		gbc_button_83.insets = new Insets(0, 0, 5, 5);
		gbc_button_83.gridx = 3;
		gbc_button_83.gridy = 3;
		panelCarton4.add(button_83, gbc_button_83);
		
		JButton button_84 = new JButton("12");
		GridBagConstraints gbc_button_84 = new GridBagConstraints();
		gbc_button_84.insets = new Insets(0, 0, 5, 0);
		gbc_button_84.gridx = 4;
		gbc_button_84.gridy = 3;
		panelCarton4.add(button_84, gbc_button_84);
		
		JButton button_85 = new JButton("12");
		GridBagConstraints gbc_button_85 = new GridBagConstraints();
		gbc_button_85.insets = new Insets(0, 0, 5, 5);
		gbc_button_85.gridx = 0;
		gbc_button_85.gridy = 4;
		panelCarton4.add(button_85, gbc_button_85);
		
		JButton button_86 = new JButton("12");
		GridBagConstraints gbc_button_86 = new GridBagConstraints();
		gbc_button_86.insets = new Insets(0, 0, 5, 5);
		gbc_button_86.gridx = 1;
		gbc_button_86.gridy = 4;
		panelCarton4.add(button_86, gbc_button_86);
		
		JButton button_87 = new JButton("12");
		GridBagConstraints gbc_button_87 = new GridBagConstraints();
		gbc_button_87.insets = new Insets(0, 0, 5, 5);
		gbc_button_87.gridx = 2;
		gbc_button_87.gridy = 4;
		panelCarton4.add(button_87, gbc_button_87);
		
		JButton button_88 = new JButton("12");
		GridBagConstraints gbc_button_88 = new GridBagConstraints();
		gbc_button_88.insets = new Insets(0, 0, 5, 5);
		gbc_button_88.gridx = 3;
		gbc_button_88.gridy = 4;
		panelCarton4.add(button_88, gbc_button_88);
		
		JButton button_89 = new JButton("12");
		GridBagConstraints gbc_button_89 = new GridBagConstraints();
		gbc_button_89.insets = new Insets(0, 0, 5, 0);
		gbc_button_89.gridx = 4;
		gbc_button_89.gridy = 4;
		panelCarton4.add(button_89, gbc_button_89);
		
		JButton button_90 = new JButton("12");
		GridBagConstraints gbc_button_90 = new GridBagConstraints();
		gbc_button_90.insets = new Insets(0, 0, 5, 5);
		gbc_button_90.gridx = 0;
		gbc_button_90.gridy = 5;
		panelCarton4.add(button_90, gbc_button_90);
		
		JButton button_91 = new JButton("12");
		GridBagConstraints gbc_button_91 = new GridBagConstraints();
		gbc_button_91.insets = new Insets(0, 0, 5, 5);
		gbc_button_91.gridx = 1;
		gbc_button_91.gridy = 5;
		panelCarton4.add(button_91, gbc_button_91);
		
		JButton button_92 = new JButton("12");
		GridBagConstraints gbc_button_92 = new GridBagConstraints();
		gbc_button_92.insets = new Insets(0, 0, 5, 5);
		gbc_button_92.gridx = 2;
		gbc_button_92.gridy = 5;
		panelCarton4.add(button_92, gbc_button_92);
		
		JButton button_93 = new JButton("12");
		GridBagConstraints gbc_button_93 = new GridBagConstraints();
		gbc_button_93.insets = new Insets(0, 0, 5, 5);
		gbc_button_93.gridx = 3;
		gbc_button_93.gridy = 5;
		panelCarton4.add(button_93, gbc_button_93);
		
		JButton button_94 = new JButton("12");
		GridBagConstraints gbc_button_94 = new GridBagConstraints();
		gbc_button_94.insets = new Insets(0, 0, 5, 0);
		gbc_button_94.gridx = 4;
		gbc_button_94.gridy = 5;
		panelCarton4.add(button_94, gbc_button_94);
		
		JButton button_95 = new JButton("12");
		GridBagConstraints gbc_button_95 = new GridBagConstraints();
		gbc_button_95.insets = new Insets(0, 0, 0, 5);
		gbc_button_95.gridx = 0;
		gbc_button_95.gridy = 6;
		panelCarton4.add(button_95, gbc_button_95);
		
		JButton button_96 = new JButton("12");
		GridBagConstraints gbc_button_96 = new GridBagConstraints();
		gbc_button_96.insets = new Insets(0, 0, 0, 5);
		gbc_button_96.gridx = 1;
		gbc_button_96.gridy = 6;
		panelCarton4.add(button_96, gbc_button_96);
		
		JButton button_97 = new JButton("12");
		GridBagConstraints gbc_button_97 = new GridBagConstraints();
		gbc_button_97.insets = new Insets(0, 0, 0, 5);
		gbc_button_97.gridx = 2;
		gbc_button_97.gridy = 6;
		panelCarton4.add(button_97, gbc_button_97);
		
		JButton button_98 = new JButton("12");
		GridBagConstraints gbc_button_98 = new GridBagConstraints();
		gbc_button_98.insets = new Insets(0, 0, 0, 5);
		gbc_button_98.gridx = 3;
		gbc_button_98.gridy = 6;
		panelCarton4.add(button_98, gbc_button_98);
		
		JButton button_99 = new JButton("12");
		GridBagConstraints gbc_button_99 = new GridBagConstraints();
		gbc_button_99.gridx = 4;
		gbc_button_99.gridy = 6;
		panelCarton4.add(button_99, gbc_button_99);
		
		JLabel lblNumeroJugado = new JLabel("Numero jugado:");
		lblNumeroJugado.setBounds(224, 39, 125, 15);
		frame.getContentPane().add(lblNumeroJugado);
		
		JLabel lblB_1 = new JLabel("B12");
		lblB_1.setBounds(346, 39, 70, 15);
		frame.getContentPane().add(lblB_1);
		
		JLabel lblFelicidades = new JLabel("Felicidades! Ha ganado la partida!");
		lblFelicidades.setBounds(211, 532, 244, 15);
		frame.getContentPane().add(lblFelicidades);
	}
}
