package test;
import com.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class InicioAppTest {
	
	Contador c1 = new Contador();
	Contador c2 = new Contador();
	Contador c3 = new Contador();
	Contador c4 = new Contador();
	
	Printer p1 = new Printer();
	Printer p2 = new Printer();
	Printer p3 = new Printer();
	Printer p4 = new Printer();
	
	InicioApp ejemplo1 = new InicioApp();
	InicioApp ejemplo2 = new InicioApp();
	InicioApp ejemplo3 = new InicioApp();
	InicioApp ejemplo4 = new InicioApp();
	
	String texto1 = "Me gustan los macarrones";
	String texto2 = "Tarta de rata";
	String texto3 = "El archiduque de noruega juega al golf los domingos por la mañana";
	String texto4 = "AaAa Bbbb CCCCC ññññ";
	
	int numPalabras1 = c1.contarNumeroPalabras(texto1);
	int numPalabras2 = c2.contarNumeroPalabras(texto2);
	int numPalabras3 = c3.contarNumeroPalabras(texto3);
	int numPalabras4 = c4.contarNumeroPalabras(texto4);
	
	int numCaracteres1 = c1.contarCaracteresTotal(texto1);
	int numCaracteres2 = c2.contarCaracteresTotal(texto2);
	int numCaracteres3 = c3.contarCaracteresTotal(texto3);
	int numCaracteres4 = c4.contarCaracteresTotal(texto4);
	
	Map<Character, Integer> listaCaracteres1 = c1.contarTodosCaracteres(texto1);
	Map<Character, Integer> listaCaracteres2 = c2.contarTodosCaracteres(texto2);
	Map<Character, Integer> listaCaracteres3 = c3.contarTodosCaracteres(texto3);
	Map<Character, Integer> listaCaracteres4 = c4.contarTodosCaracteres(texto4);
	
	
	String textoPalabra1 = p1.textoNumeroPalabras(numPalabras1);
	String textoPalabra2 = p2.textoNumeroPalabras(numPalabras2);
	String textoPalabra3 = p3.textoNumeroPalabras(numPalabras3);
	String textoPalabra4 = p4.textoNumeroPalabras(numPalabras4);
	
	String textoCaracteres1 = p1.textoCaracteresTotal(numCaracteres1);
	String textoCaracteres2 = p2.textoCaracteresTotal(numCaracteres2);
	String textoCaracteres3 = p3.textoCaracteresTotal(numCaracteres3);
	String textoCaracteres4 = p4.textoCaracteresTotal(numCaracteres4);
	
	
	

	@Nested
	/**
	 * Tests del método contarNumeroPalabras(String cadena)
	 * @author Fernando Martino
	 *
	 */
	class TestContarPalabras{

		@Test
		void testContarPalabras1() {
			Assertions.assertEquals(4, numPalabras1);
		}

		@Test
		void testContarPalabras2() {
			Assertions.assertEquals(3, numPalabras2);
		}

		@Test
		void testContarPalabras3() {
			Assertions.assertEquals(12, numPalabras3);
		}

		@Test
		void testContarPalabras4() {
			Assertions.assertEquals(4, numPalabras4);
		}
	}

	@Nested
	/**
	 * Tests del método contarCaracteresTotal(String cadena)
	 * @author Fernando Martino
	 *
	 */
	class TestContarCaracteres{

		@Test
		void testContarCaracteres1() {
			Assertions.assertEquals(21, numCaracteres1);
		}

		@Test
		void testContarCaracteres2() {
			Assertions.assertEquals(11, numCaracteres2);
		}

		@Test
		void testContarCaracteres3() {
			Assertions.assertEquals(54, numCaracteres3);
		}

		@Test
		void testContarCaracteres4() {
			Assertions.assertEquals(17, numCaracteres4);
		}
	}

	@Nested
	/**
	 * Tests del método contarTodosCaracteres(String cadena)
	 * @author Fernando Martino
	 *
	 */
	class TestContarTodosCaracteres{

		@Test
		void testContarTodosCaracteres1() {
			Assertions.assertEquals(1, listaCaracteres1.get('M'));
			Assertions.assertEquals(2, listaCaracteres1.get('e'));
		}

		@Test
		void testContarTodosCaracteres2() {
			Assertions.assertEquals(1, listaCaracteres2.get('T'));
			Assertions.assertEquals(4, listaCaracteres2.get('a'));
			Assertions.assertEquals(2, listaCaracteres2.get('r'));
			Assertions.assertEquals(2, listaCaracteres2.get('t'));
			Assertions.assertEquals(1, listaCaracteres2.get('d'));
			Assertions.assertEquals(1, listaCaracteres2.get('e'));
			Assertions.assertEquals(null, listaCaracteres2.get(' '));
		}

		@Test
		void testContarTodosCaracteres3() {
			Assertions.assertEquals(1, listaCaracteres3.get('E'));
			Assertions.assertEquals(5, listaCaracteres3.get('l'));
			Assertions.assertEquals(8, listaCaracteres3.get('a'));
			Assertions.assertEquals(3, listaCaracteres3.get('r'));
			Assertions.assertEquals(1, listaCaracteres3.get('c'));
			Assertions.assertEquals(1, listaCaracteres3.get('h'));
			Assertions.assertEquals(2, listaCaracteres3.get('i'));
			Assertions.assertEquals(3, listaCaracteres3.get('d'));
			Assertions.assertEquals(4, listaCaracteres3.get('u'));
			Assertions.assertEquals(1, listaCaracteres3.get('q'));
			Assertions.assertEquals(3, listaCaracteres3.get('n'));
			Assertions.assertEquals(6, listaCaracteres3.get('o'));
			Assertions.assertEquals(4, listaCaracteres3.get('g'));
			Assertions.assertEquals(1, listaCaracteres3.get('j'));
			Assertions.assertEquals(1, listaCaracteres3.get('f'));
			Assertions.assertEquals(2, listaCaracteres3.get('s'));
			Assertions.assertEquals(2, listaCaracteres3.get('m'));
			Assertions.assertEquals(1, listaCaracteres3.get('p'));
			Assertions.assertEquals(1, listaCaracteres3.get('ñ'));
		}

		@Test
		void testContarTodosCaracteres4() {
			Assertions.assertEquals(2, listaCaracteres4.get('A'));
			Assertions.assertEquals(2, listaCaracteres4.get('a'));
			Assertions.assertEquals(1, listaCaracteres4.get('B'));
			Assertions.assertEquals(3, listaCaracteres4.get('b'));
			Assertions.assertEquals(5, listaCaracteres4.get('C'));
			Assertions.assertEquals(4, listaCaracteres4.get('ñ'));
		}
	}

	@Nested
	/**
	 * Tests del método textoNumeroPalabras (int total)
	 * @author Fernando Martino
	 *
	 */
	class TestTextoNumeroPalabras{
		
		@Test
		void testTextoNumeroPalabras1() {
			Assertions.assertEquals("En total hay 4 palabras.", textoPalabra1);
		}

		@Test
		void testTextoNumeroPalabras2() {
			Assertions.assertEquals("En total hay 3 palabras.", textoPalabra2);
		}

		@Test
		void testTextoNumeroPalabrass3() {
			Assertions.assertEquals("En total hay 12 palabras.", textoPalabra3);
		}

		@Test
		void testTextoNumeroPalabras4() {
			Assertions.assertEquals("En total hay 4 palabras.", textoPalabra4);
		}
	}

	@Nested
	/**
	 * Tests del método textoNumeroPalabras (int total)
	 * @author Fernando Martino
	 *
	 */
	class TestTextoCaracteresTotal{
		
		@Test
		void testTextoNumeroPalabras1() {
			Assertions.assertEquals("En total (sin contar espacios en blanco) hay 21 caracteres.", textoCaracteres1);
		}

		@Test
		void testTextoNumeroPalabras2() {
			Assertions.assertEquals("En total (sin contar espacios en blanco) hay 11 caracteres.", textoCaracteres2);
		}

		@Test
		void testTextoNumeroPalabrass3() {
			Assertions.assertEquals("En total (sin contar espacios en blanco) hay 54 caracteres.", textoCaracteres3);
		}

		@Test
		void testTextoNumeroPalabras4() {
			Assertions.assertEquals("En total (sin contar espacios en blanco) hay 17 caracteres.", textoCaracteres4);
		}
	}

	@Nested
	/**
	 * Tests del método textoTodosCaracteres (Map<Character, Integer> total)
	 * @author Fernando Martino
	 *
	 */
	class TestTextoTodosCaracteres{
		
		
		@Test
		void testTextoNumeroPalabras1() {
			p1.setListaCaracteres(c1.getListaCaracteres());
			String textoListaCaracteres1 = p1.textoTodosCaracteres(listaCaracteres1);
			String texto = "\nEl caracter M se repite 1 veces." + 
					"\nEl caracter e se repite 2 veces." +
					"\nEl caracter g se repite 1 veces." +
					"\nEl caracter u se repite 1 veces." +
					"\nEl caracter s se repite 3 veces." +
					"\nEl caracter t se repite 1 veces." +
					"\nEl caracter a se repite 3 veces." +
					"\nEl caracter n se repite 2 veces." +
					"\nEl caracter l se repite 1 veces." +
					"\nEl caracter o se repite 2 veces." +
					"\nEl caracter m se repite 1 veces." +
					"\nEl caracter c se repite 1 veces." +
					"\nEl caracter r se repite 2 veces.";
			Assertions.assertEquals(texto, textoListaCaracteres1);
		}
		
		@Test
		void testTextoNumeroPalabras2() {
			p2.setListaCaracteres(c2.getListaCaracteres());
			String textoListaCaracteres2 = p2.textoTodosCaracteres(listaCaracteres2);
			String texto = "\nEl caracter T se repite 1 veces." + 
					"\nEl caracter a se repite 4 veces." +
					"\nEl caracter r se repite 2 veces." +
					"\nEl caracter t se repite 2 veces." +
					"\nEl caracter d se repite 1 veces." +
					"\nEl caracter e se repite 1 veces.";
			Assertions.assertEquals(texto, textoListaCaracteres2);
		}
		
		@Test
		void testTextoNumeroPalabras3() {
			p3.setListaCaracteres(c3.getListaCaracteres());
			String textoListaCaracteres3 = p3.textoTodosCaracteres(listaCaracteres3);
			String texto = "\nEl caracter E se repite 1 veces." + 
					"\nEl caracter l se repite 5 veces." +
					"\nEl caracter a se repite 8 veces." +
					"\nEl caracter r se repite 3 veces." +
					"\nEl caracter c se repite 1 veces." +
					"\nEl caracter h se repite 1 veces." +
					"\nEl caracter i se repite 2 veces." +
					"\nEl caracter d se repite 3 veces." +
					"\nEl caracter u se repite 4 veces." +
					"\nEl caracter q se repite 1 veces." +
					"\nEl caracter e se repite 4 veces." +
					"\nEl caracter n se repite 3 veces." +
					"\nEl caracter o se repite 6 veces." +
					"\nEl caracter g se repite 4 veces." +
					"\nEl caracter j se repite 1 veces." +
					"\nEl caracter f se repite 1 veces." +
					"\nEl caracter s se repite 2 veces." +
					"\nEl caracter m se repite 2 veces." +
					"\nEl caracter p se repite 1 veces." +
					"\nEl caracter ñ se repite 1 veces.";
			Assertions.assertEquals(texto, textoListaCaracteres3);
		}
		
		@Test
		void testTextoNumeroPalabras4() {
			p4.setListaCaracteres(c4.getListaCaracteres());
			String textoListaCaracteres4 = p4.textoTodosCaracteres(listaCaracteres4);
			String texto = "\nEl caracter A se repite 2 veces." + 
					"\nEl caracter a se repite 2 veces." +
					"\nEl caracter B se repite 1 veces." +
					"\nEl caracter b se repite 3 veces." +
					"\nEl caracter C se repite 5 veces." +
					"\nEl caracter ñ se repite 4 veces.";
			Assertions.assertEquals(texto, textoListaCaracteres4);
		}
	}
}
