import java.util.Scanner;

public class Sach {
			String tenSach, tacGia, tenNXB;
			int namSX;
			double donGia;
			
			public Sach() {
				
			}

			public Sach(String tenSach, String tacGia, String tenNXB, int namSX, double donGia) {
				super();
				this.tenSach = tenSach;
				this.tacGia = tacGia;
				this.tenNXB = tenNXB;
				this.namSX = namSX;
				this.donGia = donGia;
			}

			public String getTenSach() {
				return tenSach;
			}

			public void setTenSach(String tenSach) {
				this.tenSach = tenSach;
			}

			public String getTacGia() {
				return tacGia;
			}

			public void setTacGia(String tacGia) {
				this.tacGia = tacGia;
			}

			public String getTenNXB() {
				return tenNXB;
			}

			public void setTenNXB(String tenNXB) {
				this.tenNXB = tenNXB;
			}

			public int getNamSX() {
				return namSX;
			}

			public void setNamSX(int namSX) {
				this.namSX = namSX;
			}

			public double getDonGia() {
				return donGia;
			}

			public void setDonGia(double donGia) {
				this.donGia = donGia;
			}
			
			public void input() {
				//Nhap du lieu sach vao kho
				Scanner scanner = new Scanner(System.in);

				{while(true){ System.out.printf("Nhap ten sach: ");
				  this.tenSach = scanner.nextLine();
				try {
					BookException.CheckSach(tenSach);
					break;
				}
				catch(Exception e){
					System.out.println(e);
				}
				}}
				System.out.printf("Nhap ten tac gia: ");
				this.tacGia = scanner.nextLine();
				System.out.printf("Nhap ten Nha Xuat Ban: ");
				this.tenNXB = scanner.nextLine();
				
				System.out.print("Nhap Nam Xuat Ban: ");
				this.namSX = Integer.parseInt(scanner.nextLine());
				
				System.out.print("Nhap don gia: ");
				this.donGia = Integer.parseInt(scanner.nextLine());
			}
			
			public void display() {
				System.out.println(this.tenSach + "||" + this.tacGia +"||" + this.tenNXB + "||" + this.namSX +"||" + this.donGia);
			}
}
