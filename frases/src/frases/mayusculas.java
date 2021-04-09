package frases;
import java.io.IOException;
import java.util.Scanner;


public class mayusculas{
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
	
		
		String nombre = " ";
		String apellidos =" ";
		String nombrecompleto = " ";
		String espacio = " ";
		
		
		System.out.println ("Escriba un nombre completo: ");
		nombrecompleto = sc.nextLine(); //leemos la cadena
		
		String palabras[] = nombre.split(" ");
		
		for (int i=0; i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}
		
		
		
		nombre = nombrecompleto.substring(0, nombrecompleto.indexOf(espacio));
		apellidos = nombrecompleto.substring(nombrecompleto.indexOf(espacio)+1,nombrecompleto.length());
		System.out.println ("  ");
		

		System.out.println ("Apellidos y nombre");
		System.out.println (apellidos.toUpperCase() + ", "+ nombre.toUpperCase());
		
		
		
	
		
		
		
	
		
	
	}
}
