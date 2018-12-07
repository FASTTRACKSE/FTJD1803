package quanlysinhvien;

import java.util.Comparator;

public class SapXepTenSinhVien implements Comparator<SinhVien>{

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		// TODO Auto-generated method stub
		return o1.getTen().compareTo(o2.getTen());
	}
	
}
