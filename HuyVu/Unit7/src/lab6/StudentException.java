package lab6;

public class StudentException extends Exception{
	private String msg;
	public StudentException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	public String toString() {
		return " MyException " +msg;
	}
	static void checkMaSinhVien(Integer id) throws StudentException{
		if(id.equals(null)) {
			throw new StudentException("Ma khong duoc rong :");
		}
	}
	static void checkTenSinhVien(String ten) throws StudentException{
		if(ten.isEmpty()) {
			throw new StudentException("Ten khong duoc rong:");
		}
	}
	static void checkTuoi(int tuoi) throws StudentException{
		if(tuoi < 0) {
			throw new StudentException("Tuoi nho hon 0 :");
		}else if(tuoi>100) {
			throw new StudentException("Tuoi lon hon 100 :");
		}
	}
	static void checkDiem(double diem) throws StudentException {
		if (diem < 0.0 ) {
			throw new StudentException("Diem nhon hon 0 ");
		}else if (diem > 10.0){
			throw new StudentException("Diem lon hon 10 ");
		}
	}





}
