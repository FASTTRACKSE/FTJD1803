package javaswing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class MyWindow extends JFrame{ 
	public MyWindow(){   
		super("BorderLayout");   
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		//pnBorder để tạo vùng biên
		JPanel pnNorth=new JPanel(); 
		pnNorth.setBackground(Color.RED);
		pnBorder.add(pnNorth,BorderLayout.NORTH);
		
		JPanel pnSouth=new JPanel(); 
		pnSouth.setBackground(Color.RED);
		pnBorder.add(pnSouth,BorderLayout.SOUTH); 
		
		JPanel pnWest=new JPanel(); 
		pnWest.setBackground(Color.BLUE); 
		pnBorder.add(pnWest,BorderLayout.WEST); 
		
		JPanel pnEast=new JPanel();
		pnEast.setBackground(Color.BLUE); 
		pnBorder.add(pnEast,BorderLayout.EAST);
		
		JPanel pnCenter=new JPanel();
		pnCenter.setBackground(Color.YELLOW);
		pnBorder.add(pnCenter,BorderLayout.CENTER);
		JLabel jlbName = new JLabel("Name");
		pnCenter.add(jlbName);
		JTextField jtxtName = new JTextField();
		jtxtName.setText("Mai Trinh");
		jtxtName.setEditable(false); // cannot fix
		
		JButton btn = new JButton("OK");
	
		pnCenter.add(jtxtName);
		pnCenter.add(btn);
		getContentPane().add(pnBorder); 
	}  
	public static void main(String[] args) { 
		MyWindow ui=new MyWindow();  
		ui.setSize(400, 300);  
		ui.setLocationRelativeTo(null);  // set vị trí chạy ra giữa màn hình
		ui.setVisible(true); // nếu set false thì chương trình vẫn chạy nhưng không hiển thị
	}
} 