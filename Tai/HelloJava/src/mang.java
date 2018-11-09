import java.util.Scanner;

public class mang {
	public static void main(String[] args) {
		String hoTen[] =new String [50];
		int[] diem;
		
		String ten;
		Scanner sc= new Scanner (System.in);
		int i=0;
		while(true) {
			System.out.println("nhap ho va ten:");
			ten=sc.nextLine();
			if(ten.equals(""))break;
			hoTen[i]=ten;
			i++;
			
		}
		for(int j=0;j<i;j++)
		{
			System.out.println(hoTen[j]);
		}
	}
}
