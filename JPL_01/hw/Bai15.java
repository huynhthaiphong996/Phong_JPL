package JPL_01;

import java.util.Scanner;

public class Bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,s=1;
		System.out.println("Nhap n:");
		n = nhap.nextInt();
		
		for(i=1;i<=n;i++)
		{
			s*=i;
		}
		System.out.println("Ket qua: S = "+s);
	}

}
