import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static //	Xây dựng chương trình quản lý bán sách của 1 cửa hàng sách gồm các chức năng:
	//		1. Nhập sách vào kho
	//		2. Hiển thị danh sách trong kho
	//		3. Thực hiện chức năng bán sách. Sách bán được lưu vào trong 1 danh sách riêng để lưu lịch sử bán
	//		4. Sắp xếp sách theo đơn giá
	//		5. Tìm sách theo nhà xuất bản, theo danh mục.
	//		6. Tinh tổng doanh thu bán sách
	//
	//		Các danh sách phải được lưu vào trong file.

	ArrayList<Sach> sachList = new ArrayList<Sach>();
	static ArrayList<Sach> sachbanList = new ArrayList<Sach>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exit= false;
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("----------Menu----------");
			System.out.println("1. Nhap sach vao kho");
			System.out.println("2. Hien thi danh sach trong kho");
			System.out.println("3. Thuc hien chuc nang ban sach");
			System.out.println("4. Xuat sach da ban");
			System.out.println("5. Sap xep sach theo don gia");
			System.out.println("6. Tim sach theo nha xuat ban");
			System.out.println("7. Tim sach theo danh muc");
			System.out.println("8. Hien thi sach da ban");
			System.out.println("9. Tong doanh thu ban sach");
			System.out.println("0. Thoat!!!");
			System.out.println("Moi ban chon so: ");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {

			case 1: 
				System.out.println("Nhap thong tin sach ");
				Sach s= new Sach();
				s.nhap();
				sachList.add(s);
				break;
				
			case 2: 
				
				System.out.println("Hien thi thong tin sach trong kho");
				Sach s2= new Sach();
				for (int i=0; i <sachList.size(); i ++) {
					sachList.get(i).xuat();
				}
				break;
				
			case 3:
				
				System.out.println("Nhap ten sach can ban: ");
				String tensachban = sc.nextLine();
				Sach sachban = new Sach();
				
				for (int i=0; i<sachList.size(); i++) {
					if(tensachban.equals(sachList.get(i).getTenSach())) {
						sachban.setTenSach(sachList.get(i).getTenSach());
						sachban.setDanhMuc(sachList.get(i).getDanhMuc());
						sachban.setDonGia(sachList.get(i).getDonGia());
						sachban.setNamXBan(sachList.get(i).getNamXBan());
						sachban.setNhaXBan(sachList.get(i).getNhaXBan());
						sachban.setTacGia(sachList.get(i).getTacGia());
						
						break;
					}
				}
				sachbanList.add(sachban);
				
				
				
				FileOutputStream fos= null;
				ObjectOutputStream oos = null;

				try {
					fos = new FileOutputStream("Lich su sach ban.dat");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(sachbanList);				


				}catch (Exception e) {
					System.out.println("Loi doc file: "+e);
				}

				break;
				
			case 4: 
				System.out.println("---Xuat sach da ban---");
				FileInputStream fis= null;
				ObjectInputStream ois = null;
				try {
					fis = new FileInputStream("Lich su sach ban.dat");
					ois = new ObjectInputStream(fis);
					sachbanList = (ArrayList<Sach>) ois.readObject();
					System.out.println("Doc tu file de xuat: ");
					for (Sach s4: sachbanList) {
						s4.xuat();
					}
					ois.close();
					fis.close();

				}catch (Exception e) {
					System.out.println("Loi ghi file: " + e);
				}
				break;

			case 5:

				Sach s4= new Sach();
				Collections.sort(sachList, new Comparator<Sach>(){
					public int compare (Sach s1, Sach s2) {
						return (int)(s1.getDonGia()-s2.getDonGia());
						
						
//						if (s1.getDonGia()>s2.getDonGia()) {
//							return 1;
//						}
//						else if (s1.getDonGia()==s2.getDonGia()) {
//							return 0;
//						}
//						else return -1;
				}
				});
				
				System.out.println("Sap xep theo don gia");
				for (int i=0; i<sachList.size(); i++) {
					sachList.get(i).xuat();
				}
				break;

			case 6: 

				System.out.print("Nhap ten nha xuat ban can tim: ");
				String nhaXBan = sc.nextLine();
				System.out.println("Danh sach sach theo nha xuat ban: ");
				for (int i=0; i<sachList.size();i++) {
					if (sachList.get(i).getNhaXBan().equals(nhaXBan)) {
						System.out.println(sachList.get(i).getTenSach());
					}
				}
				break;

			case 7: 
				System.out.print("Nhap ten danh muc ban can tim: ");
				String danhMuc = sc.nextLine();
				System.out.println("Danh sach sach theo danh muc");
				for (int i=0; i<sachList.size();i++) {
					if (sachList.get(i).getDanhMuc().equals(danhMuc)) {
						System.out.println(sachList.get(i).getTenSach());

					}
				}

				break;

			case 8:
				
				System.out.println("---Hien thi sach da ban---");
				for (int i=0; i<sachbanList.size(); i++) {
					sachbanList.get(i).xuat();
				}
				break;
			case 9: 

				int sum=0;
				for (int i =0; i <sachbanList.size();i++) {
					sum= (int) (sum+ sachbanList.get(i).getDonGia());
				}
				System.out.println("Tong doanh thu ban sach: "+sum);

				break;

			case 0: 
				System.out.println("Thoat");
				exit = true;
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




