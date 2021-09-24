package Activitat1;

public class Act1_8 {

	public void intervalo(int e1, int e2) {



		for (int i = e1; i <= e2; i++) {

			int contadorPrimo = 0;
			
			System.out.println(i);
			
			for (int j = i; j > 0; j--) {

				if (i % j == 0) {

					contadorPrimo = contadorPrimo + 1;

				}

			}

			if (contadorPrimo == 2) {

				System.out.println("Es primo");

			} else {

				System.out.println("No es primo");

			}

		}

	}

}
