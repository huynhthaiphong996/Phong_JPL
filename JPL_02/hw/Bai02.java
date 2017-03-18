package JPL_02;

import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n;
		int[] mang;
		do{
			System.out.println("Nhap so phan tu cua mang:");
			n = nhap.nextInt();
		}while(n<1);
		mang = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap gia tri phan tu a["+i+"]:");
			mang[i] = nhap.nextInt();
		}
		xuatmang(mang, n);
		tinhtong(mang, n);
		demsoluongsole(mang, n);
		kiemtracoSoAmKhong(mang, n);
		kiemtraMangToanChan(mang, n);
		sapxepphantutangdan(mang, n);
		chantangdanLeGiamDan(mang, n);
		mangCoSoNguyenToKo(mang, n);
		demsonguyento(mang, n);
		
	}
	
	private static void xuatmang(int[] a,int n){
		
		System.out.println("-Cac phan tu trong mang la:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
	
	private static void tinhtong(int[] a,int n){
		int s=0;
		for(int i=0;i<n;i++)
		{
			s+=a[i];
		}
		System.out.println("\n-Tong cac phan tu trong mang: S = "+s);
	}
	
	private static void demsoluongsole(int[] a,int n){
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0) dem++;
		}
		System.out.println("-So luong cac so le trong mang la: "+dem);
	}
	
	private static void kiemtracoSoAmKhong(int[] a,int n){
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0) {dem++;break;}
		}
		if(dem==0) System.out.println("-Khong co phan tu am nao trong mang");
		else
		System.out.println("-Co phan tu am xuat hien trong mang");
	}
	
	private static void kiemtraMangToanChan(int[] a,int n){
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0) {dem++;break;}
		}
		if(dem==0) System.out.println("-Mang toan chan");
		else
		System.out.println("-Mang co xuat hien so le");
	}
	
	private static void sapxepphantutangdan(int[] a,int n){
		int i;
		for(i=0;i<n;i++)
		{
			int min= a[i],k=i;
			for(int j=i+1;j<n;j++)
			{
				if(min>a[j]) {min =a[j];k=j;}
			}
			a[k]=a[i];
			a[i]=min;
		}
		System.out.println("-Cac phan tu da duoc sap xep tang dan:");
		for (i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
	
	private static void chantangdanLeGiamDan(int[] a,int n){
		int i;
		System.out.println("\n-Sap xep phan tu chan tang dan, phan tu le giam dan:");
		System.out.print("\t*Chan tang dan:");
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0){
				int min= a[i],k=i;
				for(int j=i+1;j<n;j++)
				{
					if(min>a[j]) {min =a[j];k=j;}
				}
				a[k]=a[i];
				a[i]=min;
				System.out.print(a[i]+" ");
			}
			
		}
		
		System.out.print("\n\t*Le giam dan:");
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0){
				int max= a[i],k=i;
				for(int j=i+1;j<n;j++)
				{
					if(max<a[j]) {max =a[j];k=j;}
				}
				a[k]=a[i];
				a[i]=max;
				System.out.print(a[i]+" ");
			}
			
		}
		
	}
	
	public static int songuyento(int n){
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) return 0;
		}
		return 1;
	}
	
	private static void mangCoSoNguyenToKo(int[] a,int n){
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(songuyento(a[i])==1) dem++;
		}
		if(dem==0) System.out.println("\n-Mang khong ton tai so nguyen to");
		else
		System.out.println("\n-Mang co ton tai so nguyen to");
	}
	
	private static void demsonguyento(int[] a,int n){
		int dem=0;

		for(int i=0;i<n;i++)
		{
			if(songuyento(a[i])==1) dem++;
		}
		if(dem==0) System.out.println("-Mang khong ton tai so nguyen to");
		else
		System.out.println("-So luong cac so nguyen to trong mang la:"+dem);
	}
	
	
}

