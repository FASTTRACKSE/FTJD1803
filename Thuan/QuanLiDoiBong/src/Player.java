import java.util.Scanner;

public class Player extends Person{
				
				String viTriCB;
				double thuong;
				
				public Player() {
					
				}

				public Player(String viTriCB, double thuong) {
					super();
					this.viTriCB = viTriCB;
					this.thuong = thuong;
				}

				public String getViTriCB() {
					return viTriCB;
				}

				public void setViTriCB(String viTriCB) {
					this.viTriCB = viTriCB;
				}

				public double getThuong() {
					return thuong;
				}

				public void setThuong(double thuong) {
					this.thuong = thuong;
				}
				
				public void input() {
					Scanner scanner = new Scanner(System.in);

					{while(true){ System.out.printf("Nhap ho va ten cau thu: ");
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
					
					System.out.print("Nhap vi tri choi bong: ");
					this.viTriCB = scanner.nextLine();
					System.out.print("Nhap so luong:");
					this.luong = Integer.parseInt(scanner.nextLine());
					System.out.print("tien thuong:");
					this.thuong = Integer.parseInt(scanner.nextLine());
					
				}
				public void xuat() {
					System.out.println(this.hoTen +"||"+ this.cauLB +"||"+ this.tuoi +"||" + this.viTriCB+"||"+this.luong+"|"+ this.thuong);
				}
				public double tinhLuong() {
					return (this.getThuong() *0.1);
				}
}
