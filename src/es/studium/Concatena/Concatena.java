package es.studium.Concatena;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		String cadena1, cadena2, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe la primera cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Escribe la segunda cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		resultado = cadena1 + " " + cadena2;
		System.out.println(resultado);
	}
}
