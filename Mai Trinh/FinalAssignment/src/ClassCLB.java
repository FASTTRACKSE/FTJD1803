//import java.util.ArrayList;
//
//public class ClassCLB {
//	String cauLacBo;
//
//	
//	public static void main(String[] args) {
//
//		ArrayList <Person> CLBList = new ArrayList<>();
//
//		Person clb= new  ();
//		for (int i=0; i<CLBList.size(); i++) {
//
//			clb.nhap(CLBList);
//			CLBList.add(clb);
//
//		}
//		
//		// Tinh ngan sach cua 1 clb
//		float sum=0;
//		for (Person ps : CLBList) { 
//			if ((ps instanceof Coach)) {
//				Coach ch = (Coach)ps;
//				sum=sum+ch.getPhuCap()+ps.getLuong();
//			}
//			else if (ps instanceof Player)	{
//				Player pl = (Player) ps; 
//				sum=sum+pl.getThuong()+ps.getLuong();
//			} 
//		}
//		
//		
//		//Duyet qua ngan sach CLBList
//		float max;
//		max= CLBList.get(0).getNganSach();
//		for (int i=0; i <CLBList.size(); i++) {
//			
//		}
//		/*
//		 * ArrayList<Club> listClubs = new ArrayList<Club>();
//for (Person ps : persons) {
//String clb = ps.getCauLacBo();
//
//boolean chk = false;
//
//for (Club cb : listClubs) {
//if (clb.equals(cb.getTen())) {
//chk = true;
//cb.tongNgansach +=ps.tinhThunhap();
//break;
//}
//}
//
//if (!chk) { 
//listClubs.add(new Club(ps.tinhThunhap(),clb));
//}	
//}
//
//float max = 0;
//for (Club cb : listClubs) {
//if(cb.tongNgansach > max) {
//max = cb.tongNgansach;
//}
//}
//System.out.println("Ngan sach lon nhat "+max);
//		 */
//		
//	}
//
//
//}
