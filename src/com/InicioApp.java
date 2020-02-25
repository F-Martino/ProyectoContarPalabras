package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InicioApp {
	private String [] palabras;
	private ArrayList<Character> listaCaracteres = new ArrayList<Character>();
	
	public int contarNumeroPalabras(String cadena) {
		this.palabras = cadena.split(" ");
		
		return this.palabras.length;
	}
	
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

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		InicioApp programa = new InicioApp();
		
		System.out.println("INTRODUZCA UNA CADENA DE CARACTERES:");
		String texto = teclado.nextLine();
		
		int numeroPalabras = programa.contarNumeroPalabras(texto);
		int numeroCaracteres = programa.contarCaracteresTotal(texto);
		Map<Character, Integer> listaCaracteresRepetidos = programa.contarTodosCaracteres(texto);
		 	
		System.out.println(programa.textoCaracteresTotal(numeroCaracteres));
		System.out.println(programa.textoNumeroPalabras(numeroPalabras));
		System.out.println(programa.textoTodosCaracteres(listaCaracteresRepetidos));

		teclado.close();
	}

}
