import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
	//day la thuoc tinh
		String hoTen;
		int diemJava;
		int diemHtml;
		
		public Student() {
			
		}
		public Student(String hoTen, int diemJava, int diemHtml) {
			super();
			this.hoTen = hoTen;
			this.diemJava = diemJava;
			this.diemHtml = diemHtml;
		}

		public String getHoTen() {
			return hoTen;
		}

		public void setHoTen(String hoTen) {
			this.hoTen = hoTen;
		}

		public int getDiemJava() {
			return diemJava;
		}

		public void setDiemJava(int diemJava) {
			this.diemJava = diemJava;
		}

		public int getDiemHtml() {
			return diemHtml;
		}

		public void setDiemHtml(int diemHtml) {
			this.diemHtml = diemHtml;
		}

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
		public float getDiemTrungBinh() {
			return (float)(this.diemHtml + this.diemJava)/2;
		}
		
		public void display() {
			System.out.println(this.hoTen + "|" + this.diemJava + "|"+this.diemHtml + "|" + this.getDiemTrungBinh() );
		}
}
