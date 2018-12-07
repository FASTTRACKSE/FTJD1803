import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		/*
		 * 1. Nhap danh sach sinh vien
		 * 2. Hien thi sinh vien gioi
		 * 3. Tim sinh vien diem cao nhat lop va hien thi
		 * 4. Hien thi danh sach sinh vien
		 * 5. Thoat chuong trinh
		 */
		
	     Scanner scanner = new Scanner(System.in);
	     ArrayList<Student> listStudents = new ArrayList<>();
		 while (true) {
			
			menu();
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			if (choice == 1) {
				
				System.out.print("Nhap bao nhieu sinh vien:");
				int n = Integer.parseInt(scanner.nextLine());
				
				for (int i = 0; i < n; i++) {
					
					Student sv = new Student(); //Tao doi tuong sinh vien
					sv.input(); //nhap du lieu cho sinh vien
					listStudents.add(sv);
					FileOutputStream fos = new FileOutputStream("file11.txt");
					ObjectOutputStream oss = new ObjectOutputStream(fos);
					oss.writeObject(listStudents);
					oss.close();
				}
				
				
				
			}
			//Xuat sinh vien vua nhap
			else if (choice == 2) {
				System.out.println("Danh sach sinh vien la:");
				for (Student sv: listStudents) {
					System.out.println(sv.getHoTen() + "|" + sv.getDiemTrungBinh());
				}
			} else if (choice == 3) {
					System.out.println("Danh sach ngau nhien:");
					
					
				}else if (choice == 4) {
					System.out.print("Nhap ten can tim: ");
					String ten = scanner.nextLine();

					for (Student sv : listStudents) {
					if (sv.getHoTen().equals(ten)) {
					System.out.println(sv.getHoTen() + "|" +sv.getDiemTrungBinh()); 
				}
					}
				}else if (choice == 5) {
					System.out.print("Nhap ten can tim: ");
					String ten = scanner.nextLine();

					for (Student sv : listStudents) {
					if (sv.getHoTen().equals(ten)) {
					System.out.println(sv.getHoTen() + "|" +sv.getDiemTrungBinh()); 
					}
					}
				}else if (choice == 6) {
					FileInputStream fis = new FileInputStream("file11.txt");
					ObjectInputStream oss = new ObjectInputStream(fis);
					listStudents = (ArrayList<Student>) oss.readObject();
					oss.close();
					fis.close();
				}
					
		 
		 
		 else System.exit(0);
			
		}
		 }
	
	public static void menu() {
		System.out.println("Menu chuong trinh");
		System.out.println("1. Nhap danh sach sinh vien");
		System.out.println("2. Hien thi sinh vien");
		System.out.println("3. Xuat danh sach ngau nhien");
		System.out.println("4. Tim sinh vien theo ho ten");
		System.out.println("5. Tim va xoa sinh vien theo ho ten");
		System.out.println("6. xuat file ra man hinh");
		System.out.print("Chon menu: ");
		
		
	}
}
