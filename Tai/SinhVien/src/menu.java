import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class menu {
	public static void main(String[] args) {
		ArrayList<SinhVien1> sv1 =new ArrayList<SinhVien1>();
		System.out.println("nhap so sv:");
		int n;
		Scanner sc= new Scanner (System.in);
		n=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			SinhVien1 sv = new SinhVien1();
			sv.nhap();
			sv1.add(sv);
		}
		for (SinhVien1 sv : sv1) {
			sv.xuat();
		}
		Collections.sort(sv1, new Comparator<SinhVien1>() {

			@Override
			public int compare(SinhVien1 st1, SinhVien1 st2) {
				// TODO Auto-generated method stub
				if((st1.getHoTen().compareTo(st2.getHoTen()))>0)
				return 1;
				else return 0;
			}	
		});
		System.out.println("da sap xep");
		for (SinhVien1 sv : sv1) {
			sv.xuat();
		}
	}
}
