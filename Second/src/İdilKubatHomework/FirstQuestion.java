package ÝdilKubatHomework;

import java.util.ArrayList;

public class FirstQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrice = {
				  {1,1,1,1,0},
				  {1,1,0,1,0},
				  {0,0,1,0,1},
				  {1,0,0,1,1},
				  {1,1,1,0,0}   	
		};
		
		int[][] resultMatrice =new int[matrice.length][matrice[0].length];
			
		for(int i=0; i<matrice.length; i++) {
			for(int j=0; j<matrice[0].length; j++) {
				int positive=0, negative=0, a=0;
				
				if((i+1)<matrice.length) {
					if(matrice[i+1][j]==1) {
						positive= positive+1;
					}
					
					else if(matrice[i+1][j]==0) {
						negative= negative+1;
					}
				}
				
				if((j+1)<matrice[0].length) {
					if(matrice[i][j+1]==1) {
						positive= positive+1;
					}
					
					else if(matrice[i][j+1]==0) {
						negative= negative+1;
					}
				}
				
				
				if((i-1)>=0) {
					 if(matrice[i-1][j]==1) {
			                positive= positive+1;
			                }
					 else if(matrice[i-1][j]==0) {
			                negative= negative+1;
					 }
				}
				
				if((j-1)>=0) {
					if(matrice[i][j-1]==1) {
		                positive= positive+1;
					}
					else if (matrice[i][j-1]==0) {
		                negative= negative+1;
					}
				
				}

				int result= Operation(matrice[i][j],positive,negative);
				resultMatrice[i][j] = result;
				
				
			}
		} //end of for
		
		System.out.println("----First Matrice-----");
        for(int i=0;i<matrice.length;i++)
        {
            for(int k=0;k<matrice[0].length;k++)
            {
                System.out.print(matrice[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println("----Result Matrice-----");
        for(int i=0;i<resultMatrice.length;i++)
        {
            for(int k=0;k<resultMatrice[0].length;k++)
            {
                System.out.print(resultMatrice[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        
        

	}
	
	public static int Operation(int a, int positive, int negative) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		 if(a==1) {
			 if(positive<2) {
		            a=0;
			 }
			 else if(positive==2 || positive==3) {
		            a=1;
			 }
			 else if(positive>3) {
		            a=0;
			 }
		 }
		        
		 else if(a==0) {
		        if(positive==3) {
		            a=1;
		        }
		 }
		 
		 return a;
	}

}
