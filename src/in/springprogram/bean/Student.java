package in.springprogram.bean;

public class Student {
private int rollNo;
private String name;
private College collg;
public void setId(int rollNo) {
	this.rollNo = rollNo;
}
public void setName(String name) {
	this.name = name;
}
public void setCollg(College collg) {
	this.collg = collg;
}
    public void demo()
    {
    	System.out.println("RollNo - " + rollNo);
    	System.out.println("Name - " + name);
    	System.out.println("College - " + collg);
    }

}
