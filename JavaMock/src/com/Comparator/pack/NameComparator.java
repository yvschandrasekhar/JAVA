package com.Comparator.pack;

import java.util.Comparator;

public class NameComparator implements Comparator<Object> {
	public int compare(Object o1,Object o2)
	{
		//return ((Student)o1).name.compareTo(((Student)o2).name);
		return ((Student)o1).age-((Student)o2).age;
	}
}
