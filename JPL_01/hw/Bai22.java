package JPL_01;

import java.util.Scanner;

public class Bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,m,i,bcnn=0;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
			System.out.println("Nhap m:");
			m = nhap.nextInt();
		}while(n<0 || m<0);
		if(n==0 || m==0 ) System.out.println("Khong ton tai BCNN");
		else{
			
			if(n>m) bcnn =n;else bcnn =m;
			while(bcnn%n!=0 || bcnn%m!=0)
			{
				bcnn++;
			}
			System.out.println("Boi chung nho nhat cua "+n+" va "+m+" la "+bcnn);
		}
	}

}
