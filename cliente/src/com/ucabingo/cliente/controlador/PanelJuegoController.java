package com.ucabingo.cliente.controlador;

import javax.swing.JLabel;

import com.ucabingo.cliente.modelo.Matriz;
import com.ucabingo.cliente.vista.PanelJuego;

public class PanelJuegoController {
	
	private PanelJuego vista;

	public PanelJuegoController(PanelJuego vista, int cantidadCartones) {
		this.vista = vista;
		this.vista.frame.setVisible(true);
		
		mostrarCarton(cantidadCartones);
	}

	private void mostrarCarton(int cantidadCartones) {
		
		//estos arreglos son para las pruebas		
		int[][] arreglo1 = new int[5][5];
		int k=10;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arreglo1[i][j] = k;
				k++;
			}
		}
		
		int[][] arreglo2 = new int[5][5];
		k=10;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arreglo2[i][j] = k;
				k++;
			}
		}
		
		int[][] arreglo3 = new int[5][5];
		k=10;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arreglo3[i][j] = k;
				k++;
			}
		}
		
		int[][] arreglo4 = new int[5][5];
		k=10;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arreglo4[i][j] = k;
				k++;
			}
		}
		
		if (cantidadCartones == 1) {
			Matriz matriz = new Matriz();
	        matriz.LlenarMariz(arreglo1, this.vista.panel1, this.vista);
	        
	        this.vista.lblB2.setVisible(false);
	        this.vista.lblI2.setVisible(false);
	        this.vista.lblN2.setVisible(false);
	        this.vista.lblG2.setVisible(false);
	        this.vista.lblO2.setVisible(false);

	        this.vista.lblB3.setVisible(false);
	        this.vista.lblI3.setVisible(false);
	        this.vista.lblN3.setVisible(false);
	        this.vista.lblG3.setVisible(false);
	        this.vista.lblO3.setVisible(false);

	        this.vista.lblB4.setVisible(false);
	        this.vista.lblI4.setVisible(false);
	        this.vista.lblN4.setVisible(false);
	        this.vista.lblG4.setVisible(false);
	        this.vista.lblO4.setVisible(false);
	        
		}
		else if (cantidadCartones == 2) {
			Matriz matriz = new Matriz();
	        matriz.LlenarMariz(arreglo1, this.vista.panel1, this.vista.panel2, this.vista);
	        
	        this.vista.lblB3.setVisible(false);
	        this.vista.lblI3.setVisible(false);
	        this.vista.lblN3.setVisible(false);
	        this.vista.lblG3.setVisible(false);
	        this.vista.lblO3.setVisible(false);

	        this.vista.lblB4.setVisible(false);
	        this.vista.lblI4.setVisible(false);
	        this.vista.lblN4.setVisible(false);
	        this.vista.lblG4.setVisible(false);
	        this.vista.lblO4.setVisible(false);
	        
		}
		else if (cantidadCartones == 3) {
			Matriz matriz = new Matriz();
	        matriz.LlenarMariz(arreglo1, this.vista.panel1, this.vista.panel2, this.vista.panel3, this.vista);
	        
	        this.vista.lblB4.setVisible(false);
	        this.vista.lblI4.setVisible(false);
	        this.vista.lblN4.setVisible(false);
	        this.vista.lblG4.setVisible(false);
	        this.vista.lblO4.setVisible(false);
	        
		}
		else if (cantidadCartones == 4) {
			Matriz matriz = new Matriz();
	        matriz.LlenarMariz(arreglo1, this.vista.panel1, this.vista.panel2, this.vista.panel3, this.vista.panel4, this.vista);
	        
		}
		
	}

}
