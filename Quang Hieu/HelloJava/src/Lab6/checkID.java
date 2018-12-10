package Lab6;

public class checkID extends Exception {
private String msg;
public checkID(String msg) {

this.msg = msg;
}

public String toString() {
return "MyException "+msg;
}

static void kiemTraID(String id) throws checkID {
if (id.equals("") )throw new checkID("ID Rong");
}
}
