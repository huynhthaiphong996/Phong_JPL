package JPL_01;

import java.util.Scanner;

public class Bai29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		String tenhs;
		int ngay,thang,nam;
		System.out.println("Nhap ho va ten:");
		tenhs= nhap.nextLine();
		do{
			System.out.println("Nhap ngay sinh:");
			ngay = nhap.nextInt();
		}while(ngay<1||ngay>31);
		
		do{
			System.out.println("Nhap thang sinh:");
			thang = nhap.nextInt();	
		}while(thang<1||thang>12);
		
		do{
			System.out.println("Nhap nam sinh:");
			nam = nhap.nextInt();
		}while(nam<=0);
		
		System.out.println(tenhs+" nam nay dat "+(2017-nam)+" tuoi");
	}

}
