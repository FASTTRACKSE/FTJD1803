package assignment_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import lab5.Student;

public class Main {

	public static void main(String[] args) {
		double tongLuong = 0;
		double luong;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so thong tin danh sach can bo truong hoc can nhap :");
		int n = scanner.nextInt();
		ArrayList<ThongTinCanBo> arrayList = new ArrayList<>();

		ThongTinCanBo thongTinCanBo = null;

		System.out.println("Chon so ban can nhap :");
		while(true) {

			menu();
			int chon = scanner.nextInt();
			if(chon==1) {
				for(int i = 0 ; i < n ; i++) {
					System.out.println("Nhap thong tin can bo thu : " + ( i + 1 )+ ":");
					System.out.println("Chon loai can bo : 1 - Giang vien , 2 - Nhan vien");
					int choice = scanner.nextInt();
					if(choice==1) {
						thongTinCanBo = new GiangVien();
						thongTinCanBo.nhap();
						arrayList.add(thongTinCanBo);
					}else if (choice==2) {
						thongTinCanBo = new NhanVien();
						thongTinCanBo.nhap();
						arrayList.add(thongTinCanBo);
					}

				}

			}else if(chon==2) {
				System.out.println("Xuat danh sach can bo : ");
				for (ThongTinCanBo ttcb : arrayList) {
					
				}
				System.out.println(arrayList.toString());

			}else if(chon==3) {
				for(int i = 0 ; i < n ; i++) {
					luong = thongTinCanBo.tinhLuong();
					tongLuong +=luong;
				}
				System.out.println("Tong luong phai tra cho can bo = " + tongLuong);

			}else if (chon==4) {
				Collections.sort(arrayList, new Comparator<ThongTinCanBo>() {

					@Override
					public int compare(ThongTinCanBo o1, ThongTinCanBo o2) {
						// TODO Auto-generated method stub
						if(o1.tinhLuong()>o2.tinhLuong()) {  
							return 1;
						}
						else { 
							if(o1.tinhLuong()==o2.tinhLuong())
								return 0;
						}
						return -1;
					}
				});
				System.out.println("Sap xep can bo theo luong :");
				for(int i=0;i<arrayList.size();i++) {
					System.out.println("Ho va ten : " +arrayList.get(i).getHoTen()+ " Luong : " +arrayList.get(i).tinhLuong());
				}
			}else if(chon==5) {
				System.exit(chon);
			}
		}

	}

	public static void menu() {
		System.out.println(">>       Chon Menu      <<");
		System.out.println("+ ---------------------------------+");
		System.out.println("| 1 . Nhap thong tin danh sach can bo trong truong ");
		System.out.println("| 2 . Xuất danh sách giảng viên khoa x, hoặc nhân viên phòng ban y nào đó. ");
		System.out.println("| 3 . Tổng số lương trường phải trả cho cán bộ.  ");
		System.out.println("| 4 . Sắp xếp cán bộ theo lương, nếu lương bằng thì sắp xếp theo tên ");
		System.out.println("| 5 . Thoat ");
	}

}
