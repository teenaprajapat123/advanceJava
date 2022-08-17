package COM.RAYS.marksheet;

import java.util.List;

public class MarksheetBean {

	private int id;
	private String fname;
	private String lname;
	private String Rollno;
	private int phy;
	private int che;
	private int mat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getRollno() {
		return Rollno;
	}
	public void setRollno(String i) {
		Rollno = i;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	
	}

}


