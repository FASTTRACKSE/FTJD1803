import java.util.ArrayList;
import java.util.Scanner;

public abstract class Person {
	/*
	 * Viết chương trình xây dựng hệ thống quản lý đội bóng gồm cầu thủ và huấn luyện viên
Cầu thủ (Player) có những thông tin như: 		họ tên, quê quán, câu lạc bộ, tuổi, vị trí chơi bóng, lương, thưởng. 
Huấn luyện viên (Coach) có những thông tin như: họ tên, quốc tịch, tuổi, câu lạc bộ, lương, phụ cấp.

Thưởng và phụ cấp được tính bằng 10% lương.

Xây dựng chương trình có các chức năng:
1. Nhập danh sách cầu thủ và huấn luyện viên.
2. Hiển thị danh sách cầu thủ
3. Hiển thị danh sách huẩn luyện viên
4. Hiển thị danh sách cầu thủ và huấn luyện viên của một câu lạc bộ được nhập vào từ bàn phím
5. Sắp xếp cầu thủ theo tên.
6. Tính tổng lương và phụ cấp một câu lạc bộ (được nhập từ bàn phím) phải trả
7. Tìm câu lạc bộ chi ngân sách cho cầu thủ và huấn luyện viên nhiều nhất

Hướng dẫn: xây dựng lớp Person có các thông tin chung. Hai lớp Player và lớp Coach kế thừa từ lớp này.
	 */
	
	String hoTen;
	int tuoi;
	String cauLacBo;
	float luong;
	
	
	public Person() {
		super();
	}


	public Person(String hoTen, int tuoi, String cauLacBo, float luong) {
		super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.cauLacBo = cauLacBo;
		
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public String getCauLacBo() {
		return cauLacBo;
	}


	public void setCauLacBo(String cauLacBo) {
		this.cauLacBo = cauLacBo;
	}

	
		
	public float getLuong() {
		return luong;
	}


	public void setLuong(float luong) {
		this.luong = luong;
	}
	
	abstract public float tinhThuNhap();

	public void nhap(ArrayList<Person> arr) {
		
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("Nhap ho ten: ");
	hoTen= sc.nextLine();
	
	kiemTraTuoi(arr);
	
	System.out.println("Nhap cau lac bo: ");
	cauLacBo=sc.nextLine();
	
	kiemTraLuong(arr);
	
	}
	
	void kiemTraTuoi(ArrayList<Person> arr) {
		Scanner sc=new Scanner (System.in);
		while(true) {

			try {
				System.out.println("Nhap tuoi:");
				this.tuoi = Integer.parseInt(sc.nextLine());
				MyException.checktuoi(this.tuoi);break;
			} catch (MyException e1) {
				// TODO Auto-generated catch block
				System.out.println("Nam phai >0");
			}
			catch (NumberFormatException e1) {
				System.out.println("Vui long nhap so");
			}
		}
	}
	
	
	void kiemTraLuong(ArrayList<Person> arr) {
		Scanner sc=new Scanner (System.in);
		while(true) {

			try {
				System.out.println("Nhap luong:");
				this.luong= Float.parseFloat(sc.nextLine());
				MyException.checkluong(this.luong);break;
			} catch (MyException e1) {
				// TODO Auto-generated catch block
				System.out.println("Tien luong phai >0");
			}
			catch (NumberFormatException e1) {
				System.out.println("Vui long nhap so");
			}
		}
	}
	
	public String toString() {
		return "\tHo ten: "+hoTen+"\tTuoi: "+tuoi+"\tCau lac bo: "+cauLacBo+"\tLuong: "+luong;
	}


	 

	
	
	
	
}
