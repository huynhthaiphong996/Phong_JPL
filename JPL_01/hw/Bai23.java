package JPL_01;

import java.util.Scanner;

public class Bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap a:");
		a = nhap.nextInt();
		System.out.println("Nhap b:");
		b = nhap.nextInt();
		
		if(a==0) {
			if(b==0) System.out.println("Phuong trinh co vo so nghiem");
			else System.out.println("Phuong trinh vo nghiem");
		}
		else System.out.println("Nghiem cua phuong trinh la:"+(-b/(float)(a))); 
	}

}
