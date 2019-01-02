package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class AdministratorUI extends JFrame{
	
	JTextField txtIdAdmin,txtAdminName,txtAdminPass;
	JTextField txtIdGiaoVu,txtGiaoVuName,txtGiaoVuPass;
	JTextField txtIdGiaoVien,txtGiaoVienName,txtGiaoVienPass;
	
	DefaultTableModel dtmAdmin;
	JTable tblAdmin;
	
	public AdministratorUI(String titles) {
		super(titles);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BorderLayout());

		JPanel pnNorth = new JPanel();
		JPanel pnCenter = new JPanel();
		JPanel pnSouth = new JPanel();
		pnSouth.setLayout(new FlowLayout(FlowLayout.LEFT));

		con.add(pnNorth,BorderLayout.NORTH);
		con.add(pnCenter,BorderLayout.CENTER);
		con.add(pnSouth,BorderLayout.SOUTH);
		
		pnNorth.setLayout(new BorderLayout());
		JPanel pnChiTiet = new JPanel();
		pnNorth.add(pnChiTiet,BorderLayout.CENTER);
		JPanel pnThucHien = new JPanel();
		pnNorth.add(pnThucHien,BorderLayout.WEST);
		
		pnThucHien.setLayout(new BoxLayout(pnThucHien, BoxLayout.Y_AXIS));
		JPanel pnImage = new JPanel();
		JLabel lblImage = new JLabel(new ImageIcon("images/administrator.png"));
		JLabel lblXinChaoAdmin = new JLabel("Hello Administrator");
		pnImage.add(lblImage);
		pnImage.add(lblXinChaoAdmin);
		pnThucHien.add(pnImage);
		
		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		JPanel pnBanner = new JPanel();
		JLabel lblBanner = new JLabel(new ImageIcon("images/admin_banner.gif"));
		pnBanner.add(lblBanner);
		pnChiTiet.add(pnBanner);
		
		pnCenter.setLayout(new BorderLayout());
		JTabbedPane jtpManager = new JTabbedPane();
		
		
			
	}
	
	public void showWindow() {
		this.setSize(800, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
