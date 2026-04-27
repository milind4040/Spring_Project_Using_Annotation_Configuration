package cs.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Emp {
	@Value("101")
	private int eid;
	
	
	@Value("Milind")
	private String ename;
	
	@Value("7218484040")
	private String mob;
	
	@Value("40000")
	private int sal;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public void disp()
	{
		
		System.out.println("id   : "+eid);
		System.out.println("name : "+ename);
		System.out.println("mobile : "+mob);
		System.out.println("salary : "+sal);
		
			}
}
