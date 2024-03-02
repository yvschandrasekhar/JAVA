   package com.ArrayList.pack;

public class ArrayListt 
{
	Object[] a=new Object[5];
	int p=0;
	public void increase()
	{
		Object[]temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	public void add(Object o)
	{
		if(p>=a.length)increase();
		a[p]=o;
		p++;
	}
	public void add(int index,Object o)
	{
		if(p>=a.length)increase();
		for(int i=size()-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=o;
		p++;
	}
	public void remove(int index)
	{
		for(int i=index+1;i<=size()-1;i++)
		{
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
	}
	public int size()
	{
		return p;
	}
	public void show()
	{
		for(int i=0;i<size();i++)
		{
			System.out.println(a[i]);
		}
	}
}
