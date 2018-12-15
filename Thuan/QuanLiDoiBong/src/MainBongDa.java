import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainBongDa {
	public static void main(String args[]) {
		  Scanner scanner = new Scanner(System.in);
		     ArrayList<Person> listPerson = new ArrayList<>();
			 while (true) {
				
				menu();
				
				int choice = Integer.parseInt(scanner.nextLine());
				
				if (choice == 1) {
					System.out.print("Nhap bao nhieu nguoi:");
					int n = Integer.parseInt(scanner.nextLine());
					System.out.println("Moi chon nguoi muon nhap:");
					System.out.println("1.Cau Thu");
					System.out.println("2.Huan luyen vien");
					String loaiNguoi = scanner.nextLine();
					
					for (int i = 0; i < n; i++) {
						if (loaiNguoi.equals("1")) {
							Player ct = new Player();
							ct.input();
							listPerson.add(ct);
						} else if (loaiNguoi.equals("2")) {
							Coach hl = new Coach();
							hl.nhap();
							listPerson.add(hl);
						}
					}
					
						
					}
					
					
					
				
				//Xuat sinh vien vua nhap
				else if (choice == 2) {
					System.out.println("Danh sach cau thu la la:");
					for (Person ps : listPerson) {
						if (ps instanceof Player) {
						Player pl = (Player)ps;
						pl.xuat();
						}
				}
					
						
					
					}
				 else if (choice == 3) {
						System.out.println("Danh sach huan luyen vien:");
						for (Person ps : listPerson) {
							if (ps instanceof Coach) {
							Coach ch = (Coach)ps;
							ch.xuat();
							} 
							}
						}
					
						
						
					else if (choice == 4) {
						System.out.println("Nhap cau lac bo:");
						
						String cauLB = scanner.nextLine();
						for (Person ps : listPerson) {
							Person ct = (Person) ps;
							if (ct.getCauLB().equals(cauLB)) {
								ct.xuat();
							
							}
						
						}
					}
					else if (choice == 5) {
						Collections.sort(listPerson, new Comparator<Person>() {

							@Override
							public int compare(Person a1, Person a2) {
							// TODO Auto-generated method stub
							return a1.getHoTen().compareTo(a2.getHoTen());
							}

							});
					}else if(choice == 6) {
						double tongLuong = 0;
						for (Person ps : listPerson) {
							tongLuong += ps.tinhLuong();
						}
						System.out.println("Tổng lương phải trả : " + tongLuong);
					}
						
					
						
			 
			 
			 else System.exit(0);
				
						}
			 
	}
			 
	
	
	public static void menu() {
		System.out.println("Menu chuong trinh");
		System.out.println("1. Nhap danh sach cau thu va huan luyen vien");
		System.out.println("2. Hien thi danh sach cau thu");
		System.out.println("3. Hien thi danh sach huan luyen vien");
		System.out.println("4. Hien thi danh sach cau thu va huan luye vien của cau lac bo");
		System.out.println("5. Sap xep cau thu theo ten");
		System.out.println("6. Tinh Tong Doanh Thu");
		System.out.print("Chon menu: ");
		
		
	}
	
}
