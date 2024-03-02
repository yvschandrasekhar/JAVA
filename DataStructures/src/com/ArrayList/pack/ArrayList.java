package com.ArrayList.pack;

public class ArrayList 
{
	Object[] a=new Object [5];
	int pos=0;
	public void add(Object e)
	{
		if(pos>=a.length)increase();
		a[pos]=e;
		pos++;
	}
	public void increase()
	{
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public int size()
	{
		return pos;
	}
	public void add(int index,Object e)
	{
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(pos>=a.length)increase();
		for(int i=size()-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		pos++;
	}
	public void remove(int index)
	{
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++)
		{
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
	}
	public void show()
	{
		for(Object e:a)
		{
			System.out.println(e);
		}
	}
}
