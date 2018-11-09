
public class Bangcuuchuong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		for (a = 2; a <= 9; a++) {

			for (b = 1; b <= 9; b++) {

				c = a * b;
				System.out.print(b + " x " + a + " = " + c);
				if (c <= 9)
				{
					System.out.print("   ");
				}
				else 
				{
					System.out.print("  ");
				}
				
				
				

			}
			System.out.println(" ");
		}
		
		
	}

}


