package JPL_03;
import java.util.Scanner;
public class Bai02_ToaDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ToaDo[] toado = new ToaDo[2];
		
		for(int i=0;i<2;i++){
			toado[i] = new ToaDo();
			System.out.println("-Nhap thong tin toa do diem thu "+(i+1)+":");
			System.out.println("Hoanh do:");
			double a = scan.nextDouble();
			toado[i].setHoanhdo(a);
			
			System.out.println("Tung do:");
			double b = scan.nextDouble();
			toado[i].setTungdo(b);
		}
		
		for(int i=0;i<2;i++){
			System.out.print("Toa do "+(i+1)+":");
			toado[i].thongtin();
		}
		System.out.println("\n-Khoang cach giua hai toa do: "+khoangcach(toado[0].getHoanhdo(), toado[0].getTungdo(),
																		toado[1].getHoanhdo(), toado[1].getTungdo()));
		
		double x = khoangcach(toado[0].getHoanhdo(), toado[0].getTungdo(), 0, 0);
		double y = khoangcach(toado[1].getHoanhdo(), toado[1].getTungdo(), 0, 0);
		if(x>y) {
			System.out.println("Toa do xa goc toa do nhat la:");
			toado[0].thongtin();
		}else if(x<y){
			System.out.println("Toa do xa goc toa do nhat la:");
			toado[1].thongtin();
		}else System.out.println("Hai toa do cach goc toa do mot doan bang nhau!");
	}
	
	private static double khoangcach(double a,double b,double c,double d){
		return Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d, 2));
	}

}


