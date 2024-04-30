package in.springprogram.bean;

public class College {
private String collegeName;
private String city;
private int pinNo;
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public void setCity(String city) {
	this.city = city;
}
public void setPinNo(int pinNo) {
	this.pinNo = pinNo;
}

@Override
	public String toString() {
		
	return "-"+collegeName+","+city+","+pinNo;
	}
}
