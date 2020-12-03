package dbEmbebidaSqlite;

public class Utiles {

	public static int darMinutos(String mili) {

		double a = 0;
		try {

			a = Integer.parseInt(mili);

			a = a / 1000;

			if (a > 60) {

				a = a / 60;

			}

		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
		return (int) a;

	}

	public static int darSegundos(String mili) {

		double a = 0;
		try {

			a = Integer.parseInt(mili);

			a = a / 1000;

			if (a > 60) {

				a = a % 60;

			}

		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}
		return (int) a;

	}

}
