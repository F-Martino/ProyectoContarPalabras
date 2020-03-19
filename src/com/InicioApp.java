package com;
import java.util.Map;
import java.util.Scanner;

public class InicioApp {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Contador cont = new Contador();
		Printer impr = new Printer();
		
		System.out.println("INTRODUZCA UNA CADENA DE CARACTERES:");
		String texto = teclado.nextLine();
		
		int numeroPalabras = cont.contarNumeroPalabras(texto);
		int numeroCaracteres = cont.contarCaracteresTotal(texto);
		Map<Character, Integer> listaCaracteresRepetidos = cont.contarTodosCaracteres(texto);
		
		impr.setListaCaracteres(cont.getListaCaracteres());
		 	
		System.out.println(impr.textoCaracteresTotal(numeroCaracteres));
		System.out.println(impr.textoNumeroPalabras(numeroPalabras));
		System.out.println(impr.textoTodosCaracteres(listaCaracteresRepetidos));

		teclado.close();
	}

}
