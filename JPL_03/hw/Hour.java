package JPL_03;

public class Hour{
	private int gio,phut,giay;

	public Hour() {
		
	}

	public Hour(int gio, int phut, int giay) {
		this.gio = gio;
		this.phut = phut;
		this.giay = giay;
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
	
	public void DinhDang24h(){
		System.out.print(gio+":"+phut+":"+giay);
	}
	public void DinhDang12h(){
		if(gio>=12)
		{
			System.out.print((gio-12)+":"+phut+":"+giay+" pm");
		}else System.out.print((gio)+":"+phut+":"+giay+" am");
	}
	
	public void Tutang1s(){
		giay++;
		if(giay==60)
		{
			phut++;
			giay=0;
			if(phut==60) 
			{
				gio++;
				phut=0;
				if(gio==24)
				{
					gio = 0;
				}
			}
		}
		
	}
	
	public void ThoiGianSauKGiay(int k){
		int giaysau = giay + k;
		int phutsau =phut;
		int giosau= gio;
		while(giaysau>=60){
			phutsau++;
			if(phutsau==60)
			{
				phutsau=0;
				giosau++;
				if(giosau==24) giosau =0;
			}
			giaysau=giaysau-60;
		}
		Hour sau = new Hour(giosau, phutsau, giaysau);
		sau.DinhDang24h();
	}
	
	public void ThoiGianSauKPhut(int k){
		int giaysau = giay;
		int phutsau =phut + k;
		int giosau= gio;
		
		while(phutsau>=60){
			giosau++;
			if(giosau==24){
				giosau=0;
			}
			phutsau = phutsau -60;
		}
		Hour sau = new Hour(giosau, phutsau, giaysau);
		sau.DinhDang24h();
	}
}
