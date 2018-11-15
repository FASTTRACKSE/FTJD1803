import java.util.Scanner;

public class Student {
	
	//day la thuoc tinh
	String hoTen;
	int diemJava;
	int diemHtml;
	
	public void input() {
		//Nhap du lieu cho sinh vien sv
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Nhap ho ten sv: ");
		this.hoTen = scanner.nextLine();
		
		System.out.print("Nhap diem java: ");
		this.diemJava = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Nhap diem Html: ");
		this.diemHtml = Integer.parseInt(scanner.nextLine());
	}
	
	//day la phuong thuc
	float tinhDiemTrungBinh() {
		return (float)(this.diemHtml + this.diemJava)/2;
	}
	
	public void display() {
		System.out.println(this.hoTen + "|" + this.diemJava + "|"+this.diemHtml + "|" + this.tinhDiemTrungBinh() );
	}
}
