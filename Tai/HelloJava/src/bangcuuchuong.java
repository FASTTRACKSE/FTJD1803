
public class bangcuuchuong {
	public static void main(String[] args) {
		System.out.println("Bang cuu chuong");
		System.out.println("--------------");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf(i + "X" + j + "=" + (i * j) + ("\t"));

			}
			System.out.println();
		}
	}
}
