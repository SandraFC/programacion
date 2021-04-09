package frases;

import java.util.Scanner;

public class contrasena {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int intento=0;
	
	String contraseña = "Manolo82", escribe=" ";
	intento=0;
	
	do {
		
		
		System.out.println ("Introduce la contraseña: ");
		escribe = sc.nextLine(); //leemos la cadena

		if(contraseña.equals(escribe)) {
		System.out.println ("Enhorabuena");
		intento=3;
		}
		else if (intento>0 || intento<2){
			
		 System.out.println ("intentelo de nuevo");
		 intento++;
		 
		}
		 else if(intento==3){
				System.out.println ("Usuario bloqueado");
				intento=3;
		 }
		
	} while (intento!=3);
		

}
}
