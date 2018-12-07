import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner(System.in);
		ArrayList<Student> svList = new ArrayList<Student>(); 

		int i;

		boolean exit = false;

		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1. Them sinh vien");
			System.out.println("2. Cap nhat thong tin sinh vien theo id");
			System.out.println("3. Xoa sinh vien theo id");
			System.out.println("4. Sap xep sinh vien theo ten");
			System.out.println("5. Hien thi danh sach sinh vien");
			System.out.println("6. Luu sinh vien vao file");
			System.out.println("7. Xuat sinh vien ra  ");
			System.out.println("0. Ket thuc chuong trinh");
			System.out.println("-----------------------------");


			/*Nhap thong tin sinh vien 
			Student sv0= new Student();
			for (int i=0; i<sv.length;i++) {

				sv0.nhapTen();

				if (sv0.getName().equals("")) {
					break;
				}else 
					{sv0.input();
					count++;}

				sv[i] = sv0; // cho thong tin sinh vien vao mang

			}
			 */	
			System.out.print("Chon: ");
			int choose = Integer.parseInt(sc.nextLine());	

			switch (choose) {

			case 1:

				System.out.println();
				Student sv1= new Student();
				System.out.println("----------Nhap thong tin sinh vien moi----------");
				sv1.input();
				svList.add(sv1);
				break;

			case 2: 

				System.out.println();
				System.out.println("---Cap nhat thong tin sinh vien theo id---");				
				System.out.print("Moi ban nhap id sinh vien: ");				
				int sv2=Integer.parseInt(sc.nextLine());
				for (Student sv : svList) {
					if (sv2 == sv.getId()) {
						sv.output();
						break;
					}
				}
				break;

			case 3: 

				System.out.println();
				System.out.println("---------Xoa sinh vien theo id---------");
				System.out.println("Nhap id cua sinh vien: ");
				int sv3;
				sv3 = Integer.parseInt(sc.nextLine());

				for(Student sv : svList) {
					if (sv3 == sv.getId()) {
						svList.remove(sv);
					}
				}
				System.out.println("***Moi chon 5 de xem lai danh sach");
				System.out.println();
				break;

			case 4:

				System.out.println();
				System.out.println("---Sap xep sinh vien theo danh sach---");
				System.out.println();

				Collections.sort(svList, new Comparator<Student>() {

					public int compare(Student sv1, Student sv2) {
						return (sv1.getName().compareTo(sv2.getName()));

					}


				});
				System.out.println("***Moi chon 5 de xem lai danh sach cap nhat");
				System.out.println();
				break;

			case 5:
				System.out.println();
				System.out.println("---------------------Danh sach sinh vien---------------------");
				for (Student sv:  svList){
					sv.output();
				}

				System.out.println();
				break;

			case 6: 
				FileInputStream fis= null;
				ObjectInputStream ois = null;
				try {
					fis = new FileInputStream("Danh sach.dat");
					ois = new ObjectInputStream(fis);
					svList = (ArrayList<Student>) ois.readObject();
					System.out.println("Doc tu file: ");
					for (Student sv: svList) {
						sv.output();
					}
					ois.close();
					fis.close();
					
				}catch (Exception e) {
					System.out.println("Loi ghi file: " + e);
				}
					
				
				
				break;

			case 7: 
				FileOutputStream fos= null;
				ObjectOutputStream oos = null;
			
					try {
						fos = new FileOutputStream("Danh sach.dat");
						oos = new ObjectOutputStream(fos);
						oos.writeObject(svList);				
					
					
				}catch (Exception e) {
					System.out.println("Loi doc file: "+e);
				}

				break;
			case 0:
				System.out.println("thoat!");
				exit = true;
				break;

			default:
				System.out.println("invalid! please choose action in below menu:");
				break;
			}

			if (exit) {
				break;
			}


		}
	}

}
