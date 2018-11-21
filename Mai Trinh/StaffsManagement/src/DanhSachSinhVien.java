import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

	// TODO Auto-generated method stub
	/*
	 * 1.  Thêm một nhân viên vào danh sách (mỗi nhân viên cho nhập vào mã nhân viên và số 
sản phẩm). 
2.  Lấy thông tin của  tất cả nhân viên, xuất dạng bảng với các cột: mã nhân viên, số sản 
phẩm, lương, tổng kết. 
3.  Lấy tổng số nhân viên. 
4.  Lấy thông tin của các nhân viên có số sản phẩm vượt chuẩn. 
5.  Đếm số nhân viên có số sản phẩm không vượt chuẩn. 
6.  Tính tổng lương của các nhân viên vượt chuẩn. 
7.  Lấy nhân viên có số sản phẩm ít nhất. 
8.  Lấy nhân viên có lương cao nhất. 
9.  Lấy nhân viên không vượt chuẩn có lương cao nhất. 
10.  Lấy tổng lương của tất cả nhân viên. 
11.  Tìm kiếm nhân viên theo mã nhập vào, trả về nhân viên tìm thấy. 
12.  Sắp xếp mảng nhân viên tăng dần theo số sản phẩm. 
13.  Xóa 1 nhân viên tại vị trí nhập vào. 

	 */
	private ArrayList<NhanVien> ds;

	public void DanhSachNhanVien() {
		ds = new ArrayList<NhanVien>();
	}
	///Them 1 nhan vien 
	public boolean insertStaff(String maNV, int soSP) {
		NhanVien nv = new NhanVien(maNV, soSP);
		if (!ds.contains(nv)) {
			ds.add(nv);
			return true;
		}
		return false;			
	}

	///Lay thong tin nhan vien
	public void output() {
		NhanVien.XuatTieuDe();
		for (NhanVien n: ds) {
			System.out.println(n.toString());
		}
	}

	//Tong nhan vien
	public int getTongSoNhanVien() {
		return ds.size();

	}

	//
	public void getNhanVienVuotChuan() {
		NhanVien.XuatTieuDe();
		for (NhanVien n: ds) {
			if (n.coVuotChuan()) {
				System.out.println(n.toString());
			}
		}
	}

	public int getNhanVienKhongVuotChuan() {
		int dem=0;
		for (NhanVien n: ds) {
			if (!n.coVuotChuan()) {
			dem++;
			}
		}
		return dem;
	}
	
	//Tong luong nhan vien vuot chuan
	public double tongLuongNhanVienVC() {
		double sum=0;
		for (NhanVien n: ds) {
			if (n.coVuotChuan()) {
				sum=sum+500*20000+n.getSoSP()*30000;
			}
			
		}
		return sum;
	}
	
	//Lay nhan vien co so san pham it nhat
	public void getNhanVienSanPhamItNhat() {
		int min;
		for ( NhanVien n: ds) {
			min =n.getSoSP();
			if (n.getSoSP()<min) {
				n.soSP=min;
			}
		}
	}
}