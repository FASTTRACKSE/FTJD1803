import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		int dai= Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap chieu rong:");
		int rong= Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap canh cua hinh vuong:");
		int canh= Integer.parseInt(sc.nextLine());
		
		ChuNhat cn = new ChuNhat(dai, rong);
		ChuNhat vu = new Vuong(canh);
		cn.xuat();
		vu.xuat();
		
		
	}

}
