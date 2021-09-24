package Activitat1;

public class Act1_7 {

	public String empleados(int aExp) {

		if (aExp < 1) {

			return ("Desarrollador junior L1, salario: 15000€-18000€");

		} else if (aExp >= 1 && aExp <= 2) {

			return ("Desarrollador junior L2, salario: 18000€-22000€");

		} else if (aExp > 2 && aExp < 5) {

			return ("Desarrollador senior L1, salario: 22000€-28000€");

		} else if (aExp >= 5 && aExp <= 8) {

			return ("Desarrollador senior L2, salario: 28000€-36000€");

		} else {

			return ("Analista/Arquitecto. Salario a convertir en base al rol");

		}

	}

}
