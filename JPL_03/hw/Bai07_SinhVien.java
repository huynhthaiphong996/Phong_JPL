package JPL_03;
import java.util.*;
public class Bai07_SinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		SinhVien[] sv;
		System.out.println("Nhap so sinh vien:");
		int n = Integer.parseInt(scan.nextLine());
		
		sv = new SinhVien[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("**Nhap thong tin sinh vien thu "+(i+1)+":");
			System.out.println("Nhap ma so sinh vien:");
			String masv = scan.nextLine();
			System.out.println("Nhap ho ten:");
			String hoten = scan.nextLine();
			System.out.println("Nhap e-mail:");
			String email = scan.nextLine();
			System.out.println("Nhap dia chi:");
			String diachi = scan.nextLine();
			System.out.println("Nhap so dien thoai:");
			int sodt = Integer.parseInt(scan.nextLine());
			System.out.println("Nhap diem java:");
			double diemjava = Double.parseDouble(scan.nextLine());
			System.out.println("Nhap diem android:");
			double diemandr = Double.parseDouble(scan.nextLine());
			sv[i] = new SinhVien(masv, hoten, email, diachi, sodt, diemjava, diemandr);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("-Sinh vien thu "+(i+1)+":");
			sv[i].Thongtin();
		}
		
	}

}

