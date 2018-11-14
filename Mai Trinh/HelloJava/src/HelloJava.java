import java.util.Scanner;
 
public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		System.out.println("Nhap a: ");
		int  a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap b: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Chon phep toan ");
		
		String op = sc.nextLine();
		int c=0;
		if (op.equals("+")) {
			c = a+b;
		}
		else if (op.equals("-")) {
			
			c=a-b;
		}
		else if (op.equals("*")) {
			c=a*b;
		}
		else {
			c=a/b;
		}
		System.out.println(c);
	}

}
