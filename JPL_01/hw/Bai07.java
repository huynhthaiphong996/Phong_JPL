package JPL_01;

import java.util.Scanner;

public class Bai07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i;
		float s=0;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<1);
		
		for(i=1;i<=n;i++)
		{
			s+=(i/(float)(i+1));
		}
		System.out.println("Ket qua: S = "+s);
	}

}
