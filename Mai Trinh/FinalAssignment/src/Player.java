import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Person {
	String queQuan;
	String viTri;
	
	
	
	public Player() {
		super();
	}


	public Player(String queQuan, String viTri) {
		super();
		this.queQuan = queQuan;
		this.viTri = viTri;
		
	}


	public String getQueQuan() {
		return queQuan;
	}


	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}


	public String getViTri() {
		return viTri;
	}


	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
	
	public float getThuong() {
		
		return (float) (0.1 * getLuong());
	}
	

	public float tinhThuNhap() {
		return getLuong()+getThuong();
	}
	
	Scanner sc = new Scanner(System.in);
	public void nhap(ArrayList<Person> arr) {
		super.nhap(arr);
		System.out.println("Nhap que quan: ");
		this.queQuan=sc.nextLine();
		
		System.out.println("Nhap vi tri: ");
		this.viTri=sc.nextLine();
		
		//kiemTraLuong(arr);
	}
	
	
	
	public String toString() {
		return "Cau thu: "+super.toString()+"\tQue quan: "+queQuan+"\tVi tri: "+viTri+"\tThuong: "+getThuong()+"\tThu nhap: "+tinhThuNhap();
	}
}
