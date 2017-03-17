package JPL_01;

import java.util.Scanner;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=0);
		System.out.println("Cac uoc cua "+n+" la:");
		for(i=1;i<=n;i++)
		{
			if(n%i==0) System.out.print(i+" ");
		}
	}

}
