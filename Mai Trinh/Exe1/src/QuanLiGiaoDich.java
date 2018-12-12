import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiGiaoDich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <GiaoDich> GDList = new ArrayList<>();
		ArrayList <GiaoDich> GDListv = new ArrayList<>();
		ArrayList <GiaoDich> GDListt = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		while(true) {

			System.out.println("-----------MENU----------");
			System.out.println("1. Nhap danh sach cac giao dich");
			System.out.println("2. Xuat danh sach cac giao dich");
			System.out.println("3. Tinh tong so luong cho tung loai");
			System.out.println("4. Tinh trung binh thanh tien cua giao dich tien te");
			System.out.println("5. Xuat ra cac giao dich co don gia > 1 ty");
			System.out.println("Chon: ");
			int choose = Integer.parseInt(sc.nextLine());
			int x;

			switch (choose) {
			case 1:

				System.out.println("--------------------------------------");
				System.out.println("-----Nhap danh sach cac giao dich-----");
				System.out.println("Ban muon giao dich loai nao? Neu Vang chon 1 or Neu TienTe chon 2");
				x=Integer.parseInt(sc.nextLine());
				if(x==1) {
					GiaoDich gd1 = new GiaoDichVang();
					gd1.nhap(GDList);
					GDList.add(gd1);
					GDListv.add(gd1);
					//gd1.thanhTien=gd1.getThanhTien();

				}
				else if(x==2) {
					GiaoDich gd2 = new GIaoDichTienTe();
					gd2.nhap(GDList);
					GDList.add(gd2);
					GDListt.add(gd2);
				
				}
				break;

			case 2:
				System.out.println("------------------------");
				System.out.println("----Xuat danh sach cac giao dich-----");

				for (int i=0; i<GDList.size(); i++) {
					System.out.println(GDList.get(i).toString());
				}
				break;

			case 3:
				System.out.println("--------------------------");
				System.out.println("-----Tinh tong so luong cho tung loai-----");
				int s1=0; int s2=0;
				for (int i=0; i < GDListv.size(); i++) {
					GiaoDich gd3 = new GiaoDichVang();					
					s1=s1+GDListv.get(i).getSoLuong();
				}
				System.out.println("Tong so luong giao dich vang: "+s1);
				for (int i=0; i < GDListt.size(); i++) {
					GiaoDich gd4 = new GIaoDichTienTe();					
					s2=s2+GDListt.get(i).getSoLuong();
				}
				System.out.println("Tong so luong giao dich tien te: "+s2);
				break;

			case 4: 
				System.out.println("-----Tinh trung binh thanh tien cua giao dich tien te-----");
				 GiaoDich gd4 = new GIaoDichTienTe();
				float sum=0;
				
				for (int i=0; i<GDListt.size(); i++) {
					sum=(float) (sum+ GDListt.get(i).thanhTien());
				}
				
				System.out.println("Trung bình thanh tien cua giao dich tien te: "+sum/GDListt.size());
				break;

			case 5: 
				System.out.println("--------------------------");
				System.out.println("-----Xuat ra cac giao dich co don gia > 1 ty-----");
				for (int i=0; i<GDList.size(); i++) {
					if (GDList.get(i).getDonGia()>1000000000) {
						System.out.println(GDList.get(i).toString());
					}
					else System.out.println("Khong co giao dich voi don gia > 1ty");
				}
				break;

			default:
				System.out.println("Lam on chon so ben duoi menu");
				break;
			}
			if (exit) {
				break;
			}
		}

	}
}


