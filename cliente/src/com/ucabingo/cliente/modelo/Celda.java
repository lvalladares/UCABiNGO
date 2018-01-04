package com.ucabingo.cliente.modelo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.ucabingo.cliente.vista.PanelJuego;

public class Celda extends JButton implements ActionListener{
	
	public int valor;
	public boolean estado;
	public String letra;

	public PanelJuego vista = new PanelJuego();

	public Celda(int pos_x, int pos_y, int ancho, int alto) {
		super();
        setBounds(pos_x, pos_y, ancho, alto);
        valor = 0;
        estado = false;
        addActionListener( this );
	}

	public Celda() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed( ActionEvent e ){
		if (validaSeleccion() == true) {
			setBackground(Color.BLUE);
	        setForeground(Color.WHITE);
	        this.setEstado(true);
		}
    }
	
	public boolean validaSeleccion() {
		String seleccion = letra + valor;
		
		if (seleccion.equalsIgnoreCase(this.vista.lblNumero.getText())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		setText(String.valueOf(valor));
		this.valor = valor;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

}
