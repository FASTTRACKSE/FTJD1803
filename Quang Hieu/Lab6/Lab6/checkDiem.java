package Lab6;

public class checkDiem extends Exception {
private String msg;
public checkDiem(String msg) {

this.msg = msg;
}

public String toString() {
return "MyException "+msg;
}

static void kiemTraDiem(float diem) throws checkDiem {
if (diem > 10) throw new checkDiem("Diem lon hon 10");
}
}