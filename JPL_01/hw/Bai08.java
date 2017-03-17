package JPL_01;

import java.util.Scanner;

public class Bai08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i;
		float s=0;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=5);
		
		for(i=0;i<=n;i++)
		{
			s+=((2*i+1)/(float)(2*i+2));
		}
		System.out.println("Ket qua: S = "+s);
	}

}
