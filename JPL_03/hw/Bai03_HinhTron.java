package JPL_03;
import java.util.*;
public class Bai03_HinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-Nhap thong tin hinh tron\nHoanh do tam:");
		double hd = scan.nextDouble();
		System.out.println("Tung do tam:");
		double td = scan.nextDouble();
		System.out.println("Ban kinh r:");
		double r = scan.nextDouble();
		
		HinhTron hinhtron = new HinhTron(hd, td, r);
		hinhtron.ThongTin();
		double cv = hinhtron.ChuVi();
		double dt = hinhtron.DienTich();
		System.out.println("Chu vi hinh tron: CV = "+cv+"\tDT = "+dt);
	}

}
