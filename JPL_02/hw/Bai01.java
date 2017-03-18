package JPL_02;

import java.util.Scanner;

public class Bai01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int n;
		double[] mang;
		do{
			System.out.println("Nhap so phan tu cua mang:");
			n = nhap.nextInt();
		}while(n<1);
		mang = new double[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap gia tri phan tu a["+i+"]:");
			mang[i] = nhap.nextDouble();
		}
		xuatmang(mang,n);
		lietkephantuam(mang, n);
		demsoluongphantuduong(mang, n);
		timsolonnhat(mang, n);
		timsonhonhat(mang, n);
		timsoAmLonNhat(mang, n);
	}
	
	private static void xuatmang(double[] a,int n){
		
		System.out.println("-Cac phan tu trong mang la:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}
	
	private static void lietkephantuam(double[] a,int n){
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0) {dem++;break;}
		}
		if(dem==0) System.out.println("\n-Khong co phan tu am nao trong mang");
		else{
			System.out.println("\n-Cac phan tu am trong mang la:");
			for(int i=0;i<n;i++)
			{
				if(a[i]<0)
				System.out.print(a[i]+" ");
				
			}
		}
		
	}
	
	private static void demsoluongphantuduong(double[] a,int n){
		int dem=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>0) dem++;
			
		}
		System.out.println("\n-So luong cac phan tu duong trong mang la:"+dem);
	}
	
	private static void timsolonnhat(double[] a,int n){
		double max=a[0];
		for(int i=1;i<n;i++)
		{
			if(max<a[i]) max=a[i];
		}
		System.out.println("\n-Phan tu lon nhat trong mang la:"+max);
	}
	
	private static void timsonhonhat(double[] a,int n){
		double min=a[0];
		for(int i=1;i<n;i++)
		{
			if(min>a[i]) min=a[i];
		}
		System.out.println("\n-Phan tu nho nhat trong mang la:"+min);
	}
	
	private static void timsoAmLonNhat(double[] a,int n){
		double max=1;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0) {max=a[i];break;}
		}
		if(max==1) System.out.println("\n-Khong co phan tu am nao trong mang");
		else{
			for(int i=0;i<n;i++)
			{
				if(a[i]<0 && a[i]>max) max=a[i];
			}
			System.out.println("\n-Phan tu am lon nhat trong mang la:"+max);
		}
		
	}

}
