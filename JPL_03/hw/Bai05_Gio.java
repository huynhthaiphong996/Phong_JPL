package JPL_03;
import java.util.*;
public class Bai05_Gio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int gio,phut,giay;
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
		
		Hour hour = new Hour(gio, phut, giay);
		
		System.out.print("* Dinh dang 24h: ");
		hour.DinhDang24h();
		System.out.print("\n* Dinh dang 12h: ");
		hour.DinhDang12h();
		
		hour.Tutang1s();
		
		System.out.print("\n-Sau khi tu tang 1s:");
		System.out.print("\n* Dinh dang 24h: ");
		hour.DinhDang24h();
		System.out.print("\n* Dinh dang 12h: ");
		hour.DinhDang12h();
		
		System.out.print("\n---------------");
		System.out.print("\n* Thoi gian sau 1s: ");
		hour.ThoiGianSauKGiay(1);
		
		System.out.println("\n---------------");
		System.out.print("---Nhap k giay sau:");
		int k = scan.nextInt();
		System.out.print("\n* Thoi gian sau "+k+"s: ");
		hour.ThoiGianSauKGiay(k);
		
		System.out.println("\n---------------");
		System.out.print("---Nhap k phut sau:");
		int l = scan.nextInt();
		System.out.print("\n* Thoi gian sau "+l+" phut: ");
		hour.ThoiGianSauKPhut(l);
	}

}

