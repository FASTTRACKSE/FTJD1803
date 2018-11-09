package bangCuuChuong;

import java.util.Scanner;

public class TinhTienDien {
			public static void main(String arg[]) {
				int soDien;
				float tien = 0;
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Nhap So dien = ");
				soDien = Integer.parseInt(sc.nextLine());
				if(soDien < 50) {
					tien = soDien * 1000;
				}
				else {
					tien = 50 * 1000 + (soDien - 50) * 1200;
				}
				System.out.printf("%.2f",tien);
				
				
			}
}
