package JPL_03;

public class Date{
	private int ngay,thang,nam;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
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
	
	public void ThongTin(){
		System.out.print("ngay "+ngay+" thang "+thang+" nam "+nam);
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
	
	public void NgayHomTruoc(int k){
		Date homtruoc;
		int ngaytruoc = ngay - k;
		int thangtruoc = thang;
		int namtruoc = nam;
		while(ngaytruoc<=0)
		{
			thangtruoc--;
			if(thangtruoc==0){
				namtruoc--;
				thangtruoc=12;
				ngaytruoc+=SoNgayTrongThang(thangtruoc,namtruoc);
			}else{
				ngaytruoc+= SoNgayTrongThang(thangtruoc,namtruoc);
			}
			
		}
		homtruoc = new Date(ngaytruoc, thangtruoc, namtruoc);
		
		homtruoc.ThongTin();
	}
	
	public void NgayHomSau(int k){
		Date homsau;
		int ngaysau=ngay+k;
		int thangsau=thang;
		int namsau=nam;
		
		while(ngaysau>SoNgayTrongThang(thangsau, namsau)){
			thangsau++;
			if(thangsau==13){
				namsau++;
				ngaysau -= SoNgayTrongThang(thangsau-1, namsau);
				thangsau=1;
			}else ngaysau -= SoNgayTrongThang(thangsau-1, namsau);
		}
		homsau = new Date(ngaysau, thangsau, namsau);
		homsau.ThongTin();
	}
	
	public int qui(int thang){
		int mang[][] = new int[4][3];
		int dem=1;
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				mang[i][j] = dem;
				dem++;
			}
		}
	
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				if(thang == mang[i][j])
				{
					return i+1;
				}
			}
		}
		return 0;
					
		
	}
	
}
