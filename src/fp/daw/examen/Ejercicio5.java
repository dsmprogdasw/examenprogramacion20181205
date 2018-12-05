package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método 'main' un programa que obtenga el desglose en billetes
	 * y monedas de una cantidad exacta de euros que el usuario introducirá por teclado.
	 * Hay billetes de 500, 200, 100, 50, 20, 10 y 5 euros y monedas de 1 y 2 euros.
	 * Por ejemplo, si deseamos conocer el desglose de 434 euros, el programa mostrará
	 * por pantalla el siguiente resultado:
	 * 
	 * 		2 billetes de 200 euros.
	 * 		1 billete de 20 euros.
	 * 		1 billete de 10 euros.
	 * 		2 monedas de 2 euros.
	 * 
	 * Una vez ejecutado el programa, el usuario podrá realizar tantos desgloses como
	 * desee hasta que decida finalizar su ejecución. 
	 * El programa comprobará que la cantidad introducida sea una cantidad positiva
	 * mayor que 0. En caso contrario mostrará un mensaje de error y volverá a pedirla.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean error = true;
		do {
		
		System.out.println("Insertar la cantidad a desglosar");
		int cantidad = in.nextInt();
		
		if(cantidad < 0) { 
			error = false;
			System.out.println("El número introducido es erróneo, vuelve a intentarlo");
		}
		
			
		int quinientos = 0;
		int doscientos = 0;
		int cien = 0;
		int cincuenta = 0;
		int veinte = 0;
		int diez = 0;
		int cinco = 0;
		int dos = 0;
		int uno = 0;
		
		do {
			while(cantidad>=500 && cantidad - 500 >=0) {
				cantidad = cantidad - 500;
				quinientos = quinientos + 1;
			}
			while(cantidad>=200 && cantidad - 200 >=0) {
				cantidad = cantidad - 200;
				doscientos = doscientos + 1;
			}
			while(cantidad>=100 && cantidad - 100 >=0) {
				cantidad = cantidad - 100;
				cien = cien + 1;
			}
			while(cantidad>=50 && cantidad - 50 >=0) {
				cantidad = cantidad - 50;
				cincuenta = cincuenta + 1;
			}
			while(cantidad>=20 && cantidad - 20 >=0) {
				cantidad = cantidad - 20;
				veinte = veinte + 1;
			}
			while(cantidad>=10 && cantidad - 10 >=0) {
				cantidad = cantidad - 10;
				diez = diez + 1;
			}
			while(cantidad>=5 && cantidad - 5 >=0) {
				cantidad = cantidad - 5;
				cinco = cinco + 1;
			}
			while(cantidad>=2 && cantidad - 2 >=0) {
				cantidad = cantidad - 2;
				dos = dos + 1;
			}
			while(cantidad>=1 && cantidad - 1 >=0) {
				cantidad = cantidad - 1;
				uno = uno + 1;
			}
			
		} while(cantidad > 0);
		
		System.out.println("La cantidad de billetes de 500 es " + quinientos);
		System.out.println("La cantidad de billetes de 200 es " + doscientos);
		System.out.println("La cantidad de billetes de 100 es " + cien);
		System.out.println("La cantidad de billetes de 50 es " + cincuenta);
		System.out.println("La cantidad de billetes de 20 es " + veinte);
		System.out.println("La cantidad de billetes de 10 es " + diez);
		System.out.println("La cantidad de billetes de 5 es " + cinco);
		System.out.println("La cantidad de monedas de 2 es " + dos);
		System.out.println("La cantidad de monedas de 1 es " + uno);
		
	} while(error = false );
  }
}
