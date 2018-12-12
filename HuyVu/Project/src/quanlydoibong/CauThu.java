package quanlydoibong;

import javax.naming.NameNotFoundException;

public class CauThu extends Nguoi{
	private String queQuan;
	private int tuoi;
	private String viTriChoiBong;
	private double thuong;
	
	public CauThu() {
		
	}

	public CauThu(String queQuan, int tuoi, String viTriChoiBong,double thuong) {
		super();
		this.queQuan = queQuan;
		this.tuoi = tuoi;
		this.viTriChoiBong = viTriChoiBong;
		this.thuong = thuong;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getViTriChoiBong() {
		return viTriChoiBong;
	}

	public void setViTriChoiBong(String viTriChoiBong) {
		this.viTriChoiBong = viTriChoiBong;
	}
	
	public double getThuong() {
		return thuong;
	}

	public void setThuong(double thuong) {
		this.thuong = thuong;
	}

	public void nhap() {
		super.nhap();
		String queQuan = nhapQueQuan();
		int tuoi = nhapTuoi();
		String viTriChoiBong = nhapViTriChoiBong();
		int thuong = nhapThuong();
		
	}
	
	
	
	private String nhapQueQuan() {
		System.out.println("Nhap que quan :");
		while(true) {
			try {
				queQuan = scanner.nextLine();
				if(queQuan.isEmpty()) {
					throw new NameNotFoundException();
				}else if (queQuan.length()>40) {
					throw new Exception();

				}

				return queQuan;

			} catch (NameNotFoundException e) {
				System.out.println("Que quan khong duoc rong , vui long nhap lai :");
			} catch(Exception e) {
				System.out.println("Que quan khong dai qua 40 ky tu , vui long nhap lai :");
			}
		}
	}
	
	
	
	private int nhapTuoi() {
		System.out.println("Nhap tuoi :");
		while(true) {
			try {
				tuoi = Integer.parseInt(scanner.nextLine());
				if(tuoi<0||tuoi>100) {
					throw new NumberFormatException();
				}
				return tuoi;
			}catch(Exception e) {
				System.out.println("Nhap tuoi khong hop le , vui long nhap lai :");
			}
		}
	}
	
	private String nhapViTriChoiBong() {
		System.out.println("Nhap vi tri choi bong :");
		while(true) {
			try {
				viTriChoiBong = scanner.nextLine();
				if(viTriChoiBong.isEmpty()) {
					throw new NameNotFoundException();
				}else if (viTriChoiBong.length()>40) {
					throw new Exception();

				}

				return viTriChoiBong;

			} catch (NameNotFoundException e) {
				System.out.println("Vi tri choi bong khong duoc rong, vui long nhap lai :");
			} catch(Exception e) {
				System.out.println("Vi tri choi bong khong dai qua 40 ky tu , vui long nhap lai :");
			}
		}
	}
	
	private int nhapThuong() {
		return (int) (thuong=getLuong()*10/100);
	}
	
	public double tinhLuong() {
		return (double)(this.getLuong()+this.getThuong());
	}

	@Override
	public String toString() {
		return "CauThu [hoTen = " +this.getHoTen()+ " queQuan = " + queQuan + ", cauLacBo= " +this.getCauLacBo()+ ", tuoi= " + tuoi + ", viTriChoiBong="
				+ viTriChoiBong + ", thuong=" + thuong + "]";
	}
	
	public void xuat() {
		System.out.println("Ho va ten :"+this.getHoTen()+"Que Quan :"+this.getQueQuan()+"Tuoi :"+this.getTuoi()+"Cau Lac Bo"+this.getCauLacBo()+"Vi tri choi bong :"+this.getViTriChoiBong());
	}
	
}
