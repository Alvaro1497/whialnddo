package curso;

import java.util.Scanner;

public class dowhilexd {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = 0;
		float S = 0;
		int Si = 0;
		int Ci = 0;
		int Pi = 0;

		do {
			System.out.print("Ingrese un numero:");
			N = teclado.nextInt();
			if (N % 2 == 0) {
				S = S + N;
				Pi = Si / Ci;
			} else {
				Si = Si + N;
				Ci = Ci + 1;
			}
		} while (N != -1);

		System.out.println("LA SUMA DE LOS PARES ES " + S);
		System.out.println("EL PROMEDIO DE LOS IMPARES " + Pi);
	}

}
