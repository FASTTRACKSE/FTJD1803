
public class BookException extends Exception{
			String err;
			
			public BookException() {
				
			}

			public BookException(String Err) {
				super();
				err = Err;
			}

			@Override
			public String toString() {
				return this.err;
			}
			
			static void CheckSach (String tenSach ) throws BookException{
				if(tenSach.isEmpty()) {
					throw new BookException("Ten sach rong, vui long nhap lai!!!");
				}
				
			}
			
			static void CheckNam (int namSX) throws BookException{
				 
			}
}
