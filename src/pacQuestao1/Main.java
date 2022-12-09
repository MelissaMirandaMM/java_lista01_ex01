package pacQuestao1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int N = 5;
		int neg = 0;
		int vet[] = new int[N];

		System.out.println("Voce precisa inserir " + N + " valores!");
		for (int i = 0; i < N; ++i) {
			System.out.println("Insira o valor " + (i + 1));
			vet[i] = input.nextInt();
		}

		System.out.println("Os valores que vc informou sao: ");
		System.out.print("[");
		for (int i = 0; i < N; ++i) {
			System.out.print(" " + vet[i] + " ");
		}
		System.out.print("]");

		// public static int negativos(int neg = 0, float vet[ ]) {
		for (int i = 0; i < N; i++) {
			if (vet[i] < 0) {
				neg++;
			}
		}
		System.out.println("\nDentre os valores que voce informou, " + neg + " sao negativos.");

	}

}
