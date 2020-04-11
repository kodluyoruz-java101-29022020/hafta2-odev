package KübraYýldýrýmHomework;
//Kübra Yýldýrým

/*Hocam bu kodun da mantýðýna internetten baktým sonra kendim yapmaya çalýþtým
  ama daha farklý þekil de yapamadým o yüzden internet dekine çok benzerini yolluyorum.  
 */

public class Two {

	public static void main(String[] args) {

		int[][] spiralMatris = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };

		int startRowIndex = 0;
		int endRowIndex = 5;
		int startColumnIndex = 0;
		int endColumnIndex = 5;

		while (startRowIndex < endRowIndex && startColumnIndex < endColumnIndex) {

			for (int i = 0; i < endColumnIndex; ++i) {
				System.out.print(spiralMatris[startRowIndex][i] + "\t");
			}
			startRowIndex++;

			for (int i = startRowIndex; i < endColumnIndex; ++i) {
				System.out.print(spiralMatris[i][endColumnIndex - 1] + "\t");
			}
			endColumnIndex--;

			if (startRowIndex < endRowIndex) {
				for (int i = endColumnIndex - 1; i >= startColumnIndex; --i) {
					System.out.print(spiralMatris[endRowIndex - 1][i] + "\t");
				}
				endRowIndex--;
			}

			if (startColumnIndex < endColumnIndex) {
				for (int i = endRowIndex - 1; i >= startRowIndex; --i) {
					System.out.print(spiralMatris[i][startColumnIndex] + "\t");
				}
				startColumnIndex++;
			}

		}

	}

}
