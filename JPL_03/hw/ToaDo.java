package JPL_03;

public class ToaDo{
	private double tungdo,hoanhdo;

	public ToaDo() {
		// TODO Auto-generated constructor stub
	}
	
	public ToaDo(double tungdo, double hoanhdo) {
		
		this.tungdo = tungdo;
		this.hoanhdo = hoanhdo;
	}

	public double getTungdo() {
		return tungdo;
	}

	public void setTungdo(double tungdo) {
		this.tungdo = tungdo;
	}

	public double getHoanhdo() {
		return hoanhdo;
	}

	public void setHoanhdo(double hoanhdo) {
		this.hoanhdo = hoanhdo;
	}
	
	public void thongtin(){
		System.out.print("("+hoanhdo+";"+tungdo+")");
	}
}
