import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ViDu2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String txt = "Lop Java";
		FileOutputStream fos = new FileOutputStream("t.txt");
		byte [] txtByte = txt.getBytes();
		fos.write(txtByte);

		FileInputStream fis = new FileInputStream("t.txt");
		int c;
		while ((c= fis.read())!= -1) {
			System.out.println(c); 

		}
	}
}


