package com.comparator.pack;

import java.util.Comparator;

public class brand implements Comparator 
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (((car)o2).brand).compareTo(((car)o1).brand);
	}
}
