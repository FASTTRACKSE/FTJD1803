package project;

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

public class SinhVienDao {

	private final static String STUDENT_FILE_NAME = "sinhvien.txt";

	public void write(List<SinhVien> studentsList) throws IOException {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(STUDENT_FILE_NAME);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(studentsList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{


		}

	}
	// Doc danh sach thong tin sinh vien
	public List<SinhVien> read(){
		List<SinhVien> listSinhVien = new ArrayList<>();
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream(new File(STUDENT_FILE_NAME));
			objectInputStream = new ObjectInputStream(fileInputStream);
			listSinhVien = (List<SinhVien>) objectInputStream.readObject();
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
		return listSinhVien;

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
