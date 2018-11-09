
public class bangcuuchuong {
	public static void main(String[] args) {
		System.out.println("Bang cuu chuong");
		System.out.println("--------------");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
				if (j == 9) {
					System.out.println("--------------");
				}
			}
		}
	}
}
