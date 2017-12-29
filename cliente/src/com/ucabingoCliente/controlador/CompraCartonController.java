package com.ucabingoCliente.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.ucabingoCliente.vista.CompraCarton;
import com.ucabingoCliente.vista.Menu;
import com.google.gson.*;

public class CompraCartonController implements ActionListener, ChangeListener{

	private CompraCarton vista;
	
	public CompraCartonController(CompraCarton vista) {
		this.vista = vista;
		this.vista.frame.setVisible(true);
		
		//Asignacion de precios
		this.vista.labelPrecio.setText("500");
		this.vista.labelSaldo.setText("1500");
		
		//Asignacion del precio total de compra
		this.vista.labelTotal.setText(String.valueOf(
				(Integer.parseInt(this.vista.labelPrecio.getText()) * 
				Integer.parseInt((String) this.vista.spinner.getValue())
				)
		));
	
		this.vista.spinner.addChangeListener(this);
		this.vista.btnRegresar.addActionListener(this);
		this.vista.btnComprar.addActionListener(this);
	}
	
	//Accion que actualiza el precio total segun cantidad de cartones a comprar
	@Override
	public void stateChanged(ChangeEvent arg0) {
		this.vista.labelTotal.setText(String.valueOf(
				(Integer.parseInt(this.vista.labelPrecio.getText()) * 
				Integer.parseInt((String) this.vista.spinner.getValue())
				)
		));
		
		if (Integer.parseInt(this.vista.labelTotal.getText()) > Integer.parseInt(this.vista.labelSaldo.getText())) {
			this.vista.btnComprar.setEnabled(false);
			this.vista.labelMsjError.setText("Error. Saldo insuficiente.");
		}
		else {
			this.vista.btnComprar.setEnabled(true);
			this.vista.labelMsjError.setText("");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Accion de boton regresar
		if (this.vista.btnRegresar == e.getSource()) {
			Menu window = new Menu();
			MenuController controladorWindow = new MenuController(window);
			this.vista.frame.dispose();
		}
				
		//Accion de boton comprar
		if (this.vista.btnComprar == e.getSource()) {
			String datos = "{'saldo':" + this.vista.labelSaldo.getText() + "',"
						  + "'precioUnidad':"+ this.vista.labelPrecio.getText() + "',"
						  + "'cantidad':"+ this.vista.spinner.getValue() + "',"
						  + "'total':" + this.vista.labelTotal.getText() + "'}";
			
			final Gson gson = new Gson();
		    final Properties json = gson.fromJson(datos, Properties.class);
		    System.out.println(json);
		}
		if (this.vista.btnRegresar == e.getSource()) {
			Menu ventanaNueva = new Menu();
			MenuController controlador = new MenuController(ventanaNueva);
			this.vista.frame.dispose();
		}
	}

}
