package JPL_01;

import java.util.Scanner;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,tong=0,tich=1;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=0);
		System.out.println("Tong va tich tat ca cac uoc cua "+n+" la:");
		for(i=1;i<=n;i++)
		{
			if(n%i==0) {
				tong +=i;
				tich*=i;
			}
		}
		System.out.println("Tong = "+tong+"\nTich = "+tich);
	}

}
