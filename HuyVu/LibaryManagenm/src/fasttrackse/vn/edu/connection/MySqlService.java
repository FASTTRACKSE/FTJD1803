package fasttrackse.vn.edu.connection;

import java.sql.Connection;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;



public class MySqlService {

	protected Connection connection;

	public MySqlService() {
		try {
			String sqlConnection = "jdbc:mysql://localhost/quanlysach";
			Properties properties = new Properties();
			properties.put("user", "root");
			properties.put("password", "12345678");
			Driver driver = new Driver();
			connection = driver.connect(sqlConnection, properties);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
