package quanlysinhvien;

import java.util.Comparator;

public class SapXepDiemSinhVien implements Comparator<SinhVien>{

	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		
		if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()) {
			return 1;
		}
		return -1;
	}
	
}
