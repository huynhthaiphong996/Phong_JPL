package JPL_01;

import java.util.Scanner;

public class Bai26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<=0);
		if(n<2) System.out.println("Khong co so le nao nho hon "+n);
		else {
			System.out.println("Cac so le nho hon "+n+" la:");
			int i;
			for(i=1;i<n;i++)
			{
				if(i%2!=0) System.out.print(i+" ");
			}
		}
		
	}

}
