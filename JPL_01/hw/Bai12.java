package JPL_01;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,x,i;
		double t,s=0;
		System.out.println("Nhap n:");
		n = nhap.nextInt();
		System.out.println("Nhap x:");
		x = nhap.nextInt();
		for(i=1;i<=n;i++)
		{
			s+=(Math.pow(x, i));
		}
		System.out.println("Ket qua: S = "+s);
	}

}
