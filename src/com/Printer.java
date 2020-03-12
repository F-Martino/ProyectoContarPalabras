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

	/**
	 * M�todo que recibe la lista de caracteres para almacenarlo.
	 * @param listaCaracteres ArrayList Lista de Caracteres.
	 */
	public void setListaCaracteres(ArrayList<Character> listaCaracteres) {
		this.listaCaracteres = listaCaracteres;
	}

	/**
	 * M�todo que recibe el n�mero total de caracteres para escribir los datos en texto.
	 * @param total int N�mero de caracteres.
	 * @return textoCaracteresTotal String Texto final.
	 */
	public String textoCaracteresTotal (int total) {
		return "En total (sin contar espacios en blanco) hay " + total + " caracteres.";
	}
	
	/**
	 * M�todo que recibe el n�mero total de palabras para escribir los datos en texto.
	 * @param total int N�mero de palabras.
	 * @return  textoNumeroPalabras String Texto final.
	 */
	public String textoNumeroPalabras (int total) {
		return "En total hay " + total + " palabras.";
	}
	
	/**
	 * M�todo que recibe la lista de caracteres y cuantas veces se repiten
	 * para escribir los datos en texto.
	 * @param total Map Lista de caracteres y cuantas veces se repiten.
	 * @return textoTodosCaracteres String Texto final.
	 */
	public String textoTodosCaracteres (Map<Character, Integer> total) {
		String textoDevuelto = "";
		for(int i = 0; i < this.listaCaracteres.size(); i++) 
			textoDevuelto += ("\nEl caracter " + this.listaCaracteres.get(i) + " se repite " + total.get(this.listaCaracteres.get(i)) + " veces.");
		return textoDevuelto;
	}

}
