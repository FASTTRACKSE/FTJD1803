package vonglap;

import java.util.Scanner;

public class SwtichCase {

	public void PTB1(){

		int a , b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ban hay nhap a : ");
		a = sc.nextInt();
		System.out.println("Ban hay nhap b : ");
		b = sc.nextInt();
		if ( a == 0){
			if ( b == 0) {
				System.out.println("Phuong trinh vo so nghiem");             
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			float x = (float) - b/a;
			System.out.println("Phuong trinh co nghiem duy nhat : "+ x);
		}
	}


	public void PTB2() {

		double a,b,c,x1,x2;
		double delta;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a= ");
		a=input.nextFloat();
		System.out.print("Nhap b= ");
		b=input.nextFloat();
		System.out.print("Nhap c= ");
		c=input.nextFloat();
		if(a==0){
			if(b==0){
				if(c==0){
					System.out.println("Phuong trinh vo so nghiem ");
				}
				else{
					System.out.println("Phuong trinh vo nghiem ");
				}
			}
			else{
				x1=(-c)/b;
				System.out.println("Phuong trinh co nghiem duy nhat : " + x1);
			}
		}
		else{
			delta= (b*b)-(4*a*c);
			if(delta<0){
				System.out.println("Phuong trinh vo nghiem");
			}
			if(delta==0){
				x1= -b/(2*a);
				System.out.println("Phuong trinh co nghiem duy nhat" +x1);
			}
			if(delta>0){
				x1=(-b+Math.sqrt(delta))/(2*a);
				x2=(-b-Math.sqrt(delta))/(2*a);
				System.out.println("Phuong trinh co 2 nghiem" );
				System.out.println(x1);
				System.out.println(x2);
			}
		}
	}		

	public void BangCuuChuong() {
		for(int i = 2 ; i<=10 ; i++) {
			for(int j = 1 ; j <=10 ; j++) {
				System.out.print(i + "x" + j + "=" + i*j + "\t" );
			}
			System.out.println("\n");
		}
	}

	public void TinhTienDien() {
		int soDien = 0;
		float tien;
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhập vao so điện :");
		soDien = sr.nextInt();

		if(soDien < 50) {
			tien=soDien*1000;
			System.out.println("So tien = " + tien);
		}else {
			tien = 50 * 1000 + (soDien - 50 ) * 1200;
			System.out.println("So tien = " + tien);
		}
	}

	public static void main(String[] args) {
		int a;
		Scanner sr = new Scanner(System.in);
		System.out.println("Nhap a :");
		a = sr.nextInt();
		switch (a) {
		case 1:
			System.out.println("Phuong trinh bac 1 :");
			SwtichCase m1 = new SwtichCase();
			m1.PTB1();
			break;
		case 2:
			System.out.println("Phuong trinh bac 2 :");
			SwtichCase m2 = new SwtichCase();
			m2.PTB2();
			break;
		case 3:
			System.out.println("Bang cuu chuong :");
			SwtichCase m3 = new SwtichCase();
			m3.BangCuuChuong();
			break;
		case 4:
			System.out.println("Tinh tien dien :");
			SwtichCase m4 = new SwtichCase();
			m4.TinhTienDien();
			break;
		default:
			break;
		}
	}
}


