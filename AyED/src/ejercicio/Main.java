package ejercicio;

import java.util.Scanner;

import tp02.ejercicio1.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingres un numero : ");
		
		int dato = sc.nextInt();
		while(dato != 0) {
			l.agregarFinal(dato);
			System.out.println("ingrese un numero :");
			dato=sc.nextInt();
		}
		l.comenzar();
		while(!l.fin())	{
			dato=l.proximo();
			System.out.println("Dato : "+dato);
		}

	}	
}
