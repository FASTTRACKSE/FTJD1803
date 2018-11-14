import java.util.Scanner;
public class TinhTienDien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float tien;
		
		int soDien=-1;
		
		while(soDien<0) {
			System.out.print("Nhap so dien su dung cua thang: ");
			Scanner sc = new Scanner(System.in);
			soDien = Integer.parseInt(sc.nextLine());
		}
		if ( soDien >=0 && soDien <50) {
			tien= soDien*1000; 
			System.out.println("Tien thang nay la: "+ tien );

		}
		else if (soDien>= 50){
			tien = 50*1000+(soDien-50)*1200;
			System.out.println("Tien thang nay la: "+ tien);
		}



	}

}
