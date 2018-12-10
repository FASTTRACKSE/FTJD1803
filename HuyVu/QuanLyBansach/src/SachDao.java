import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;



public class SachDao {

	private final static String SACH_FILE_NAME = "khosach.txt";
	private final static String BAN_SACH_FILE_NAME = "bansach.txt";

	// Ghi thông tin sach vao kho vào file
	public void write(List<Sach> listSach) throws IOException {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(SACH_FILE_NAME);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(listSach);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{


		}

	}

	// Doc thong tin sach nhap vao kho
	public List<Sach> read(){
		List<Sach> listSach = new ArrayList<>();
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(new File(SACH_FILE_NAME));
			objectInputStream = new ObjectInputStream(fileInputStream);
			listSach = (List<Sach>) objectInputStream.readObject();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			closeStream(fileInputStream);
			closeStream(objectInputStream);
		}
		return listSach;

	}
	
	private void closeStream(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	private void closeStream(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}
