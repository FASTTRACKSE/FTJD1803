import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.xml.ws.handler.MessageContext;
	public class MyWindow extends JFrame{
		 public MyWindow(){
		 super("Demo Windows");
		 JPanel pnBorder=new JPanel();
		 pnBorder.setLayout(new BorderLayout());
		 JPanel pnTren=new JPanel();
		 pnBorder.add(pnTren,BorderLayout.NORTH);
		 JLabel jlbtitle = new JLabel("Chương Trình Quản Lý Sinh Viên");
		 pnTren.add(jlbtitle);
		 
		 JPanel pnCenter=new JPanel();
		 pnCenter.setLayout(new GridLayout(3, 2));
		 pnCenter.setBackground(Color.WHITE);
		 pnBorder.add(pnCenter,BorderLayout.CENTER);

		 JLabel jlbMSV = new JLabel("Mã Sinh Viên:");
		 JTextField jtfMSV = new JTextField(10);
		 pnCenter.add(jlbMSV);
		 pnCenter.add(jtfMSV);
		 
		 JLabel jlbName = new JLabel("Tên Sinh Viên:");
		 JTextField jtfName = new JTextField(10);
		 pnCenter.add(jlbName);
		 pnCenter.add(jtfName);
		 JLabel jlbTuoi = new JLabel("Tuổi:");
		 JTextField jtfTuoi = new JTextField(10);
		 pnCenter.add(jlbTuoi);
		 pnCenter.add(jtfTuoi);


		
		 JPanel pnDuoi=new JPanel();
		 pnBorder.add(pnDuoi,BorderLayout.SOUTH);
		 JButton jbttiep = new JButton("Tiếp");
		 pnDuoi.add(jbttiep);
		 
		 JButton jbtluu = new JButton("Lưu");
		 pnDuoi.add(jbtluu);
		 
		 JButton jbtmoi = new JButton("Mới");
		 pnDuoi.add(jbtmoi);
		 
		 JButton jbtxoa = new JButton("Xóa");
		 pnDuoi.add(jbtxoa);
		 
		 JButton jbtthoat = new JButton("Thoát");
		 pnDuoi.add(jbtthoat);
		 
		 JButton jbtsau = new JButton("Sau");
		 pnDuoi.add(jbtsau);
		 
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydaotao", "root", "");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from students");
				 jbttiep.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								if(rs.next()) {
									jtfMSV.setText(rs.getString(1));
									jtfName.setText(rs.getString(2));
									jtfTuoi.setText(rs.getString(4));
								}
							} catch (Exception e2) {
								// TODO: handle exception
							}
							
						}
					});
				 
				 jbtsau.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								if(rs.previous()) {
									jtfMSV.setText(rs.getString(1));
									jtfName.setText(rs.getString(2));
									jtfTuoi.setText(rs.getString(4));
								}
							} catch (Exception e2) {
								// TODO: handle exception
							}
							
						}
					});
				 
				 jbtmoi.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								
									jtfMSV.setText("");
									jtfName.setText("");
									jtfTuoi.setText("");
							} catch (Exception e2) {
								// TODO: handle exception
							}
							
						}
					});
				 
				 jbtluu.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								String nhap = "INSERT INTO students(maSV, hoTenSV,idLop,Tuoi) VALUES ('"+jtfMSV.getText()+"','"+jtfName.getText()+"','',"+Integer.parseInt(jtfTuoi.getText())+")";
								stmt.executeUpdate(nhap);
							} catch (Exception e2) {
								System.out.println(e2);
							}
							
						}
					});
				 
				 jbtxoa.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							try {
								String xoa = "DELETE FROM students WHERE maSV=\""+jtfMSV.getText()+"\"";
								stmt.executeUpdate(xoa);
								JOptionPane.showMessageDialog(null, "Xoa thanh cong!");
							} catch (Exception e3) {
								System.out.println(e3);
							}
							
						}
					});
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 

			
		 getContentPane().add(pnBorder);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 
		 }
		 public static void main(String[] args) {
			 MyWindow ui=new MyWindow();
			 ui.setSize(400, 300);
			 ui.setLocationRelativeTo(null);
			 ui.setVisible(true);
		}
		}
