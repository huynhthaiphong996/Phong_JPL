package JPL_01;

import java.util.Scanner;

public class Bai25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int nam;
		do{
			System.out.println("Nhap nam:");
		nam = nhap.nextInt();
		}while(nam<=0);
		
		if(nam%4==0){
			if(nam%100==0) {
				if(nam%400==0)
				System.out.println(nam+" la nam nhuan");
				else System.out.println(nam+" khong phai la nam nhuan");
			}
			else System.out.println(nam+" la nam nhuan");
			
		}else System.out.println(nam+" khong phai la nam nhuan");
			
	}

}
