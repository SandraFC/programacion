package frases;

import java.util.Scanner;

public class cantidadvocales {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidadvocales =0;
		char letra =' ';
		String frase = " ";
		
		System.out.println ("Introduce una palabra o frase: ");
		frase = sc.nextLine(); //leemos la cadena
		frase=frase.toLowerCase(); //pasar todas a minusculas
		
		//iteramos mientras el índice sea menor al tamaño total de la cadena
		for (int i = 0; i <  frase.length(); i++) {
		
			letra =frase.charAt(i); //obtenemos el caracter de la posicion i
			
			//si el caracter es igual a "a" "e" "i" "o" "u" entonces es vocal
			
			if (letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra =='u') {
				cantidadvocales++; //contamos cantidad vocales +1
			}
		}
		//mostramos por pantalla cantidad de vocales
		System.out.println("La cantidad de vocales es: " + cantidadvocales);
	}

}
