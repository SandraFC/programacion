package frases;

import java.util.Scanner;

public class reves {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char letra =' ';
		String alreves = " ";
		String frase=" ";
		
		System.out.println ("Introduce una palabra o frase: ");
		frase = sc.nextLine(); //leemos la cadena
	
		
		for (int i =frase.length() - 1; i >= 0; i--) {
				letra = frase.charAt(i); //obtenemos el caracter en la posicion i
				alreves = alreves + letra;
		
		}		
		
		System.out.println("la frase invertida es: ");
		System.out.println(alreves);
	}
}
