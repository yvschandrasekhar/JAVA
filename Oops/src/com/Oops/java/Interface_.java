package com.Oops.java;
interface contact
{
	void call();
	void msg();
}
interface capturing
{
	void photo();
	void video();
}
class poco implements contact,capturing
{

	@Override
	public void photo() {
		System.out.println("Poco is used capture photos");	
	}

	@Override
	public void video() {
		System.out.println("Poco is used capture videos");		
	}

	@Override
	public void call() {
		System.out.println("Poco is used make calls");		
	}

	@Override
	public void msg() {
		System.out.println("Poco is used to do messsages");		
	}
	
}
public class Interface_ {

	public static void main(String[] args) {
		contact co=new poco();
		co.call();
		co.msg();
		capturing ca=new poco();
		ca.photo();
		ca.video();
	}

}
