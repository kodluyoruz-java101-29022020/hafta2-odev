package KübraYýldýrýmHomework;
//Kübra Yýldýrým

import java.util.Random;

/* for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, M); x++) {
for (int y = Math.max(0, j - 1); y <= Math.min(j + 1, N); y++) {
	if (x >= 0 && y >= 0 && x < M && y < N) {
		if ((x != i || y != j)
		
Hocam bu kýsmý internetten aldým*/

public class One {

	public static void printFinalStateMatrix(int M, int N) {
		Random random = new Random();
		int[][] randomMatris = new int[M][N];

		for (int k = 0; k < M; k++) {
			for (int l = 0; l < N; l++) {
				randomMatris[k][l] = random.nextInt(2);
				System.out.print(randomMatris[k][l] + "\t");
			}
			System.out.print("\n");
		}

		int flag = 0;
		int flag1 = 0;

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (randomMatris[i][j] == 1) {

					for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, M); x++) {
						for (int y = Math.max(0, j - 1); y <= Math.min(j + 1, N); y++) {
							if (x >= 0 && y >= 0 && x < M && y < N) {
								if ((x != i || y != j) && randomMatris[x][y] == 1) {

									if (randomMatris[x][y] == 1) {
										flag++;
									}

								}
							}
						}
					}

					// System.out.print(flag + " ");

					if (flag < 2) {
						randomMatris[i][j] = 0;
					} else if (flag == 2 && flag == 3) {
						randomMatris[i][j] = 1;
					} else if (flag > 3) {
						randomMatris[i][j] = 0;
					}
					flag = 0;

				} else if (randomMatris[i][j] == 0) {

					for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, M); x++) {
						for (int y = Math.max(0, j - 1); y <= Math.min(j + 1, N); y++) {
							if (x >= 0 && y >= 0 && x < M && y < N) {
								if ((x != i || y != j) && randomMatris[x][y] == 1) {

									if (randomMatris[x][y] == 1) {
										flag1++;
									}

								}
							}
						}
					}

					if (flag1 == 3) {
						randomMatris[i][j] = 1;
					} else {
						randomMatris[i][j] = 0;
					}
					flag1 = 0;

				}

			}
		}

		System.out.println("\n\n");

		for (int k = 0; k < M; k++) {
			for (int l = 0; l < N; l++) {
				System.out.print(randomMatris[k][l] + "\t");
			}
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		printFinalStateMatrix(2, 3);

	}

}



