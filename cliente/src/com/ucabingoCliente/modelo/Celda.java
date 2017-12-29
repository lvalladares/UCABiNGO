package com.ucabingoCliente.modelo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Celda extends JButton implements ActionListener{
	
	public int valor;
	public boolean estado;

	public Celda(int pos_x, int pos_y, int ancho, int alto) {
		super();
        setBounds(pos_x, pos_y, ancho, alto);
        addActionListener( this );
	}

	public Celda() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionPerformed( ActionEvent e ){
        setBackground(Color.BLUE);
        setForeground(Color.WHITE);
        this.estado = true;
    }
	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		setText(String.valueOf(valor));
		this.valor = valor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
