package JPL_03;
import java.util.*;
public class Bai06_ThoiGian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ngay,thang,nam,gio,phut,giay;
		ThoiGian day;
		do{
			do{
				System.out.println("-Nhap ngay:");
				ngay = scan.nextInt();
			}while(ngay>31 || ngay<1);
			
			do{
				System.out.println("-Nhap thang:");
				thang = scan.nextInt();
			}while(thang<1 || thang >12);
			
			do{
				System.out.println("-Nhap nam:");
				nam = scan.nextInt();
			}while(nam<=0);
			
			do{
				System.out.println("Nhap gio:");
				gio = scan.nextInt();
			}while(gio>=24 || gio <0);
			
			do{
				System.out.println("Nhap phut:");
				phut = scan.nextInt();
			}while(phut>=60 || phut <0);
			
			do{
				System.out.println("Nhap giay:");
				giay = scan.nextInt();
			}while(giay>=60 || giay <0);
			
			day = new ThoiGian(ngay, thang, nam, gio, phut, giay);
			if(ngay<=day.SoNgayTrongThang(thang,nam)){
				System.out.println("---Thong tin nhap hop le---");
				break;
			}
			else System.out.println("----Thong tin nhap khong hop le---\n--Moi nhap lai:--");
			
			
		}while(true);
		
		
		day.thongtin();
		
		System.out.println("\n--Nhap k giay:");
		int kgiay = scan.nextInt();
		System.out.println("* Thoi gian sau "+kgiay+" giay");
		day.ThoiGianSauKGiay(kgiay);
		
		System.out.println("\n--Nhap k phut:");
		int kphut = scan.nextInt();
		System.out.println("* Thoi gian sau "+kphut+" phut");
		day.ThoiGianSauKPhut(kphut);
		
		System.out.println("\n--Nhap k gio:");
		int kgio = scan.nextInt();
		System.out.println("* Thoi gian sau "+kgio+" gio");
		day.ThoiGianSauKGio(kgio);
		
		System.out.println("\n--Nhap k ngay:");
		int kngay = scan.nextInt();
		System.out.println("* Thoi gian sau "+kngay+" ngay");
		day.ThoiGianSauKNgay(kngay);
		
		System.out.println("\n--Nhap k thang:");
		int kthang = scan.nextInt();
		System.out.println("* Thoi gian sau "+kthang+" thang");
		day.ThoiGianSauKThang(kthang);
		
		System.out.println("\n--Nhap k nam:");
		int knam = scan.nextInt();
		System.out.println("* Thoi gian sau "+knam+" nam");
		day.ThoiGianSauKNam(knam);
		
	}

}

