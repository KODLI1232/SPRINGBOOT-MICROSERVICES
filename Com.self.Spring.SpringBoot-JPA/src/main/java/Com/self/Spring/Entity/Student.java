package Com.self.Spring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="student")   // Database table
public class Student {
	
	// define properties
	
	@Id
	@Column(name="sid")  // column name of DB
	private int sid;
	@Column(name="sname")  // column name of DB
	private String sname;
	@Column(name="sGpa")  // column name of DB
	private double sGpa;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int sid, String sname, double sGpa) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sGpa = sGpa;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getsGpa() {
		return sGpa;
	}
	public void setsGpa(double sGpa) {
		this.sGpa = sGpa;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sGpa=" + sGpa + "]";
	}

	
	
	
}
