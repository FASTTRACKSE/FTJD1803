import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner sr = new Scanner(System.in);

	public static void main(String[] args) {

		int chon;
		boolean exit = false;
		QuanLySach quanLySach = new QuanLySach();

		showMenu();
		while(true) {
			chon = Integer.parseInt(sr.nextLine());
			switch (chon) {
			
			case 1:
				try {
					quanLySach.nhap();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			case 2:
				System.out.println("Hien thi sach trong kho : ");
				quanLySach.xuat();
				break;
			
			case 3:
				break;
			
			case 4:
				quanLySach.sapXepTheoDonGia();
				break;
			
			case 5:
				quanLySach.timKiemNXB();
				quanLySach.timKiemDM();
				break;
			
			case 6:
				break;
			
			case 0:
				System.out.println("Thoat");
				exit=true;
				break;

			default:
				break;
			}
			showMenu();
		}

	}

	private static void showMenu() {
		System.out.println("/****************************************/");
		System.out.println(" 1 : Nhap sach vao kho ");
		System.out.println(" 2 : Hien thi danh sach trong kho ");
		System.out.println(" 3 : Thực hiện chức năng bán sách. Sách bán được lưu vào trong 1 danh sách riêng để lưu lịch sử bán ");
		System.out.println(" 4 : Sắp xếp sách theo đơn giá");
		System.out.println(" 5 : Tìm sách theo nhà xuất bản, theo danh mục. ");
		System.out.println(" 6 : Tinh tổng doanh thu bán sách ");
		System.out.println(" 0 : Ket thuc chuong trinh ");
		System.out.println("/****************************************/");
		System.out.println("/*********** Moi ban chon lai ***********/");
	}

}