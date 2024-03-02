package com.DataStructures.pack;

public class ArrayList {
	Object []a=new Object[5];
	int pos=0;
	public void add(Object o)
	{
		if(pos>=a.length)increase();
		a[pos]=o;
		pos++;
	}
	public void increase()
	{
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public void add(int index,Object o)
	{
		if(index<=-1||index>=size())
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i=size()-1;i>=index;i++) {
			a[i+1]=a[i];
		}
		a[index]=o;
		pos++;
	}
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++) {
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
	}
	public int size()
	{
		return pos;
	}
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[index];
	}
}
