package Lab6;


	public class checkTen extends Exception {
		private String msg;
		public checkTen(String msg) {
		
		this.msg = msg;
		}

		public String toString() {
		return "MyException "+msg;
		}

		static void kiemTraTen(String name) throws checkTen {
		if (name.equals("")) throw new checkTen ("Ten Rong");
		}
		}
	
