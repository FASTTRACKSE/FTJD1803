
public class MyException extends Exception {

	private String mgs;

	public String getMsg() {
		return mgs;
	}

	public MyException(String msg) {
		this.mgs = msg;
	}

	public String toString() {
		return mgs;
	}

	static void checkHoTen(String tenSach)throws MyException{
		if(tenSach.isEmpty()) {
			 throw new MyException("Yeu cau nhap lai!");
		}
	}
	
	static void checktuoi(int tuoi) throws MyException {
		if (tuoi <0) {
			throw new MyException("Yeu cau nhap lai!");
		}

	}

	static void checkluong(float luong) throws MyException {
		if (luong <0) {
			throw new MyException("Yeu cau nhap lai!");
		}
		
	}

}

