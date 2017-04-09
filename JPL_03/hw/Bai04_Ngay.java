package JPL_03;
import java.util.*;
public class Bai04_Ngay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new  Scanner(System.in);
		Date day;
		int ngay,thang,nam;
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
			
			day = new Date(ngay, thang, nam);
			if(ngay<=day.SoNgayTrongThang(thang,nam)){
				System.out.println("---Thong tin nhap hop le---");
				break;
			}
			else System.out.println("----Thong tin nhap khong hop le---\n--Moi nhap lai:--");
		}while(true);
		
		System.out.print("* Thong tin da nhap: ");
		day.ThongTin();
		
		if(day.NamNhuan(nam)) System.out.println("\n* "+nam+ " la nam nhuan");
		else System.out.println("\n* "+nam+ " khong phai nam nhuan");
		
		int songay = day.SoNgayTrongThang(thang,nam);
		System.out.println("* So ngay toi da trong thang "+thang+" la:"+songay);
		
		System.out.print("* Ngay hom truoc la: ");
		day.NgayHomTruoc(1);
		
		System.out.print("\n* Ngay hom sau la: ");
		day.NgayHomSau(1);
		
		System.out.println("\n-Nhap k ngay truoc:");
		int ktruoc = scan.nextInt();
		System.out.print("* Ngay hom truoc "+ktruoc+" ngay la:");
		day.NgayHomTruoc(ktruoc);
		
		System.out.println("\n-Nhap k ngay sau:");
		int ksau = scan.nextInt();
		System.out.print("* Ngay hom sau "+ksau+" ngay la:");
		day.NgayHomSau(ksau);
		
		System.out.println("\n* La qui thu "+day.qui(thang)+" trong nam");
	}

}
