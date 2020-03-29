package KübraYýldýrýmHomework;
//Kübra Yýldýrým

import java.util.Random;

public class Three {

	public static void randomMatrixMultiplication(int N, int M, int T) {

		Random random = new Random();

		int matris[][] = new int[N][M];
		int matris1[][] = new int[M][T];
		int resultMatris[][] = new int[N][T];

		for (int a = 0; a < N; a++) {
			for (int b = 0; b < M; b++) {
				matris[a][b] = random.nextInt(10);
				System.out.print(matris[a][b] + "\t");
			}
			System.out.print("\n");
		}

		System.out.println("\n\n");

		for (int a = 0; a < M; a++) {
			for (int b = 0; b < T; b++) {
				matris1[a][b] = random.nextInt(10);
				System.out.print(matris1[a][b] + "\t");
			}
			System.out.print("\n");
		}

		System.out.println("\n\n");

		for (int i = 0; i < N; i++) {
			for (int k = 0; k < T; k++) {
				for (int j = 0; j < M; j++) {
					resultMatris[i][k] += matris[i][j] * matris1[j][k];

				}
				System.out.print(resultMatris[i][k] + "\t");

			}
			System.out.print("\n");

		}

	}

	public static void main(String[] args) {

		randomMatrixMultiplication(2, 3, 2);

	}

}
