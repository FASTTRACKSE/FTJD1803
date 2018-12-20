//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement;

import java.sql.*;

public class MyConnection {
	public static void main(String arg[]) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","");
		Statement stmt =  con.createStatement();


		ResultSet rs = stmt.executeQuery("select * from lop");
		//ResultSet a = ((java.sql.Statement) stmt).executeUpdate("insert into lop values(\"183\", \"18T3\")");
		
		/*
		 * SELECT Orders.OrderID, Customers.CustomerName
		FROM Orders
		INNER JOIN Customers ON Orders.CustomerID = Customers.CustomerID;
		 */
		//them du lieu vao csdl cho cac bang
		while (rs.next()) {

		System.out.print(rs.getString(1)+":	");
		System.out.println(rs.getString(2));
		
		}
		
		ResultSet rs1 = stmt.executeQuery("select hoTen, NgaySinh, TenLop from lop inner join sv where lop.MaLop = sv.MaLop");
		//stmt.executeUpdate("insert into lop values(\"1224\", \"Dien tu\")");
		
	
		while (rs1.next()) {
			System.out.println((rs1.getString(1)+"	"+rs1.getString(2)+"	"+rs1.getString(3)));
			//System.out.println();
			
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		}
}
