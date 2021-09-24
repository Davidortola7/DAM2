package Activitat1;

import java.util.ArrayList;
import java.util.Scanner;

public class Act1_2 {

	public void arrayClase() {

		Scanner sc = new Scanner(System.in);

		String[] aClase = new String[5];

		for (int i = 0; i < aClase.length; i++) {

			aClase[i] = sc.next();

		}

		sc.close();
	}

	public void arraylistClase() {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> alClase = new ArrayList<String>();

		for (int i = 0; i < 6; i++) {

			alClase.add(sc.next());

		}
		sc.close();
	}

}
