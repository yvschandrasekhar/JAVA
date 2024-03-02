package com.comparator.pack;

import java.util.Comparator;

public class BrandComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Bikes b=(Bikes)o1;
		Bikes b1=(Bikes)o2;
		return ((b).Brand).compareTo((b1).Brand);
	}

}
