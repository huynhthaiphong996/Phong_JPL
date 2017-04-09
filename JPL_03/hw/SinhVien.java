package JPL_03;

public class SinhVien{
	private String masoSV;
	private String hoten, email, diachi;
	private int sodt;
	private double diemjava, diemandr;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String masoSV, String hoten, String email, String diachi, int sodt, double diemjava,
			double diemandr) {
		
		this.masoSV = masoSV;
		this.hoten = hoten;
		this.email = email;
		this.diachi = diachi;
		this.sodt = sodt;
		this.diemjava = diemjava;
		this.diemandr = diemandr;
	}

	public String getMasoSV() {
		return masoSV;
	}

	public void setMasoSV(String masoSV) {
		this.masoSV = masoSV;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getSodt() {
		return sodt;
	}

	public void setSodt(int sodt) {
		this.sodt = sodt;
	}

	public double getDiemjava() {
		return diemjava;
	}

	public void setDiemjava(double diemjava) {
		this.diemjava = diemjava;
	}

	public double getDiemandr() {
		return diemandr;
	}

	public void setDiemandr(double diemandr) {
		this.diemandr = diemandr;
	}
	
	public double DiemTB(){
		return (diemjava + diemandr)/2;
	}
	
	public void Thongtin(){
		System.out.println("\t.Ma so:"+masoSV+"\n\t.Ho ten: "+hoten+"\n\t.E-mail: "+email+"\n\t.Dia chi:"+diachi
							+"\n\t.Dien thoai:"+sodt+"\n\t.Diem Java:"+diemjava+"\n\t.Diem Android:"+diemandr
							+"\n\t.Diem Trung Binh:"+DiemTB());
	}
}
