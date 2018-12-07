package Lab6;

public class checkTuoi extends Exception {
private String msg;
public checkTuoi(String msg) {
// TODO Auto-generated constructor stub
this.msg = msg;
}

public String toString() {
return "MyException "+msg;
}

static void kiemTraTuoi(int age) throws checkTuoi {
if (age >= 100 && age <=0) throw new checkTuoi("Tuoi khong phu hop");
}
}