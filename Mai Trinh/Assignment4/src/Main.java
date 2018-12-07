import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	  static //Hãy xây dựng lớp KhachHang để lưu trữ các thông tin riêng của mỗi hộ sử dụng điện. 
		//2. Xây dựng lớp BienLai để quản lý việc sử dụng và thanh toán tiền điện của các hộ dân.
		//3. Xây dựng các phương thức nhập, và hiển thị một thông tin riêng của mỗI hộ sử dụng điện. 
		//4. Cài đặt chương trình thực hiện các công việc sau: 
		//+ 4.1 Nhập vào các thông tin cho n hộ sử dụng điện  ( + 3 điểm ) 
		//+ 4.2 Hiển thị thông tin về các biên lai đã nhập  ( + 3 điểm ) 
		//+ 4.3 Tính số tiền điện phải trả cho mỗi hộ dân, nếu giả sử rằng tiền phải trả được tính theo công thức sau: ( + 4 điểm ) số tiền phải trả=(Số mới - số cũ) * 750.  
	ArrayList<KhachHang> khachHangList = new ArrayList<KhachHang>();			 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban muon nhap thong tin bao nhieu ho?");
		int n = Integer.parseInt(sc.nextLine());
		System.err.println("Nhap vao thong tin ho su dung dien");
		for (int i=0; i<n; i++) {
			BienLai kh = new BienLai();
			kh.nhap();
			khachHangList.add(kh);
		}
		
		System.out.println("---Xuat thong tin bien lai da nhap---");
		
		for (int i=0; i<khachHangList.size(); i++) {
			khachHangList.get(i).xuat();
		}
		
		
		
	}

}
