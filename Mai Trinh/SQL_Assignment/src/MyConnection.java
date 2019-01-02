

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MyConnection extends JFrame {
//	Statement stmt = null;
//	ResultSet rs= null;
	private PreparedStatement stmt;
	private ResultSet rs;
	private Connection conn;
	public JTable table;
	public void queryUpdate(String sql,String message){
		  try {
		   stmt = conn.prepareStatement(sql);
		   if(stmt.executeUpdate()==1){
		    DefaultTableModel model = (DefaultTableModel)table.getModel();
		    model.setRowCount(0);
		    showTable();
		    JOptionPane.showMessageDialog(null, message + " Successfully!");
		   }
		  } catch (SQLException se) {
		   se.printStackTrace();
		  }
		 }
	 public void showTable(){
		  ArrayList <SinhVien> list = getArrayList();
		  DefaultTableModel model = (DefaultTableModel)table.getModel();
		  Object[] cols = new Object[4];
		  for (int i = 0; i < list.size(); i++) {
		   cols[0] = list.get(i).getIDlop() ;
		   cols[1] = list.get(i).getTenSV();
		  
		   model.addRow(cols);
		  }
		 }
		 
	private ArrayList<SinhVien> getArrayList() {
		// TODO Auto-generated method stub
		return null;
	}
	public MyConnection() {
		super ("Quản lý sinh viên- Oracle");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		//pnBorder để tạo vùng biên
		JPanel pnNorth=new JPanel(); 
		JLabel jlbName0 = new JLabel("Chương trình quản lý sinh viên");
		pnBorder.add(pnNorth,BorderLayout.NORTH);
		pnNorth.add(jlbName0);
		JPanel pnCenter=new JPanel();		
		pnCenter.setLayout(new GridLayout(3,2));
		pnBorder.add(pnCenter,BorderLayout.CENTER);



		JLabel jlbName1 = new JLabel("Mã sinh viên: ");
		pnCenter.add(jlbName1);
		JTextField jtxtMaSV = new JTextField(10);
		pnCenter.add(jtxtMaSV);
		JLabel jlbName2 = new JLabel("Tên sinh viên: ");
		pnCenter.add(jlbName2);		
		JTextField jtxtTenSV = new JTextField(10);
		pnCenter.add(jtxtTenSV);
		JLabel jlbName3 = new JLabel("Lớp: ");
		pnCenter.add(jlbName3);
		JTextField jtxtLop = new JTextField(10);
		pnCenter.add(jtxtLop);


		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlihocsinh","root","");
			//stmt = con.createStatement();
			rs = stmt.executeQuery("select * from students");

		}catch (Exception ex) {
			System.out.println(ex);
		}
		JPanel pnSouth = new JPanel();	
		JButton btn1 = new JButton("Xem");
		pnSouth.add(btn1);
		btn1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				try {
					if (rs.next()){
						jtxtMaSV.setText(rs.getString(1));
						jtxtTenSV.setText(rs.getString(2));
						jtxtLop.setText(rs.getString(3));
					}
				}catch (Exception ex) {
					System.out.println(ex);
				}
			}}
				);

		JButton btn2 = new JButton("Thêm");
		pnSouth.add(btn2);
		btn2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				try {
					String sqlInsert ="insert into students values(\""+jtxtMaSV.getText() +"\",\""+ jtxtTenSV.getText() +"\", \""+ jtxtLop.getText()+"\" )"; ;

					stmt.executeUpdate(sqlInsert);
					rs = stmt.executeQuery("select * from students");

				}catch (Exception ex) {
					System.out.println(ex);
				}
			}}
				);


		JButton btn3 = new JButton("Sửa");
		pnSouth.add(btn3);
		btn3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				try {
					String sqlUpdate ="update students set Hoten_SV =' "+jtxtTenSV.getText()+"', ID_Lop='"+jtxtLop.getText()+"' where Ma_SV = '"+jtxtMaSV.getText()+"' "; 
					stmt.executeUpdate(sqlUpdate);
					rs = stmt.executeQuery("select * from students");

				}catch (Exception ex) {
					System.out.println(ex);
				}
			}}
				);

	

		JButton btn4 = new JButton("Xóa");
		pnSouth.add(btn4);
		btn4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				try {
					//String strMaSV= jtxtMaSV.getText();
					String sqlDelete ="delete from students where MaSV = '"+jtxtMaSV.getText()+"'";			
					queryUpdate(sqlDelete, "Xóa");
					stmt.executeUpdate(sqlDelete);
					rs = stmt.executeQuery("select * from students");

				}catch (Exception ex) {
					System.out.println(ex);
				}
			}}
				);

		JButton btn5 = new JButton("Thoát");
		pnSouth.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


			}});



		pnBorder.add(pnSouth,BorderLayout.SOUTH); 
		getContentPane().add(pnBorder); 
	}

	public static void main(String[] args) { 
		MyConnection ui=new MyConnection();  

		ui.setSize(600, 400);  		
		ui.setLocationRelativeTo(null);  // set vị trí chạy ra giữa màn hình
		ui.setVisible(true); // nếu set false thì chương trình vẫn chạy nhưng không hiển thị
	}

}
