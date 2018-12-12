
public class GiaoDichException extends Exception{
	private String mgs;

	public String getMsg() {
		return mgs;
	}

	public GiaoDichException(String msg) {
		this.mgs = msg;
	}
	
	public String toString() {
		return mgs;
	}
	
	static void checkmaGDich(int maGDich) throws GiaoDichException {
		if (maGDich <0) {
			throw new GiaoDichException("Yeu cau nhap lai!");
		}
		
	}
	
	
}
