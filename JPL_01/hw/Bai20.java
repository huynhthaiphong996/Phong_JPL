package JPL_01;

import java.util.Scanner;

public class Bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,cp=1;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=0);
		if(Math.sqrt(n)==(int)Math.sqrt(n)) System.out.println(n+" la so chinh phuong");
		else System.out.println(n+" khong phai so chinh phuong");
	}

}
