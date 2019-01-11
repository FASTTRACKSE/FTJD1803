package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainUI extends JFrame {
	
	JTabbedPane jTabbedPane;
	
	public MainUI(String titles) {
		super(titles);
		addControls();
		addEvent();
	}

	private void addEvent() {
		// TODO Auto-generated method stub
		
	}
	
	private void addControls() {
		// TODO Auto-generated method stub
		Container container = getContentPane();
		jTabbedPane = new JTabbedPane();
		container.add(jTabbedPane);
		
		JPanel pnTrangChu = new JPanel();
		jTabbedPane.add("Trang chủ", pnTrangChu);
		
		JPanel pnQuanLy = new JPanel();
		jTabbedPane.add("Quản lý", pnQuanLy);
		
		JPanel pnXemDiem = new JPanel();
		jTabbedPane.add("Xem điểm", pnXemDiem);
		
		JPanel pnTimKiem = new JPanel();
		jTabbedPane.add("Tìm kiếm", pnTimKiem);
		
	}
	
	public void showWindow() {
		
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
