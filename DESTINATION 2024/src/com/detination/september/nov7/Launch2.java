package com.detination.september.nov7;
class Heart{
	float beats;
	float bp;
	public Heart(float beats, float bp) {
		super();
		this.beats = beats;
		this.bp = bp;
	}
	public float getBeats() {
		return beats;
	}
	public float getBp() {
		return bp;
	}
	
}
class Brain {
	double capacity;

	public Brain(double capacity) {
		super();
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}
	
}
class Book{
	int pages;
	String name;
	public Book(int pages, String name) {
		super();
		this.pages = pages;
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public String getNane() {
		return name;
	}
	
}
class Bike{
	String name;
	String color;
	public Bike(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	
}
class Student{
	Heart h =  new Heart(80.0f,12.5f);
	Brain b = new Brain(234.76);
	void hasBook(Book b1){
		System.out.println(b1.getPages());
		System.out.println(b1.getNane());
	}
	void hasBike(Bike b2) {
		System.out.println(b2.getName());
		System.out.println(b2.getColor());
	}
}
public class Launch2 {
public static void main(String[] args) {
	Bike b = new Bike("Hero","Black");
	Book bo = new Book(100,"NCRT");
	Student st = new Student();
	System.out.println(st.h.getBeats());
	System.out.println(st.h.getBp());
	System.out.println(st.b.getCapacity());
	st.hasBike(b);
	st.hasBook(bo);
}
}
