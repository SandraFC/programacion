package frases;

import java.util.Scanner;
public class minutos {
	public static void main(String[] args) {
	Scanner entradaEscaner = new Scanner(System.in);
	
	//lo hice de la manera mas sencilla pero no se que hay que realizar con String
 
	String tiempototal=" ";
	String horastotal=" ";
	String horastotal1="0";
	String horastotal2=" ";
	String minutostotal=" ";
	String minutostotal1="0";
	String minutostotal2=" ";
	
	int horas;
	int minutos;
	int minutoshoras;
	int minutosfin;
	
	System.out.println("Escribe una hora en HH:MM - 24 horas -");
	tiempototal= entradaEscaner.nextLine();
	
	horastotal=tiempototal.substring(0,1);

	
	minutostotal=tiempototal.substring(3,4);

	
	horas = Integer.parseInt(horastotal.trim());
	minutos = Integer.parseInt(minutostotal.trim());
	
	
	
	System.out.println();
	System.out.println(horastotal + ":" + minutostotal);
	
	
	minutoshoras=horas+60;
	minutosfin=(24*60)-(minutos+minutoshoras);
	
	System.out.println("Quedan " + minutosfin + " minutos para acabar el dia");
	
	
	
	

}
}