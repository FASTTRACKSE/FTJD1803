package assignment_4;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		BienLai bienLai;
		Scanner scanner = new Scanner(System.in);
		ArrayList<BienLai> arrayListBienLai = new ArrayList<>();
		System.out.println("Nha so ho gia dinh can nhap :");
		n = scanner.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			bienLai = new BienLai();
			System.out.println("Nhap thong tin bien lai gia dinh " +(i+1)+"");
			bienLai.nhapBienLai();
			arrayListBienLai.add(bienLai);
		}
		System.out.println("Thong tin bien lai ho gia dinh");
		for(int i = 0 ; i<arrayListBienLai.size();i++) {
			System.out.println("Thong tin bien lai ho gia dinh"+(i+1)+"");
			arrayListBienLai.get(i).hienThiBienLai();
		}
	}

}
