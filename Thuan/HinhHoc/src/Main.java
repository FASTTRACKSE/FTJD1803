import java.util.Scanner;

public class Main {
		public static void main(String arg[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chieu dai: ");
			double dai= Integer.parseInt(sc.nextLine());
			
			System.out.println("Nhap chieu rong:");
			double rong= Integer.parseInt(sc.nextLine());
			
			System.out.println("Nhap canh cua hinh vuong:");
			int canh= Integer.parseInt(sc.nextLine());
			
			ChuNhat cn = new ChuNhat(dai, rong);
			HinhVuong vu = new HinhVuong(canh);
			cn.Xuat();
			vu.xuat();
		}
}
