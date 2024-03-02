package com.Oops.java;
class student
{
	private String name;
	private int age;
	private int id;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	student(String name,int age,int id){
		this.name=name;
		this.age=age;
		this.id=id;
	}
}
public class DataEncapsulation {

	public static void main(String[] args) {
		student s=new student("roshan",20,1111);
		System.out.println(s.getname());
		System.out.println(s.getage());
		System.out.println(s.getid());
		System.out.println("---------------------------------------------------------------------");
		s.setname("Ronial");
		System.out.println(s.getname());
		System.out.println(s.getage());
		System.out.println(s.getid());
	}

}
