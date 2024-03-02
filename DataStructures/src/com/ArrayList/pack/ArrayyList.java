package com.ArrayList.pack;

public class ArrayyList
{
	Object []a=new Object[5];
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
		for(int i=index+1;i<size();i++)
		{
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
	}
	public Object get(int index)
	{
		return a[index];
	}
	public void show()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
