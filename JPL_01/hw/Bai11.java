package JPL_01;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,s=0;
		System.out.println("Nhap n:");
		n = nhap.nextInt();
		for(i=1;i<=n;i++)
		{
			s+=giaithua(i);
		}
		System.out.println("Ket qua: S = "+s);
	}
	
	
	private static int giaithua(int n){
		int i,s=1;
		for(i=1;i<=n;i++)
		{
			s*=i;
		}
		return s;
	}

}
