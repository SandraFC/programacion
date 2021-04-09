package frases;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class cambialetras {
	
	public static void main(String[] args)  throws IOException{
		Scanner sc = new Scanner(System.in);
		
		
		
	
		String frase = " ", letra1=" ", letra2=" ";

		System.out.println ("Introduce una frase: ");
		frase = sc.nextLine(); //leemos la cadena
		
		System.out.println ("Introduce una letra de la frase: ");
		letra1 = sc.nextLine(); //leemos la cadena
	 
		System.out.println ("Introduce otra letra cualquiera: ");
		letra2 = sc.nextLine(); //leemos la cadena
		
	
		
		frase = frase.replace(letra1, letra2);
		
		System.out.println(frase);
	
	
	}
}
