package com;

import java.util.ArrayList;
import java.util.Map;

/**
 * Clase que, recibiendo los datos calculados, devuelve los textos que se van a imprimir.
 * @author Fernando Martino
 *
 */
public class Printer {
	private ArrayList<Character> listaCaracteres = new ArrayList<Character>();

	public void setListaCaracteres(ArrayList<Character> listaCaracteres) {
		this.listaCaracteres = listaCaracteres;
	}

	public String textoCaracteresTotal (int total) {
		return "En total (sin contar espacios en blanco) hay " + total + " caracteres.";
	}
	
	public String textoNumeroPalabras (int total) {
		return "En total hay " + total + " palabras.";
	}
	
	public String textoTodosCaracteres (Map<Character, Integer> total) {
		String textoDevuelto = "";
		for(int i = 0; i < this.listaCaracteres.size(); i++) 
			textoDevuelto += ("\nEl caracter " + this.listaCaracteres.get(i) + " se repite " + total.get(this.listaCaracteres.get(i)) + " veces.");
		return textoDevuelto;
	}

}
