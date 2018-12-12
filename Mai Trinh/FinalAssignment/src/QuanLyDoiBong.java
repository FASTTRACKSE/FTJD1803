import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyDoiBong {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Nhập danh sách cầu thủ và huấn luyện viên.
2. Hiển thị danh sách cầu thủ
3. Hiển thị danh sách huẩn luyện viên
4. Hiển thị danh sách cầu thủ và huấn luyện viên của một câu lạc bộ được nhập vào từ bàn phím
5. Sắp xếp cầu thủ theo tên.
6. Tính tổng lương và phụ cấp một câu lạc bộ (được nhập từ bàn phím) phải trả
7. Tìm câu lạc bộ chi ngân sách cho cầu thủ và huấn luyện viên nhiều nhất
		 */
		/*
		 * for (Person ps : listPerson) { 
if (ps instanceOf Coach) {
Coach ch = (Coach)ps;
} else if (ps instanceOf Player) {
Player pl = (Plyer) ps; 
} 
}
		 */

		ArrayList <Person> PersonList = new ArrayList<>();


		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		while(true) {

			System.out.println("-----------MENU----------");
			System.out.println("1. Nhap danh sach cau thu va huan luyen vien");
			System.out.println("2. Hien thi danh sach cac cau thu");
			System.out.println("3. Hien thi danh sach cac huan luyen vien");
			System.out.println("4. Hien thi danh sach cac cau thu va huan luyen vien cung mot cau lac bo");
			System.out.println("5. Sap xep theo ten");
			System.out.println("6. Tong luong va phu cap phai tra cua mot cau lac bo");
			System.out.println("7. Tim cau lac bo chi ngan sach nhieu nhat");

			System.out.println("Chon: ");
			int choose = Integer.parseInt(sc.nextLine());
			int x;

			switch (choose) {
			case 1:

				System.out.println("--------------------------------------");
				System.out.println("-----Nhap danh sach cau thu va huan luyen vien-----");
				System.out.println("Ban muon nhap ten cau thu hay huan luyen vien?");
				System.out.println("Cau thu chon 1 --- HLV chon 2");
				x=Integer.parseInt(sc.nextLine());
				if(x==1) {
					Person ps1 = new Player();
					ps1.nhap(PersonList);
					PersonList.add(ps1);
				}
				else if(x==2) {
					Person ps2 = new Coach();
					ps2.nhap(PersonList);
					PersonList.add(ps2);
				}
				break;

			case 2:
				System.out.println("------------------------");
				System.out.println("----Hien thi danh sach cau thu-----");
				for (Person ps : PersonList) { 
					if (ps instanceof Player) {
						Player pl = (Player) ps; 
						System.out.println(pl.toString());
					} 
				}
				break;

			case 3:
				System.out.println("------------------------");
				System.out.println("----Hien thi danh sach huan luyen vien-----");
				for (Person ps : PersonList) { 
					if (ps instanceof Coach) {
						Coach ch = (Coach)ps;
						System.out.println(ch.toString());
					}
				}
				break;

			case 4: 
				ArrayList <Person> CLBList = new ArrayList<>();
				System.out.println("------------------------");
				System.out.println("Moi ban nhap ten cau lac bo:  ");
				String nhap;
				nhap=sc.nextLine();
				System.out.println("----Hien thi danh sach cac cau thu va huan luyen vien cung mot cau lac bo-----");
				
				for(int i=0; i<PersonList.size(); i++) {
					if (nhap.equals(PersonList.get(i).getCauLacBo())) {
						System.out.println(i+". "+PersonList.get(i).getHoTen());
					}
				}
				
				break;

			case 5: 
				System.out.println("------------------------");
				System.out.println("-----Sap xep theo ten-----");
				Collections.sort(PersonList, new Comparator<Person>(){

					public int compare(Person p1, Person p2) {

						return (p1.getHoTen().compareTo(p2.getHoTen()));
					}
				});

				break;

			case 6: 
				System.out.println("--------------------------");
				System.out.println("-----Tong luong va phu cap phai tra cua mot cau lac bo-----");

				break;

			case 7: 
				System.out.println("--------------------------");
				System.out.println("-----Tim cau lac bo chi ngan sach nhieu nhat-----");


				break;

			default:
				System.out.println("Vui long chi chon nhung so ben duoi");
				break;
			}	
			if (exit) {
				break;
			}

		}
	}

}

