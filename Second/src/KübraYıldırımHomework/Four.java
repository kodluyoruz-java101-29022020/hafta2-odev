package KübraYýldýrýmHomework;
//Kübra Yýldýýrm

import java.util.Scanner;

public class Four {

	public static void findRepeatArrayElement(int N) {

		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		int[] matrisArray = new int[N];

		for (int i = 0; i < N; i++) {
			matrisArray[i] = scanner.nextInt();
		}

		int i, j;
		int flag = 0;
		boolean turn = true;
		StringBuilder x = null;

		while (turn) {
			for (i = 0; i < N; i++) {
				for (j = i + 1; j < N; j++) {
					if (matrisArray[i] == matrisArray[j]) {
						 x= str.append(matrisArray[j]+" ");
						flag++;
					}
				}
				
			}
			System.out.println(x);
			
			if (flag == 0) {
				System.out.println("Repeating number in series");
			} else {
				break;
			}
		}
		scanner.close();
	}

	public static void main(String[] args) {

		findRepeatArrayElement(6);

	}

}
