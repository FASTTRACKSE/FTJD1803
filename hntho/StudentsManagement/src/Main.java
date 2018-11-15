import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		/*
		 * 1. Nhap danh sach sinh vien
		 * 2. Hien thi sinh vien gioi
		 * 3. Tim sinh vien diem cao nhat lop va hien thi
		 * 4. Hien thi danh sach sinh vien
		 * 5. Thoat chuong trinh
		 */
		Scanner scanner = new Scanner(System.in);
		Student[] students = new Student[3];
		
		
		while (true) {
			
			menu();
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			if (choice == 1) {
				for (int i = 0; i < 3; i++) {
					Student sv = new Student(); //Tao doi tuong sinh vien
					sv.input(); //nhap du lieu cho sinh vien
					students[i] = sv;
				}
			}
			//Xuat sinh vien vua nhap
			else if (choice == 2) {
				System.out.println("Danh sach sinh vien la:");
				for (Student s:students) {
					s.display();
				}
			} else System.exit(0);
			
		}
	}
	public static void menu() {
		System.out.println("Menu chuong trinh");
		System.out.println("1. Nhap danh sach sinh vien");
		System.out.println("2. Hien thi sinh vien");
		System.out.print("Chon menu: ");
		
		
	}
}
