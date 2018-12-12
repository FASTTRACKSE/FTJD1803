
public class BongDaException extends Exception {
				String err;
				
				public BongDaException() {
					
				}
			
				public BongDaException(String Err) {
					super();
					err = Err;
				}
			
				@Override
				public String toString() {
					return this.err;
				}
				
				static void CheckSach (String hoTen ) throws BongDaException{
					if(hoTen.isEmpty()) {
						throw new BongDaException("Ten sach rong, vui long nhap lai!!!");
					}
					
				}
	
}
