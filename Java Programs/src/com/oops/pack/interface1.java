package com.oops.pack;
interface fuels
{
	void cng();
	void diesel();
}
class Geep implements fuels
{
	public void cng()
	{
		System.out.println("car can run through cng");
	}
	public void diesel()
	{
		System.out.println("mostly diesel is used to run cars");
	}
}
class auto implements fuels
{
	public void cng()
	{
		System.out.println("Autos can run through cng");
	}
	public void diesel()
	{
		System.out.println("Diesel is used to run autos");
	}
}
public class interface1 {

	public static void main(String[] args) {
		fuels f=new Geep();
		f.cng();
		f.diesel();
		fuels f1=new auto();
		f1.cng();
		f1.diesel();
	}

}
