package JPL_01;

import java.util.Scanner;

public class Bai30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		int chon;
		double a,b;
		while(true){
			System.out.println("1.Phep cong\n2.Phep tru\n3.Phep nhan\n4.Phep chia\n5.Phep chia lay du\n6.Ket thuc");
			do{
				chon = nhap.nextInt();
			}while(chon<1||chon>6);
			
			if(chon==6) return;
			
			System.out.println("Nhap so thuc a:");
			a = nhap.nextDouble();
			System.out.println("Nhap so thuc b:");
			b = nhap.nextDouble();
			
			switch(chon){
				case 1:{
					System.out.println("Ket qua:"+a+"+"+b+"="+(a+b));
					break;
				}
				case 2:{
					System.out.println("Ket qua:"+a+"-"+b+"="+(a-b));
					break;
				}
				case 3:{
					System.out.println("Ket qua:"+a+"*"+b+"="+(a*b));
					break;
				}
				case 4:{
					System.out.println("Ket qua:"+a+"/"+b+"="+(a/b));
					break;
				}
				case 5:{
					System.out.println("Ket qua:"+a+"%"+b+"="+(a%b));
					break;
				}
				
			}
		}
		
		
		
	}

}
