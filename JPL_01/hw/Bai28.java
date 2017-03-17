package JPL_01;

import java.util.Scanner;

public class Bai28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		double toan, ly, hoa,diemtb;
		String mahs,tenhs;
		System.out.println("Nhap ten:");
		tenhs= nhap.nextLine();
		System.out.println("Nhap ma hoc sinh:");
		mahs = nhap.nextLine();
		do{
			System.out.println("Nhap diem toan:");
			toan = nhap.nextDouble();
			System.out.println("Nhap diem ly:");
			ly = nhap.nextDouble();
			System.out.println("Nhap diem hoa:");
			hoa = nhap.nextDouble();
		}while(toan<0||ly<0||hoa<0||toan>10||ly>10||hoa>10);
		diemtb = (toan+ly+hoa)/3;
		System.out.println("Diem trung binh cua hoc sinh la:"+diemtb);
		if(diemtb>=8) System.out.println("Hoc sinh dat loai Gioi");
		else if(diemtb>=6) System.out.println("Hoc sinh dat loai Kha");
		else if(diemtb>=5) System.out.println("Hoc sinh dat loai Trung Binh");
		else System.out.println("Hoc sinh dat loai Yeu");
		
	}

}
