package danhsachsinhvien;

import java.awt.event.ItemEvent;
import java.util.Scanner;



public class Student {

	String hoTen;
	float diemHtml;
	float diemJava;
	float diemTrungBinh;


	public void input() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ten sinh vien :");
		this.hoTen = scanner.nextLine();

		System.out.println("Nhap diem :");
		this.diemHtml = scanner.nextFloat();

		System.out.println("Nhap diem :");
		this.diemJava = scanner.nextFloat();

		diemTrungBinh =(float)((this.diemHtml+this.diemJava)/2);

	}
	public void output() {
		System.out.println(this.hoTen + " | " + this.diemHtml + " | " +this.diemJava+ " | " + this.diemTrungBinh);
	}

	public float sinhviengioi() {
		if(diemTrungBinh>=9) {
			return 1;
		}else {
			return 0;
		}

	}
	public float sinhVienDiemCaoNhat(Student tam) {
		if(this.diemTrungBinh > tam.diemTrungBinh) {
			return 1;
		}else {
			return 0;
		}
	}











}
