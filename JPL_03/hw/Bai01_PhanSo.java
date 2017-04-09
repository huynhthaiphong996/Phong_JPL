package JPL_03;

import java.util.Scanner;

public class Bai01_PhanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		PhanSo[] ps= new PhanSo[2];
		
		for(int i=0;i<2;i++){
			int a,b;
			System.out.println("-Nhap phan so thu "+(i+1)+ ":");
			System.out.println("Nhap tu so:");
			a = scan.nextInt();
			
			do{
				System.out.println("Nhap mau so:");
				b = scan.nextInt();
			}while(b==0);
			ps[i] = new PhanSo(a, b);
		}
		
		System.out.print("Phan so thu 1:  ");
		ps[0].thongtin();
		System.out.print("\nPhan so thu 2:  ");
		ps[1].thongtin();
		
		PhanSo cong, tru, nhan, chia;
		
		cong = cong(ps[0], ps[1]);
		cong.toigian();
		if(cong.getTuso()==0){
			System.out.print("\n-Cong 2 phan so = 0");
		}else if(cong.getMauso()==1){
			System.out.print("\n-Cong 2 phan so = "+cong.getTuso());
		}
		else {
			System.out.print("\n---\n-Cong 2 phan so = ");
			cong.thongtin();
		}
		
		
		tru = tru(ps[0], ps[1]);
		tru.toigian();
		if(tru.getTuso()==0){
			System.out.print("\n-Tru 2 phan so = 0");
		}else if(tru.getMauso()==1){
			System.out.print("\n-Tru 2 phan so = "+tru.getTuso());
		}
		else{
			System.out.print("\n-Tru 2 phan so = ");
			tru.thongtin();
		}
		
		
		nhan = nhan(ps[0], ps[1]);
		nhan.toigian();
		if(nhan.getTuso()==0){
			System.out.print("\n-Nhan 2 phan so = 0");
		}else if(nhan.getMauso()==1){
			System.out.print("\n-Nhan 2 phan so = "+nhan.getTuso());
		}
		else{
			System.out.print("\n-Nhan 2 phan so = ");
			nhan.thongtin();
		}
		
		
		chia = chia(ps[0], ps[1]);
		chia.toigian();
		if(chia.getTuso()==0){
			System.out.print("\n-Chia 2 phan so = ");
		}else if(chia.getMauso()==1){
			System.out.print("\n-Chia 2 phan so = "+chia.getTuso());
		}
		else{
			System.out.print("\n-Chia 2 phan so = ");
			chia.thongtin();
		}
		
	}

	private static PhanSo cong(PhanSo a, PhanSo b){
		PhanSo kq;
		if(a.getMauso()==b.getMauso())
		{
			int tuso,mauso;
			tuso = a.getTuso() + b.getTuso();
			mauso = a.getMauso();
			kq = new PhanSo(tuso,mauso);
			return kq;
		}
		else {
			int tuso,mauso;
			mauso = a.getMauso()*b.getMauso();
			tuso = a.getTuso()*b.getMauso() + a.getMauso()*b.getTuso();
			kq = new PhanSo(tuso, mauso);
			return kq;
		}
	}
	private static PhanSo tru(PhanSo a, PhanSo b){
		PhanSo kq;
		if(a.getMauso()==b.getMauso())
		{
			int tuso,mauso;
			tuso = a.getTuso() - b.getTuso();
			mauso = a.getMauso();
			kq = new PhanSo(tuso,mauso);
			return kq;
		}
		else {
			int tuso,mauso;
			mauso = a.getMauso()*b.getMauso();
			tuso = a.getTuso()*b.getMauso() - a.getMauso()*b.getTuso();
			kq = new PhanSo(tuso, mauso);
			return kq;
		}
	}
	private static PhanSo nhan(PhanSo a, PhanSo b){
		PhanSo kq;
		int tuso,mauso;
		tuso = a.getTuso()*b.getTuso();
		mauso = a.getMauso()*b.getMauso();
		kq = new PhanSo(tuso, mauso);
		return kq;
		
	}
	private static PhanSo chia(PhanSo a, PhanSo b){
		PhanSo kq;
		int tuso,mauso;
		tuso = a.getTuso()*b.getMauso();
		mauso = a.getMauso()*b.getTuso();
		kq = new PhanSo(tuso, mauso);
		return kq;
		
	}
}

