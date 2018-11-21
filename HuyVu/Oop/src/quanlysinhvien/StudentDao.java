package quanlysinhvien;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class StudentDao {
	private final static String STUDENT_FILE_NAME = "student.txt";
	
	// Ghi thông tin danh sách sinh viên vào file
	
	public void write(List<Students> studentsList) throws IOException {
		
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
