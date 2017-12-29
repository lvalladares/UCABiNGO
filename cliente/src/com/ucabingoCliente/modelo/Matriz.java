package com.ucabingoCliente.modelo;

import javax.swing.JPanel;

public class Matriz {
	
	Celda[][] matriz = new Celda[5][5];

	public Matriz() {
		// TODO Auto-generated constructor stub
	}
	
	public Celda[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Celda[][] matriz) {
		this.matriz = matriz;
	}

	public void LlenarMariz(int[][] arreglo, JPanel panel) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel.repaint();
	}
	
	public void LlenarMariz(int[][] arreglo, JPanel panel1, JPanel panel2) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel1.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel1.repaint();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel2.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel2.repaint();
	}
	
	public void LlenarMariz(int[][] arreglo, JPanel panel1, JPanel panel2, JPanel panel3) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel1.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel1.repaint();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel2.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel2.repaint();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel3.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel3.repaint();
	}
	
	public void LlenarMariz(int[][] arreglo, JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel1.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel1.repaint();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel2.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel2.repaint();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel3.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel3.repaint();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                panel4.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel4.repaint();
	}

}