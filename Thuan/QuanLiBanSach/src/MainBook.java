import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainBook {
		public static void main(String args[]) {
			  Scanner scanner = new Scanner(System.in);
			     ArrayList<Sach> listBook = new ArrayList<>();
				 while (true) {
					
					menu();
					
					int choice = Integer.parseInt(scanner.nextLine());
					
					if (choice == 1) {
						
						System.out.print("Nhap bao nhieu Sach:");
						int n = Integer.parseInt(scanner.nextLine());
						
						for (int i = 0; i < n; i++) {
							Sach s = new Sach(); 
							s.input();
							listBook.add(s);
							
							
						}
						
						
						
					}
					//Xuat sinh vien vua nhap
					else if (choice == 2) {
						System.out.println("Danh sach Sach la:");
						for (Sach s: listBook) {
							System.out.println(("Ten Sach :"+s.tenSach) +" || "+ s.tacGia + " || "+ s.tenNXB + " ||"+ s.namSX + " || "+ s.donGia);
						}
					} else if (choice == 3) {
							System.out.println("Nhap ten sach can ban:");
							int n = Integer.parseInt(scanner.nextLine());
							
							for (int i = 0; i < n; i++) {
								Sach s = new Sach(); 
								s.input();
								listBook.add(s);
							}
						}
							
							
						else if (choice == 4) {
							Collections.sort(listBook, new Comparator<Sach>() {
								public int compare(Sach s1, Sach s2) {
									return (int)(s1.getDonGia() - s2.getDonGia());
									
								}
							});
							System.out.println("Danh sach Sach theo don gia: ");
							for (int i = 0; i < listBook.size(); i++) {
								listBook.get(i).display();
							
								}
						}
							
						else if (choice == 5) {
									System.out.print("Nhap ten Sach can tim: ");
									String ten = scanner.nextLine();
		
									for (Sach s : listBook) {
									if (s.getTenSach().equals(ten)) {
									System.out.println(("Ten Sach :"+s.tenSach) +" || "+ s.tacGia + " || "+ s.tenNXB + " ||"+ s.namSX + " || "+ s.donGia);
											}
									}
						}
							
						
							
				 
				 
				 else System.exit(0);
					
				}
				 
		}
		
		
		public static void menu() {
			System.out.println("Menu chuong trinh");
			System.out.println("1. Nhap Sach vao kho");
			System.out.println("2. Hien thi danh sach Sach trong kho");
			System.out.println("3. Ban Sach");
			System.out.println("4. Sap xep sach theo don gia");
			System.out.println("5. Tim Sach");
			System.out.println("6. Tinh Tong Doanh Thu");
			System.out.print("Chon menu: ");
			
			
		}
		
}
