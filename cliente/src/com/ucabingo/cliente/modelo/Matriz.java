package com.ucabingo.cliente.modelo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.ucabingo.cliente.vista.PanelJuego;

public class Matriz {
	
	Celda[][] matriz = new Celda[5][5];
	PanelJuego vista;

	public Matriz() {
		// TODO Auto-generated constructor stub
	}
	
	public Celda[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Celda[][] matriz) {
		this.matriz = matriz;
	}
	
	public void marcarBoton(PanelJuego vista) {
		this.vista = vista;
		String string = this.vista.lblNumero.getText();
		String[] parts = string.split("");
		String letraJuego = parts[0]; 
		String numeroJuego = parts[1] + parts[2];
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (letraJuego.equals(matriz[i][j].getLetra())) {
					if (matriz[i][j].getValor() == Integer.parseInt(numeroJuego)) {
						matriz[i][j].pintarCelda();
					}
				}
			}
		}
	}

	public void LlenarMariz(int[][] arreglo, JPanel panel, PanelJuego vista) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel.repaint();
		marcarBoton(vista);
	}
	
	public void LlenarMariz(int[][] arreglo, JPanel panel1, JPanel panel2, PanelJuego vista) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel1.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel1.repaint();
		marcarBoton(vista);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel2.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel2.repaint();
		marcarBoton(vista);
	}
	
	public void LlenarMariz(int[][] arreglo, JPanel panel1, JPanel panel2, JPanel panel3, PanelJuego vista) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel1.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel1.repaint();
		marcarBoton(vista);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel2.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel2.repaint();
		marcarBoton(vista);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel3.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel3.repaint();
		marcarBoton(vista);
	}
	
	public void LlenarMariz(int[][] arreglo, JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, PanelJuego vista) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel1.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel1.repaint();
		marcarBoton(vista);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel2.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel2.repaint();
		marcarBoton(vista);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel3.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel3.repaint();
		marcarBoton(vista);
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
                matriz[i][j] = new Celda( 50 * i, 30 * j, 50, 30);
                matriz[i][j].setValor(arreglo[i][j]);
                if (i == 0) {
                	matriz[i][j].setLetra("B");
                }
                if (i == 1) {
                	matriz[i][j].setLetra("I");
                }
                if (i == 2) {
                	matriz[i][j].setLetra("N");
                }
                if (i == 3) {
                	matriz[i][j].setLetra("G");
                }
                if (i == 4) {
                	matriz[i][j].setLetra("O");
                }
                panel4.add(matriz[i][j]);
			}
		}
		//Si no coloco este metodo los botones no se muestran en el panel
		panel4.repaint();
		marcarBoton(vista);
	}

}