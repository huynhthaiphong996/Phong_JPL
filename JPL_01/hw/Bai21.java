package JPL_01;

import java.util.Scanner;

public class Bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,m,i,ucln=0;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
			System.out.println("Nhap m:");
			m = nhap.nextInt();
		}while(n<0 || m<0);
		if(n==0 || m==0 ) System.out.println("Uoc chung lon nhap cua "+n+" va "+m+" la "+(m+n));
		else{
			int min;
			if(n<m) min =n;else min =m;
			for(i=min;i>0;i--)
			{
				if(n%i==0 && m%i==0) {
					ucln = i;
					break;
				}
			}
			System.out.println("Uoc chung lon nhap cua "+n+" va "+m+" la "+ucln);
		}
		
	}

}
