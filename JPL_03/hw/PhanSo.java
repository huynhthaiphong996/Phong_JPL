package JPL_03;

public class PhanSo{
	private int tuso,mauso;
	
	public PhanSo() {
		// TODO Auto-generated constructor stub
	}
	
	public PhanSo(int tuso,int mauso) {
		// TODO Auto-generated constructor stub
		this.tuso = tuso;
		this.mauso = mauso;
	}

	public int getTuso() {
		return tuso;
	}

	public void setTuso(int tuso) {
		this.tuso = tuso;
	}

	public int getMauso() {
		return mauso;
	}

	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	
	public void thongtin(){
		System.out.print(tuso+"/"+mauso);
	}
	public void toigian(){
		int min,ucln=1;
		if(tuso>mauso) min=mauso;
		else min = tuso;
		for(int i = min;i>=1;i--){
			if(tuso%i==0 && mauso%i==0) {
				ucln = i;
				break;
			}
		}
		this.tuso = tuso/ucln;
		this.mauso = mauso/ucln;
	}
	
}
