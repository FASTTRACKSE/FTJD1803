package danhsachsinhvien;

import java.util.Scanner;

public class MenuStudents {

	public static void main(String[] args) {


		Scanner sr = new Scanner(System.in);
		Student sinhVien[] = new Student[3];

		while(true) {
			menu();
			int chon = Integer.parseInt(sr.nextLine());

			if(chon==1) {
				for(int i = 0 ; i < 3 ;i++) {
					Student sv = new Student();
					sv.input();
					sinhVien[i]=sv;
				}
			}else if(chon==2) {
				System.out.println("Sinh vien gioi :");
				for(int i =0;i<3;i++) {
					if(sinhVien[i].sinhviengioi()==1) {
						System.out.println(" Ho va ten :" +sinhVien[i].hoTen);
					}
				}

			}else if(chon==3) {
				System.out.println("Sinh vien co diem cao nhat :");
				for(int i = 0 ; i < 3 ;i++) {

					if(sinhVien[i].sinhVienDiemCaoNhat(sinhVien[0])==1) {
						System.out.println(" Ho va ten : " +sinhVien[i].hoTen + " Diem trung binh cao nhat :" + sinhVien[i].diemTrungBinh);
					}else {

					}

				}

			}else if(chon==4) {
				System.out.println("Danh sach sinh vien :");
				for(Student s:sinhVien) {
					s.output();
				}
			}else if(chon==5){
				System.exit(chon);
			}

		}
	}


	public static void menu() {
		System.out.println(">>       Danh sach sinh vien      <<");
		System.out.println("+ ---------------------------------+");
		System.out.println("| 1 . Nhap danh sach sinh vien ");
		System.out.println("| 2 . Hien thi sinh vien gioi ");
		System.out.println("| 3 . Tim sinh vien diem cao nhat lop va hien thi ");
		System.out.println("| 4 . Hien thi danh sach sinh vien ");
		System.out.println("| 5 . Thoat ");
	}

}
