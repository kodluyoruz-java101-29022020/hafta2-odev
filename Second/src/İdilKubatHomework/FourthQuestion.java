package ÝdilKubatHomework;

import java.util.ArrayList;

public class FourthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,2,5,10,2,9,10};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
				int a=-1, flag=0;
				boolean b=true;
				while(b) {
				    if((a+1)<numbers.length) {
				        a = a+1;
				        flag =numbers[a];
				        for(int i=a+1; i<numbers.length; i++) {
				        	if(flag==numbers[i]) {
				                list.add(flag);
				                break;
				        	}
				        	else {
				        	}
				        }				            
				    }
				    else {
				        break;
				    }
				}
				
				for (int i = 0 ; i < list.size() ; i++)
				{
				int flag2 = 0;

				for (int j = 0 ; j < i ; j++)
				{
				if (list.get(i) == list.get(j))
				{
				flag2 = 1;
				break;
				}
				}

				if (flag2 == 0)
				{
				System.out.println(list.get(i) + " ");
				}
				}

				System.out.println('\n');

				

	}

}
