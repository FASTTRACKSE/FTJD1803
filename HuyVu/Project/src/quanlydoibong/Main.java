package quanlydoibong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		double tongLuong = 0;
		double luong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguoi ban can nhap :");
		int n = scanner.nextInt();
		ArrayList<Nguoi> arrayList = new ArrayList<>();

		Nguoi nguoi = null;

		System.out.println("Chon so ban can nhap :");
		while(true) {
			menu();
			int chon = scanner.nextInt();
			if(chon==1) {
				for(int i = 0 ; i < n ; i++) {
					System.out.println("Nhap thong tin nguoi thu : " + ( i + 1 )+ ":");
					System.out.println("Chon cau thu hay huan luyen vien : 1 - Cau thu , 2 - Huan luyen vien");
					int choice = scanner.nextInt();
					if(choice==1) {
						nguoi = new CauThu();
						nguoi.nhap();
						arrayList.add(nguoi);
					}else if (choice==2) {
						nguoi = new HuanLuyenVien();
						nguoi.nhap();
						arrayList.add(nguoi);
					}

				}

			}else if (chon==2) {
				System.out.println("Hien thi danh sach cau thu :");
				for(Nguoi ng : arrayList) {
					if(ng instanceof CauThu) {
						CauThu ct = (CauThu)ng;
						ct.xuat();
					}
				}
				
			}else if (chon==3) {
				System.out.println("Hien thi danh sach huan luyen vien :");
				for(Nguoi ng : arrayList) {
					if(ng instanceof HuanLuyenVien) {
						HuanLuyenVien hlv = (HuanLuyenVien)ng;
						hlv.xuat();
					}
				}
			} 
			else if(chon==4) {
				System.out.println("Xuat danh sach cau thu va huan luyen vien : ");
				for (Nguoi ng : arrayList) {
					
				}
				System.out.println(arrayList.toString());

			}else if (chon==5) {
				Collections.sort(arrayList, new Comparator<Nguoi>() {

					@Override
					public int compare(Nguoi o1, Nguoi o2) {
						return o1.getHoTen().compareTo(o2.getHoTen());
					}
				});
				System.out.println("Sap xep cau thu theo ten :");
				for(int i=0;i<arrayList.size();i++) {
					System.out.println("Ho va ten : " +arrayList.get(i).getHoTen());
				}
			}
			else if(chon==6) {
				for(int i = 0 ; i < n ; i++) {
					luong = nguoi.tinhLuong();
					tongLuong +=luong;
				}
				System.out.println("Tong luong phai tra cho cau lac bo = " + tongLuong);

			}else if (chon==7) {
			
			}else if(chon==0) {
				System.exit(chon);
			}
		}

}

	public static void menu() {
		System.out.println(">>       Chon Menu      <<");
		System.out.println("+ ---------------------------------+");
		System.out.println("| 1 . Nhap danh sach cau thu va huan luyen vien ");
		System.out.println("| 2 . Hien thi danh sach cau thu ");
		System.out.println("| 3 . Hiển thị danh sách huẩn luyện viên.  ");
		System.out.println("| 4 . Hiển thị danh sách cầu thủ và huấn luyện viên của một câu lạc bộ được nhập vào từ bàn phím ");
		System.out.println("| 5 . Sap xep ten cau thu ");
		System.out.println("| 6 . Tong luong phai tra cho cau lac bo ");
		System.out.println("| 7 . Tìm câu lạc bộ chi ngân sách cho cầu thủ và huấn luyện viên nhiều nhất ");
		System.out.println("| 0 . Thoat ");
	}
	

}
