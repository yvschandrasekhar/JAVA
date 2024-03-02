package com.Oops.pack;
class Student{
	private int roll;
	private String name;
	private String gender;
	public int getroll() {
		return roll;
	}
	public void setroll(int roll) {
		this.roll=roll;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.name=gender;
	}
	Student(int r,String n,String g){
		this.roll=r;
		this.name=n;
		this.gender=g;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Student st=new Student(100,"tyson","male");
		System.out.println(st.getroll());
		System.out.println(st.getname());
		System.out.println(st.getgender());
		System.out.println("------------------------");
		st.setname("smith");
		System.out.println(st.getroll());
		System.out.println(st.getname());
		System.out.println(st.getgender());
	}

}
