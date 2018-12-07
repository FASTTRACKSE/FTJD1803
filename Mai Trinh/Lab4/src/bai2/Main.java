package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nganh; String hoTen;
		ArrayList<SinhVienFpt> SinhVienList = new ArrayList<SinhVienFpt>();
		boolean exit = false;
		while (true) {
			System.out.println("--------------------MENU-------------------");
			System.out.println("1. Nhap danh sach sinh vien: ");
			System.out.println("2. Xuat thong tin danh sach sinh vien");
			System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
			System.out.println("4. Sap xep danh sach sinh vien theo diem");
			System.out.println("5. Ket thuc");


			Scanner sc = new Scanner (System.in);
			System.out.print("Moi ban chon: ");
			int choose= Integer.parseInt(sc.nextLine());

			switch (choose) {
			case 1:

				System.out.println("-----Nhap danh sach sinh vien -----");
				System.out.println("Nhap so luong sinh vien: ");
				int n = Integer.parseInt(sc.nextLine());
				for (int i=0; i < n; i++) {
					System.out.println("Sinh vien thuoc nganh nao?");
					String nganh1 = sc.nextLine();

					if (nganh1.equals("IT"))
					{
						SinhVienIT sv = new SinhVienIT();
						sv.nhap();
						SinhVienList.add(sv);  

					}
					else if(nganh1.equals("Biz")) {

						SinhVienBiz sv1= new SinhVienBiz();
						sv1.nhap();
						SinhVienList.add(sv1);


					}
					else 
						System.out.println("Khong co nganh nay");

				}
				break;

			case 2:

				System.out.println();
				System.out.println("-----Xuat thong tin danh sach sinh vien-----");
				for (int i=0; i<SinhVienList.size(); i++) {
					SinhVienList.get(i).xuat();

				}
				break;

			case 3:
				System.out.println("-----Xuat danh sach sinh vien co hoc luc gioi-----");
				for (int i=0; i<SinhVienList.size(); i++) {
					if (SinhVienList.get(i).getHocLuc().equals("Gioi"))
						SinhVienList.get(i).xuat();
				}
				break;

			case 4: 
				System.out.println("-----Sap xep sinh vien theo diem-----");
				Collections.sort(SinhVienList, new Comparator<SinhVienFpt>() {
					public int compare (SinhVienFpt sv1, SinhVienFpt sv2) {
						if (sv1.getDiem()>sv2.getDiem()) {
							return -1;
						} else if (sv1.getDiem() == sv2.getDiem()) {
							return 0;
						} else
							return 1;
					}
				});
				System.out.println("Danh sach sinh vien sap xep theo diem: ");
				for (int i = 0; i < SinhVienList.size(); i++) {
					SinhVienList.get(i).xuat();
				}
			
			break;		

		case 5: 

			System.out.println("Ket thuc");
			exit = true;
			break;

		default:

			System.out.println();
			System.out.println("Moi ban chon lai so ben duoi menu");
			break;

		}

		if (exit) {
			break;
		}
	}

}

}
