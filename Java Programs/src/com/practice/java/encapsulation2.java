package com.practice.java;
class Details
{
	private int id;
	private String name;
	private int age;
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	Details(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
	public class encapsulation2 {
		public static void main(String[] args) {
			Details s=new Details(101,"chandu",20);
			System.out.println(s.getid());
			System.out.println(s.getname());
			System.out.println(s.getage());
			System.out.println("______________________________");
			s.setname("yvscs");
			s.setage(22);
			s.setid(202);
			System.out.println(s.getid());
			System.out.println(s.getname());
			System.out.println(s.getage());
			
		}

	}

