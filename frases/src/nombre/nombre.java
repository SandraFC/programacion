package nombre;
import java.io.IOException;
import java.util.Scanner;


public class nombre{
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
	
		
		String frase = " ";
		char car =' ';
		
		System.out.println ("Escriba un nombre completo: ");
		frase = sc.nextLine(); //leemos la cadena
		
		String palabras[] = frase.split(" ");
		
		for (int i=0; i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}


		for (int a=0; a<frase.length();a++) {
			String cadena = frase;
			String subcadena1 = cadena.substring (0, a);
			String subcadena2 = cadena.substring (a, 0);
			System.out.println(subcadena2 + subcadena1);
			
		}
		
	
	}
}
