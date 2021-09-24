package Activitat1;

public class Act1_3 {

	public int sumaPares(int n) {

		int total = 0;

		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0) {

				total = total + i;

			}

		}

		return total;

	}

}
