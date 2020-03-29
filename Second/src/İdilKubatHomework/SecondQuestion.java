package �dilKubatHomework;

public class SecondQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixTable = {
				  {1,2,3,4,5},
				  {16,17,18,19,6},
				  {15,24,25,20,7},
				  {14,23,22,21,8},
				  {13,12,11,10,9}   	
		};
		
		 spiralPrint(matrixTable.length, matrixTable[0].length, matrixTable); 

	}
	
	static void spiralPrint(int m, int n, int a[][]) 
    { 
        int i, k = 0, l = 0; 
  
        while (k < m && l < n) { 
          
        	
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
            for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
  
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 
    } 

}

//Hocam bu soruda kendi yazdığım kod doğru olsa bile temiz bir kod olmadığı için internetten anladığım konu yazdım :)
