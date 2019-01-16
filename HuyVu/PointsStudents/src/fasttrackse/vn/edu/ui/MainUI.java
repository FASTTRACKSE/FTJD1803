package fasttrackse.vn.edu.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.beans.PropertyVetoException;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class MainUI extends JFrame {
	
	JTabbedPane jTabbedPane;
	JButton btnSinhVien,btnGiaoVien,btnDiem,btnKhoa,btnLop,btnMon,
			btnThemSinhVien,btnSuaSinhVien,btnXoaSinhVien,btnThoat;
	
	JInternalFrame jifSinhVien;
	
	DefaultTableModel dtmSinhVien;
	JTable tblSinhVien;

	JTextField txtMaSinhVien,txtHoTen,txtDiaChi,txtSdt;
	JComboBox jcbMaLop,jcbMaKhoa,jcbHeDaoTao;
	JDateChooser jdcNgaySinh;
	JRadioButton jrbNam,jrbNu;
	
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
		
		// Tab Trang chủ
		JPanel pnTrangChu = new JPanel();
		jTabbedPane.addTab("Trang chủ",new ImageIcon("images/home.png") ,pnTrangChu);
		
		pnTrangChu.setLayout(new BorderLayout());
		JPanel pnHinhNen = new JPanel();
		JLabel lblHinhNen = new JLabel(new ImageIcon("images/hinhnen.jpg"));
		pnHinhNen.add(lblHinhNen);
		pnTrangChu.add(pnHinhNen);
		
		// Tab quản lý
		JPanel pnQuanLy = new JPanel();
		jTabbedPane.addTab("Quản lý",new ImageIcon("images/managens.png") ,pnQuanLy);
		
		pnQuanLy.setLayout(new BorderLayout());
		JPanel pnNorth = new JPanel();
		JPanel pnCenter = new JPanel();
		JPanel pnSouth = new JPanel();
		pnSouth.setLayout(new FlowLayout(FlowLayout.LEFT));

		pnQuanLy.add(pnNorth,BorderLayout.NORTH);
		pnQuanLy.add(pnCenter,BorderLayout.CENTER);
		pnQuanLy.add(pnSouth,BorderLayout.SOUTH);

		pnNorth.setLayout(new BorderLayout());
		JPanel pnChiTiet = new JPanel();
		pnNorth.add(pnChiTiet,BorderLayout.CENTER);
		JPanel pnThucHien = new JPanel();
		pnNorth.add(pnThucHien,BorderLayout.WEST);

		pnThucHien.setLayout(new BoxLayout(pnThucHien, BoxLayout.Y_AXIS));
		JPanel pnImage = new JPanel();
		JLabel lblImage = new JLabel(new ImageIcon("images/giaovu.png"));
		JLabel lblXinChaoAdmin = new JLabel("Xin chào giáo vụ");
		pnImage.add(lblImage);
		pnImage.add(lblXinChaoAdmin);
		pnThucHien.add(pnImage);

		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		JPanel pnBanner = new JPanel();
		JLabel lblBanner = new JLabel(new ImageIcon("images/admin_banner.gif"));
		pnBanner.add(lblBanner);
		pnChiTiet.add(pnBanner);
		
		pnCenter.setLayout(new BorderLayout());
		JPanel pnMenuTrai = new JPanel();
		pnCenter.add(pnMenuTrai,BorderLayout.WEST);
		JPanel pnTablePhai = new JPanel();
		pnCenter.add(pnTablePhai,BorderLayout.CENTER);
		
		pnMenuTrai.setLayout(new BoxLayout(pnMenuTrai,BoxLayout.Y_AXIS));
		pnMenuTrai.setBackground(new Color(204, 204, 255));
		JPanel pnButtonSinhVien = new JPanel();
		btnSinhVien = new JButton("Quản lý sinh viên",new ImageIcon("images/sinhvien.png"));
		pnButtonSinhVien.add(btnSinhVien);
		pnMenuTrai.add(btnSinhVien);
		
		JPanel pnButtonGiaoVien = new JPanel();
		btnGiaoVien = new JButton("Quản lý giáo viên",new ImageIcon("images/sinhvien.png"));
		pnButtonGiaoVien.add(btnGiaoVien);
		pnMenuTrai.add(btnGiaoVien);
		
		JPanel pnButtonDiem = new JPanel();
		btnDiem = new JButton("Quản lý điểm",new ImageIcon("images/sinhvien.png"));
		pnButtonDiem.add(btnDiem);
		pnMenuTrai.add(btnDiem);
		
		JPanel pnButtonKhoa = new JPanel();
		btnKhoa = new JButton("Quản lý khoa",new ImageIcon("images/sinhvien.png"));
		pnButtonKhoa.add(btnKhoa);
		pnMenuTrai.add(btnKhoa);
		
		JPanel pnButtonLop = new JPanel();
		btnLop = new JButton("Quản lý lớp",new ImageIcon("images/sinhvien.png"));
		pnButtonLop.add(btnLop);
		pnMenuTrai.add(btnLop);
		
		JPanel pnButtonMon = new JPanel();
		btnMon = new JButton("Quản lý môn",new ImageIcon("images/sinhvien.png"));
		pnButtonMon.add(btnMon);
		pnMenuTrai.add(btnMon);
		
		
		pnTablePhai.setLayout(new BorderLayout());
		JPanel pnjifSinhVien = new JPanel();
		jifSinhVien = new JInternalFrame("Quản lý sinh viên",true,true,true);
		jifSinhVien.add(pnjifSinhVien);
		jifSinhVien.setVisible(true);
		pnTablePhai.add(jifSinhVien);
		
		pnjifSinhVien.setLayout(new BorderLayout());
		
		JPanel pnTopSV = new JPanel();
		JPanel pnCenterSV = new JPanel();
		JPanel pnSouthSV = new JPanel();
		
		pnjifSinhVien.add(pnTopSV,BorderLayout.NORTH);
		pnjifSinhVien.add(pnCenterSV,BorderLayout.CENTER);
		pnjifSinhVien.add(pnSouthSV,BorderLayout.SOUTH);
		
		pnTopSV.setLayout(new BorderLayout());
		JPanel pnNhapSinhVien = new JPanel();
		JLabel lblNhapSinhVien = new JLabel("Nhập sinh viên");
		pnNhapSinhVien.add(lblNhapSinhVien);
		pnTopSV.add(pnNhapSinhVien);
		
		pnCenterSV.setLayout(new BorderLayout());
		dtmSinhVien = new DefaultTableModel();
		dtmSinhVien.addColumn("Id sinh viên");
		dtmSinhVien.addColumn("Họ tên");
		dtmSinhVien.addColumn("Id lớp");
		dtmSinhVien.addColumn("Id khoa");
		dtmSinhVien.addColumn("Hệ đào tạo");
		dtmSinhVien.addColumn("Ngày sinh");
		dtmSinhVien.addColumn("Địa chỉ");
		dtmSinhVien.addColumn("Giới tính");
		dtmSinhVien.addColumn("Số điện thoại");
		tblSinhVien = new JTable(dtmSinhVien);
		JScrollPane scTable = new JScrollPane(tblSinhVien,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnCenterSV.add(scTable,BorderLayout.CENTER);
		
		pnSouthSV.setLayout(new BorderLayout());
		JPanel pnThongTinTrai = new JPanel();
		pnSouthSV.add(pnThongTinTrai,BorderLayout.WEST);
		JPanel pnThongTinGiua = new JPanel();
		pnSouthSV.add(pnThongTinGiua,BorderLayout.CENTER);
		JPanel pnThongTinPhai = new JPanel();
		pnSouthSV.add(pnThongTinPhai,BorderLayout.EAST);
		
		pnThongTinTrai.setLayout(new BoxLayout(pnThongTinTrai,BoxLayout.Y_AXIS));
		JPanel pnMaSinhVien = new JPanel();
		JLabel lblMaSinhVien = new JLabel("Mã sinh viên :");
		txtMaSinhVien = new JTextField(15);
		pnMaSinhVien.add(lblMaSinhVien);
		pnMaSinhVien.add(txtMaSinhVien);
		pnThongTinTrai.add(pnMaSinhVien);
		
		JPanel pnHoTen = new JPanel();
		JLabel lblHoTen = new JLabel("Họ tên :");
		txtHoTen = new JTextField(15);
		pnHoTen.add(lblHoTen);
		pnHoTen.add(txtHoTen);
		pnThongTinTrai.add(pnHoTen);
		
		JPanel pnMaLop = new JPanel();
		JLabel lblMaLop = new JLabel("Mã lớp :");
		jcbMaLop = new JComboBox<>();
		jcbMaLop.setPreferredSize(new Dimension(150, 20));
		pnMaLop.add(lblMaLop);
		pnMaLop.add(jcbMaLop);
		pnThongTinTrai.add(pnMaLop);
		
		
		JPanel pnMaKhoa = new JPanel();
		JLabel lblMaKhoa = new JLabel("Mã khoa :");
		jcbMaKhoa = new JComboBox<>();
		jcbMaKhoa.setPreferredSize(new Dimension(150, 20));
		pnMaKhoa.add(lblMaKhoa);
		pnMaKhoa.add(jcbMaKhoa);
		pnThongTinTrai.add(pnMaKhoa);
		
		JPanel pnHeDaoTao = new JPanel();
		JLabel lblHeDaoTao = new JLabel("Hệ đào tạo :");
		jcbHeDaoTao = new JComboBox<>();
		jcbHeDaoTao.setPreferredSize(new Dimension(150, 20));
		pnHeDaoTao.add(lblHeDaoTao);
		pnHeDaoTao.add(jcbHeDaoTao);
		pnThongTinTrai.add(pnHeDaoTao);
		
		pnThongTinGiua.setLayout(new BoxLayout(pnThongTinGiua, BoxLayout.Y_AXIS));
		JPanel pnNgaySinh = new JPanel();
		JLabel lblNgaySinh = new JLabel("Ngày sinh :");
		jdcNgaySinh = new JDateChooser();
		jdcNgaySinh.setPreferredSize(new Dimension(150, 20));
		pnNgaySinh.add(lblNgaySinh);
		pnNgaySinh.add(jdcNgaySinh);
		pnThongTinGiua.add(pnNgaySinh);

		JPanel pnDiaChi = new JPanel();
		JLabel lblDiaChi = new JLabel("Địa chỉ :");
		txtDiaChi = new JTextField(15);
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(txtDiaChi);
		pnThongTinGiua.add(pnDiaChi);
		
		JPanel pnGioiTinh = new JPanel();
		JLabel lblGioiTinh = new JLabel("Giới tính :");
		jrbNam = new JRadioButton("Nam");
		jrbNu = new JRadioButton("Nữ");
		pnGioiTinh.add(lblGioiTinh);
		pnGioiTinh.add(jrbNam);
		pnGioiTinh.add(jrbNu);
		pnThongTinGiua.add(pnGioiTinh);
		
		JPanel pnSoDienThoai = new JPanel();
		JLabel lblSoDienThoai = new JLabel("Số điện thoại :");
		txtSdt = new JTextField(15);
		pnSoDienThoai.add(lblSoDienThoai);
		pnSoDienThoai.add(txtSdt);
		pnThongTinGiua.add(pnSoDienThoai);
		
		
		pnThongTinPhai.setLayout(new BoxLayout(pnThongTinPhai, BoxLayout.Y_AXIS));
		JPanel pnButtonThem = new JPanel();
		btnThemSinhVien = new JButton("Thêm",new ImageIcon("images/new.png"));
		pnButtonThem.add(btnThemSinhVien);
		pnThongTinPhai.add(pnButtonThem);
		
		JPanel pnButtonSua = new JPanel();
		btnSuaSinhVien = new JButton("Sửa",new ImageIcon("images/edit.png"));
		pnButtonSua.add(btnSuaSinhVien);
		pnThongTinPhai.add(pnButtonSua);
		
		JPanel pnButtonXoa = new JPanel();
		btnXoaSinhVien = new JButton("Xóa",new ImageIcon("images/remove.png"));
		pnButtonXoa.add(btnXoaSinhVien);
		pnThongTinPhai.add(pnButtonXoa);
		
		JPanel pnButtonThoat = new JPanel();
		btnThoat = new JButton("Thoát",new ImageIcon("images/exit.png"));
		pnButtonThoat.add(btnThoat);
		pnThongTinPhai.add(pnButtonThoat);
		
		
		lblHoTen.setPreferredSize(lblMaSinhVien.getPreferredSize());
		lblMaLop.setPreferredSize(lblMaSinhVien.getPreferredSize());
		lblMaKhoa.setPreferredSize(lblMaSinhVien.getPreferredSize());
		lblHeDaoTao.setPreferredSize(lblMaSinhVien.getPreferredSize());
		
		lblNgaySinh.setPreferredSize(lblSoDienThoai.getPreferredSize());
		lblDiaChi.setPreferredSize(lblSoDienThoai.getPreferredSize());
		lblGioiTinh.setPreferredSize(lblSoDienThoai.getPreferredSize());
		
		
		
//		JPanel pnJIFSinhVien = new JPanel();
//		pnJIFSinhVien.setLayout(new BoxLayout(pnJIFSinhVien, BoxLayout.Y_AXIS));
//		JLabel lblSinhVien = new JLabel("Nhập Sinh Viên");
//		lblSinhVien.setForeground(Color.BLUE);
//		Font font = new Font("arial", Font.ITALIC, 20);
//		lblSinhVien.setFont(font);
//		pnJIFSinhVien.add(lblSinhVien);
//		dtmSinhVien = new DefaultTableModel();
//		dtmSinhVien.addColumn("Id sinh viên");
//		dtmSinhVien.addColumn("Họ tên");
//		dtmSinhVien.addColumn("Id lớp");
//		dtmSinhVien.addColumn("Id khoa");
//		dtmSinhVien.addColumn("Hệ đào tạo");
//		dtmSinhVien.addColumn("Ngày sinh");
//		dtmSinhVien.addColumn("Địa chỉ");
//		dtmSinhVien.addColumn("Giới tính");
//		dtmSinhVien.addColumn("Số điện thoại");
//		tblSinhVien = new JTable(dtmSinhVien);
//		JScrollPane scTable = new JScrollPane(tblSinhVien,
//				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//		pnJIFSinhVien.add(scTable,BorderLayout.CENTER);
//		
//		JPanel pnMaSinhVien = new JPanel();
//		JLabel lblMaSinhVien = new JLabel("Mã sinh viên :");
//		txtMaSinhVien = new JTextField(15);
//		pnMaSinhVien.add(lblMaSinhVien);
//		pnMaSinhVien.add(txtMaSinhVien);
//		
//		JPanel pnHoSinhVien = new JPanel();
//		JLabel lblHoSinhVien = new JLabel("Họ sinh viên :");
//		txtHoTen = new JTextField(15);
//		pnHoSinhVien.add(lblHoSinhVien);
//		pnHoSinhVien.add(txtHoTen);
//		
//		
//		jifSinhVien = new JInternalFrame("Quản lý sinh viên",true,true,true);
//		jifSinhVien.add(pnJIFSinhVien);
//		jifSinhVien.add(pnMaSinhVien);
//		jifSinhVien.add(pnHoSinhVien);
//		jifSinhVien.setVisible(true);
//		pnTablePhai.add(jifSinhVien);
		
		
		
		// Tab xem điểm
		JPanel pnXemDiem = new JPanel();
		jTabbedPane.addTab("Xem điểm",new ImageIcon("images/view.png") ,pnXemDiem);
		
		// Tab tìm kiếm
		JPanel pnTimKiem = new JPanel();
		jTabbedPane.addTab("Tìm kiếm", new ImageIcon("images/search.png"),pnTimKiem);
		
	}
	
	public void showWindow() {
		
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
