package JPL_01;

import java.util.Scanner;

public class Bai24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int a,b,c;
		System.out.println("Nhap a:");
		a = nhap.nextInt();
		System.out.println("Nhap b:");
		b = nhap.nextInt();
		System.out.println("Nhap c:");
		c = nhap.nextInt();
		
		if(a==0)
		{
			if(b!=0) System.out.println("Nghiem cua phuong trinh la:"+(-c/(float)(b)));
			else{
				if(c==0) System.out.println("Phuong trinh co vo so nghiem");
				else System.out.println("Phuong trinh vo nghiem");
			}
		}
		else{
			int delta;
			delta = b*b - 4*a*c;
			if(delta<0) System.out.println("Phuong trinh vo nghiem");
			else if(delta==0) System.out.println("Phuong trinh co nghiem kep x1=x2="+(-b/(float)(2*a)));
			else {
				System.out.println("Phuong trinh co hai nghiem phan biet:");
				System.out.println("x1="+((-b-Math.sqrt(delta))/(float)(2*a)));
				System.out.println("x2="+((-b+Math.sqrt(delta))/(float)(2*a)));
			}
		}
	}

}
