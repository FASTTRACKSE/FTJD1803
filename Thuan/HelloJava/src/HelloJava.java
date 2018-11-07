import java.util.Scanner;

public class HelloJava {
		public static void main(String arg[]) {
			int a;
			int b;
			int c = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap a = ");
			a = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap b = ");
			b = Integer.parseInt(sc.nextLine());
			System.out.print("Chon phep toan");
			String op = sc.nextLine();
			if(op.equals("+")) {
				c = a + b;
				
			}
			if (op.equals("-")) {
				c = a - b;
			}
			if (op.equals("*")) {
				c= a*b;
			}
			if (op.equals("/")) {
				c = a / b;
			}
					
		System.out.print(c);
		}
}
