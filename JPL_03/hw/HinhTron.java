package JPL_03;

public class HinhTron{
	private double hdtam,tdtam,bankinh;
	private static final double pi = 3.14;
	
	public HinhTron() {
		// TODO Auto-generated constructor stub
	}
	public HinhTron(double hdtam, double tdtam, double bankinh) {
		this.tdtam = tdtam;
		this.hdtam = hdtam;
		this.bankinh = bankinh;
	}
	public double getTdtam() {
		return tdtam;
	}
	public void setTdtam(double tdtam) {
		this.tdtam = tdtam;
	}
	public double getHdtam() {
		return hdtam;
	}
	public void setHdtam(double hdtam) {
		this.hdtam = hdtam;
	}
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	
	public void ThongTin(){
		System.out.println("Hinh tron co tam ("+hdtam+";"+tdtam+") va ban kinh r = "+bankinh);
	}
	
	public double ChuVi(){
		return pi*2*bankinh;
	}
	public double DienTich(){
		return pi*bankinh*bankinh;
	}
	
}
