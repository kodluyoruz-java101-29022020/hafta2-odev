package ÝdilKubatHomework;

import java.util.Random;

public class ThirdQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(); //random sýnýfý
		
		int a=5, b=4, c=3, sum=0;
		int matrix1[][] = new int[a][b];
		int matrix2[][] = new int[b][c];
		int result[][] = new int[a][c];

		System.out.println("-----First matris-----");
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<b;k++)
            {
            	int random=r.nextInt(10);
            	matrix1[i][k] = random;
                System.out.print(matrix1[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println("-----Second matris-----");
        for(int i=0;i<b;i++)
        {
            for(int k=0;k<c; k++)
            {
            	int random=r.nextInt(10);
            	matrix2[i][k] = random;
                System.out.print(matrix2[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
		
        for(int i = 0; i < matrix1.length; i++) {        
            for(int j = 0; j < matrix2[0].length; j++) {     
                for(int k = 0; k < matrix1[0].length; k++) { 
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        System.out.println("-----Result matris-----");
        for(int i=0;i<result.length;i++)
        {
            for(int k=0;k<result[0].length; k++)
            {
                System.out.print(result[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }

	}

}
