import java.util.Comparator;

public class SapXepSachTheoDonGia implements Comparator<Sach>{

	@Override
	public int compare(Sach o1, Sach o2) {
		// TODO Auto-generated method stub
		if(o1.getDonGia()>o2.getDonGia()) {
			return 1;
		}
		return -1;
	}

}
