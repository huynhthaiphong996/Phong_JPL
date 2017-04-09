package JPL_03;

public class ThoiGian{
	private int ngay,thang,nam,gio,phut,giay;
	public ThoiGian() {
		// TODO Auto-generated constructor stub
	}
	public ThoiGian(int ngay, int thang, int nam, int gio, int phut, int giay) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public int getGio() {
		return gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
	}
	public int getPhut() {
		return phut;
	}
	public void setPhut(int phut) {
		this.phut = phut;
	}
	public int getGiay() {
		return giay;
	}
	public void setGiay(int giay) {
		this.giay = giay;
	}
	
	public void thongtin(){
		System.out.print("ngay "+ngay+" thang "+thang+" nam "+nam+" , "+gio+":"+phut+":"+giay);
		if(gio>=12)
		{
			System.out.print("\nngay "+ngay+" thang "+thang+" nam "+nam+" , "+(gio-12)+":"+phut+":"+giay+" PM");
		}else System.out.print("\nngay "+ngay+" thang "+thang+" nam "+nam+" , "+gio+":"+phut+":"+giay+" AM");
	}
	
	public boolean NamNhuan(int nam){
		if(nam%4==0){
			
			if(nam%100==0)
			{
				if(nam%400==0) return true;
				else return false;
			}
			else return true;
			
		}else return false;
	}
	
	public int SoNgayTrongThang(int thang,int nam){
		int mang[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		boolean nhuan = NamNhuan(nam);
		if(thang==2 && nhuan==true) return mang[1]+1;
		else return mang[thang-1];
	}
	
	public void ThoiGianSauKGiay(int k){
		int giaysau = giay +k;
		int phutsau = phut;
		int giosau = gio;
		int ngaysau = ngay;
		int thangsau= thang;
		int namsau = nam;
		
		while(giaysau>=60){
			phutsau++;
			if(phutsau==60)
			{
				phutsau=0;
				giosau++;
				if(giosau==24)
				{
					ngaysau++;
					giosau=0;
					if(ngaysau>SoNgayTrongThang(thangsau, namsau))
					{
						ngaysau=1;
						thangsau++;
						if(thangsau==13)
						{
							thangsau=1;
							namsau++;
						}
					}
				}
			}
			
			giaysau = giaysau -60;
		}
		
		ThoiGian time = new ThoiGian(ngaysau, thangsau, namsau, giosau, phutsau, giaysau);
		time.thongtin();
	}
	
	public void ThoiGianSauKPhut(int k){
		int giaysau = giay;
		int phutsau = phut+k;
		int giosau = gio;
		int ngaysau = ngay;
		int thangsau= thang;
		int namsau = nam;
		
		while(phutsau>=60)
		{
			giosau++;
			if(giosau==24)
			{
				giosau=0;
				ngaysau++;
				if(ngaysau > SoNgayTrongThang(thangsau, namsau))
				{
					ngaysau =1;
					thangsau++;
					if(thangsau==13)
					{
						thangsau = 1;
						namsau++;
					}
				}
			}
			phutsau = phutsau - 60;
		}
		ThoiGian time = new ThoiGian(ngaysau, thangsau, namsau, giosau, phutsau, giaysau);
		time.thongtin();
	}
	
	public void ThoiGianSauKGio(int k){
		int giaysau = giay;
		int phutsau = phut;
		int giosau = gio + k;
		int ngaysau = ngay;
		int thangsau= thang;
		int namsau = nam;
		
		while(giosau>=24)
		{
			ngaysau++;
			if(ngaysau > SoNgayTrongThang(thangsau, namsau))
			{
				ngaysau=1;
				thangsau++;
				if(thangsau==13)
				{
					thangsau=1;
					namsau++;
				}
			}
			giosau = giosau - 24;
		}
		ThoiGian time = new ThoiGian(ngaysau, thangsau, namsau, giosau, phutsau, giaysau);
		time.thongtin();
	}
	
	public void ThoiGianSauKNgay(int k){
		int giaysau = giay;
		int phutsau = phut;
		int giosau = gio;
		int ngaysau = ngay+k;
		int thangsau= thang;
		int namsau = nam;
		
		while(ngay>SoNgayTrongThang(thangsau, namsau))
		{
			thangsau++;
			if(thangsau==13)
			{
				namsau++;
				ngaysau -= SoNgayTrongThang(thangsau-1, namsau);
				thangsau=1;
			}else  ngaysau -= SoNgayTrongThang(thangsau-1, namsau);
		}
		
		ThoiGian time = new ThoiGian(ngaysau, thangsau, namsau, giosau, phutsau, giaysau);
		time.thongtin();
	}
	
	public void ThoiGianSauKThang(int k){
		int giaysau = giay;
		int phutsau = phut;
		int giosau = gio;
		int ngaysau = ngay;
		int thangsau= thang+k;
		int namsau = nam;
		
		while(thangsau>=13)
		{
			namsau++;
			thangsau = thangsau - 12;
		}
		ThoiGian time = new ThoiGian(ngaysau, thangsau, namsau, giosau, phutsau, giaysau);
		time.thongtin();
	}
	
	public void ThoiGianSauKNam(int k){
		int giaysau = giay;
		int phutsau = phut;
		int giosau = gio;
		int ngaysau = ngay;
		int thangsau= thang;
		int namsau = nam+k;
		
		ThoiGian time = new ThoiGian(ngaysau, thangsau, namsau, giosau, phutsau, giaysau);
		time.thongtin();
	}
	
}
