import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Nhap danh sach sinh vien
		 * 2. Hien thi sinh vien gioi
		 * 3. Tim sinh vien diem cao nhat lop va hien thi
		 * 4. Hien thi danh sach sinh vien
		 * 5. Thoat chuong trinh
		 */


		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> listStudents = new ArrayList<>();
		//int count = 0;
		while (true) {
			menu();
			int choice = Integer.parseInt(scanner.nextLine());

			if (choice == 1) {
				System.out.println("Nhap so sv can nhap");
				int n = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i < n; i++) {
					Student sv = new Student(); //Tao doi tuong sinh vien
					sv.input(); //nhap du lieu cho sinh vien
					listStudents.add(sv);
				}
			}

			//Xuat sinh vien vua nhap
			else if (choice == 2) {
				for (Student sv : listStudents) {
					System.out.println(sv.getHoTen() + "|" +sv.getDiemJava()); 
				}

				//s.display();
			} else if (choice == 3) {
				System.out.print("Nhap nguong diem duoi: ");
				int duoi = Integer.parseInt(scanner.nextLine());

				System.out.print("Nhap nguong diem tren: ");
				int tren = Integer.parseInt(scanner.nextLine());

				for (Student sv : listStudents) {
					if ((sv.getDiemJava() > duoi) && (sv.getDiemJava() < tren) ) {
						System.out.println(sv.getHoTen() + "|" +sv.getDiemJava()); 
					}
				}

			} else if (choice == 4) {
				System.out.print("Nhap ten can tim: ");
				String ten = scanner.nextLine();

				for (Student sv : listStudents) {
					if (sv.getHoTen().equals(ten)) {
						System.out.println(sv.getHoTen() + "|" +sv.getDiemJava()); 
					}

				}


			} else if (choice == 5) {
				System.out.print("Nhap ten can tim: ");
				String ten = scanner.nextLine();

				for (Student sv: listStudents) {
					if (sv.getHoTen().equals(ten)) {
						listStudents.remove(sv);
						break;
					}
				}
				
			}
			else System.exit(0);

		}
	}
	public static void menu() {
		System.out.println("-----------Menu chuong trinh----------");
		System.out.println("1. Nhap danh sach sinh vien");
		System.out.println("2. Hien thi sinh vien");
		System.out.println("3. Hien thi theo khoang diem");
		System.out.println("4. Tim sinh vien theo ho ten");
		System.out.println("5. Xoa sinh vien theo ho ten");
		System.out.print("Chon menu: ");
	}
}

