package SinhVien;

abstract public class SinhVienFPT {
	public String hoTen;
	public String nganh;

	abstract public double getDiem();

	public String getHocLuc() {
		if (getDiem() >= 9)
		{
			return "XuatXac";
			
		}
		if (getDiem() >= 7.5 && getDiem() < 9)
			return "Gioi";
		
		if (getDiem() >= 6.5 && getDiem() < 7.5)
		{
			return "Kha";
		}
		if (getDiem() >= 5 && getDiem() < 6.5)
		{
			return "Trung Binh";
		}
		if (getDiem() < 5)
		{
			return "Yeu";
		}
		return "";
	}
	public void xuat()
	{
		System.out.println(this.getHocLuc());
	}
}
