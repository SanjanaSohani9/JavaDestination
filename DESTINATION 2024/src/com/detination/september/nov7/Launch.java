package com.detination.september.nov7;
class  Os{
	double version;
	String name;
	public Os(double version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public String getName() {
		return name;
	}
}
class Charger{
	String company;
	double volts;
	public Charger(String company, double volts) {
		super();
		this.company = company;
		this.volts = volts;
	}
	public String getCompany() {
		return company;
	}
	public double getVolts() {
		return volts;
	}
	
}
class Mobile{
	Os os = new Os(4.7,"Mars");
	void hasCharger(Charger ch) {
		System.out.println(ch.getCompany());
		System.out.println(ch.getVolts());
	}
}
public class Launch {
public static void main(String[] args) {
	Charger c = new Charger("Samsung",15);
	Mobile m = new Mobile();
	System.out.println(m.os.getName());
	System.out.println(m.os.getVersion());
	m.hasCharger(c);
	m=null;
 /*
  * System.out.println(m.os.getName());
	System.out.println(m.os.getVersion());
	m.hasCharger(c);
  */
	
	System.out.println(c.getCompany());
	System.out.println(c.getVolts());
}
}
