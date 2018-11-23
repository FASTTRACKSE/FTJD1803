package assignment_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		ArrayList<BienLai> arrayListBienLai = new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap so ho gia dinh :");
		n = scanner.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			BienLai bienLai = new BienLai();
			System.out.println("Nhap bien lai ho thu : ");
			bienLai.nhapBienLai();
			arrayListBienLai.add(bienLai);
		}
		
		System.out.println("Thong tin bien lai :");
		for(int i = 0 ; i < arrayListBienLai.size() ; i++) {
			System.out.println("Thong tin bien lai ho thu :");
			arrayListBienLai.get(i).hienThiBienLai();
		}
		
	}

}
