package Activitat1;

import java.util.Scanner;

public class Act1_6 {

	public void enteros() {

		Scanner sc = new Scanner(System.in);

		int[] aNumeros = new int[5];

		int total = 0;

		System.out.println("Introduce 5 numeros enteros");

		for (int i = 0; i < 5; i++) {

			aNumeros[i] = sc.nextInt();

			total = total + aNumeros[i];

		}

		System.out.println("Los numeros a la inversa:");

		for (int i = 4; i > -1; i--) {

			System.out.println(aNumeros[i]);

		}

		System.out.println("La suma de los numeros es: ");

		System.out.println(total);

		sc.close();

	}

}
