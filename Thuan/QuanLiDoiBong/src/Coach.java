import java.util.Scanner;

public class Coach extends Person{
			double phuCap;
			
			public Coach() {
				
			}

			public Coach(double phuCap) {
				super();
				this.phuCap = phuCap;
			}

			public double getPhuCap() {
				return phuCap;
			}

			public void setPhuCap(double phuCap) {
				this.phuCap = phuCap;
			}
			public void nhap() {
				Scanner scanner = new Scanner(System.in);

				{while(true){ System.out.printf("Nhap ho va ten huan luyen vien: ");
				  this.hoTen = scanner.nextLine();
				try {
					BongDaException.CheckSach(hoTen);
					break;
				}
				catch(Exception e){
					System.out.println(e);
				}
				}}
				System.out.printf("Nhap Que Quan: ");
				this.quocTich = scanner.nextLine();
				System.out.printf("Nhap ten Cau Lac Bo: ");
				this.cauLB = scanner.nextLine();
				
				System.out.print("Nhap Tuoi: ");
				this.tuoi = Byte.parseByte(scanner.nextLine());
				
				
				System.out.print("Nhap so luong:");
				this.luong = Integer.parseInt(scanner.nextLine());
				System.out.print("phu cap:");
				this.phuCap = Integer.parseInt(scanner.nextLine());
				
			}
			public void xuat() {
				System.out.println(this.hoTen +"||"+ this.cauLB +"||"+ this.tuoi +"||" +this.luong+"|"+ this.phuCap);
			}
			public double tinhLuong() {
				return this.getLuong() * 10 + this.getPhuCap() * 20;
			}
}
