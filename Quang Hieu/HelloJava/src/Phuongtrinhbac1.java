import java.util.Scanner;

public class Phuongtrinhbac1 {

	public static void main(String[] args) {
		int a;
		
		int b;
		int x;
		
		Scanner sc = new Scanner(System.in);
		a = Integer.parseInt(sc.nextLine());
		b = Integer.parseInt(sc.nextLine());
		if (a == 0)
		{
			if(b == 0)
			{
				System.out.println("phuong trinh vo so nghiem");
			}
			else 
			{
				System.out.println("phuong trinh vo ngihem");
			}
			
		}
		
		else 
		{
			x = -b/a;
			System.out.println(x);

		}
		
		
	
		
		

	}

}
