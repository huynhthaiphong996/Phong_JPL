package JPL_01;

import java.util.Scanner;

public class Bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,nt=1;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=0);
		
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) {
				nt=0;
				break;
			}
		}
		if(nt==0) System.out.println(n+" khong phai so nguyen to");
		else System.out.println(n+" la so nguyen to");
	}

}
