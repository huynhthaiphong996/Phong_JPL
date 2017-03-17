package JPL_01;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,x;
		double t;
		System.out.println("Nhap n:");
		n = nhap.nextInt();
		System.out.println("Nhap x:");
		x = nhap.nextInt();
		t = Math.pow(x, n);
		System.out.println("T(x,n) = "+t);
	}

}
