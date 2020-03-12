package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase que recibiendo los datos introducidos por el usuario devuelve la cantidad de palabras,
 * cantidad de caracteres y cuantas veces se repite cada caracter.
 * @author Fernando Martino
 *
 */
public class Contador {
	private String [] palabras;
	private ArrayList<Character> listaCaracteres = new ArrayList<Character>();

	/**
	 * Método que recibe un texto y devuelve cuantas palabras tiene.
	 * @param cadena String Texto introducido.
	 * @return	numeroPalabras int Numero de palabras en el texto.
	 */
	public int contarNumeroPalabras(String cadena) {
		this.palabras = cadena.split(" ");
		
		return this.palabras.length;
	}
	
	/**
	 * Método que recibe un texto y devuelve cuantos caracteres tiene.
	 * @param cadena String Texto introducido.
	 * @return	numeroCaracteres int Numero de caracteres en el texto.
	 */
	public int contarCaracteresTotal(String cadena) {
		int contadorCaracteres = 0;
		
		for(int i = 0; i < palabras.length; i++)
			for(int j = 0; j < palabras[i].length(); j++) 
				contadorCaracteres++;

		return contadorCaracteres;
	}
	
	public Map<Character, Integer> contarTodosCaracteres(String cadena) {
		Map<Character, Integer> listaCaracteresRepetidos = new HashMap<>();
		
		for(int i = 0; i < palabras.length; i++)
			for(int j = 0; j < palabras[i].length(); j++) 
				if(this.listaCaracteres.contains(palabras[i].charAt(j)))
					listaCaracteresRepetidos.put(palabras[i].charAt(j), listaCaracteresRepetidos.get(palabras[i].charAt(j)) + 1);
				else {
					listaCaracteres.add(palabras[i].charAt(j));
					listaCaracteresRepetidos.put(palabras[i].charAt(j), 1);
				}
			
		
		return listaCaracteresRepetidos;
	}
	
	public ArrayList<Character> getListaCaracteres(){
		return listaCaracteres;
	}
}
