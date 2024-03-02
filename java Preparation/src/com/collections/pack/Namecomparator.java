package com.collections.pack;
import java.util.Comparator;
public class Namecomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return (((Student)o1).stuname).compareTo(((Student)o2).stuname);
	}
}
