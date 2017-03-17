package JPL_01;

import java.util.Scanner;

public class Bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,le=0,chan=0,chung=0;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=0);
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0) {
				chung++;
				if(i%2==0) chan++;
				else le++;
			}
		}
		System.out.println("So luong cac uoc cua "+n+" la:"+chung);
		System.out.println("So luong cac uoc chan:"+chan+"\nSo luong cac uoc le:"+le);
	}

}
