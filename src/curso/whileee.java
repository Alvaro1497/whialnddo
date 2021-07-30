package curso;

import java.util.Scanner;

public class whileee {

	public static void main(String[] args) {
		int N;
		float S = 0;
		float P = 0;
		int C = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("INGRESE NUMERO: ");
		N = sc.nextInt();
		S = S + N;
		while (N != 0) {
			System.out.print("INGRESE NUMERO: ");
			N = sc.nextInt();
			S = S + N;
			C = C + 1;
		}
		if (N == 0) {
			P = S / 2;
		}
		System.out.println("SUMA: " + S);
		System.out.println("PROMEDIO: " + P);
		System.out.println("CANTIDAD: " + C);
	}

}
