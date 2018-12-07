package sinhvienfpt;

abstract public class SinhVienFpt {
	private String hoTen;
	private String nganh;
	private double diem;
	public String hocLuc;

	public SinhVienFpt() {

	}

	public SinhVienFpt(String hoTen, String nganh, double diem, String hocLuc) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
		this.diem = diem;
		this.hocLuc = hocLuc;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	abstract double getDiem();

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getHocLuc() {
		return hocLuc;
	}

	public void setHocLuc(String hocLuc) {
		if (this.getDiem() >= 9) {
			System.out.println("Xuat sac");
		}else if (this.getDiem()>=7.5 && this.getDiem()<9) {
			System.out.println("Gioi");
		}else if(this.getDiem()>=6.5 && this.getDiem()<7.5) {
			System.out.println("Kha");
		}else if(this.getDiem()>=5 && this.getDiem()<6.5) {
			System.out.println("Trung binh");
		}else if(this.getDiem()<5) {
			System.out.println("Yeu");
		}
	}

	public void xuat() {
		System.out.println(" Ho ten :" + this.hoTen + " Nganh : "+this.nganh + " Hoc luc : "+this.getHocLuc());
	}


}
