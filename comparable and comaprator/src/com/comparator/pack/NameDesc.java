package com.comparator.pack;

import java.util.Comparator;

public class NameDesc implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return (((emp)o2).name).compareTo(((emp)o1).name);
	}
}
