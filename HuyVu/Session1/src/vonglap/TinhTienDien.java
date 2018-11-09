package vonglap;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class TinhTienDien {

	public static void main(String[] args) {
		
		int soDien = 0;
		float tien;
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhập vao so điện :");
		soDien = sr.nextInt();
		
		if(soDien < 50) {
			tien=soDien*1000;
			System.out.println("So tien = " +tien);
		}else {
			tien = 50 * 1000 + (soDien - 50 ) * 1200;
			System.out.println("So tien = " + tien);
		}
	}

}
