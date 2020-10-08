package gov.dhs.gsa.app.models;

public class User {
	private String fname;
	private String lname;
	private String address;
	private String department;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", address=" + address + ", department=" + department
				+ "]";
	}
	
	
}
