package JPL_01;
import java.util.*;
public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n,i,s=0;
		do{
			System.out.println("Nhap n:");
			n = nhap.nextInt();
		}while(n<5 || n>20);
		
		for(i=1;i<=n;i++)
		{
			s+=(i*i);
		}
		System.out.println("Ket qua: S = "+s);
	}

}
