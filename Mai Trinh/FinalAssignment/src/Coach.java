import java.util.ArrayList;
import java.util.Scanner;

public class Coach extends Person {
		String quocTich;
		
		
		
		
		
		public Coach() {
			super();
		}



		public Coach(String quocTich) {
			super();
			this.quocTich = quocTich;
			
		}

		

		public String getQuocTich() {
			return quocTich;
		}



		public void setQuocTich(String quocTich) {
			this.quocTich = quocTich;
		}



	

		Scanner sc = new Scanner(System.in);
		public void nhap(ArrayList<Person> arr) {
			super.nhap(arr);
			System.out.println("Nhap quoc tich: ");
			this.quocTich=sc.nextLine();
			
			
		}

		
		public double getPhuCap() {
	
			return  (0.2 * getLuong());
		}

		public String toString() {
			return "HLV: "+super.toString()+"\tQuoc tich: "+quocTich+"\tPhu cap: "+getPhuCap();
		}
		
}
