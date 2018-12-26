package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
import javax.swing.table.DefaultTableModel;

import fasttrackse.vn.edu.connection.SachService;
import fasttrackse.vn.edu.model.Sach;

public class TimKiemUI extends JFrame{
	
	JTextField txtTimKiem;
	JButton btnBatDauTim;
	DefaultTableModel dtmSach;
	JTable tblSach;

	public TimKiemUI(String title) {
		super(title);
		addControls();
		addEvents();
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		btnBatDauTim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				xuLyTimKiem();
				
			}
		});
		
	}

	protected void xuLyTimKiem() {
		// TODO Auto-generated method stub
		SachService sachService = new SachService();
		ArrayList<Sach> dsSach = sachService.timSachTheoNhaXuatBan(txtTimKiem.getText());
		dtmSach.setRowCount(0);
		for(Sach s :dsSach) {
			Vector<Object> vec = new Vector<Object>();
			vec.add(s.getMaSach());
			vec.add(s.getTenSach());
			vec.add(s.getMaNhaXuatBan());
			vec.add(s.getSoTrang());
			dtmSach.addRow(vec);
		}
	}

	private void addControls() {
		// TODO Auto-generated method stub
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		pnNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblNhap = new JLabel("Nhap sach can tim :");
		txtTimKiem = new JTextField(50);
		btnBatDauTim = new JButton("Tim kiem");
		pnNorth.add(lblNhap);
		pnNorth.add(txtTimKiem);
		pnNorth.add(btnBatDauTim);
		con.add(pnNorth,BorderLayout.NORTH);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BorderLayout());
		dtmSach = new DefaultTableModel();
		dtmSach.addColumn("Ma sach");
		dtmSach.addColumn("Ten sach");
		dtmSach.addColumn("Nha xuat ban");
		tblSach = new JTable(dtmSach);
		
		JScrollPane scTable = new JScrollPane
				(tblSach,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
		pnCenter.add(scTable,BorderLayout.CENTER);
		con.add(pnCenter,BorderLayout.CENTER);
		
		TitledBorder titledBorderTimKiem = new TitledBorder
				(BorderFactory.createLineBorder(Color.RED),"Thong tin tim kiem ");
		pnNorth.setBorder(titledBorderTimKiem);
		
		TitledBorder titledBorderTableTk = new TitledBorder
				(BorderFactory.createLineBorder(Color.BLUE),"Danh sach  ");
		pnCenter.setBorder(titledBorderTableTk);
		
		
		
	}
	
	public void showWindow() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
