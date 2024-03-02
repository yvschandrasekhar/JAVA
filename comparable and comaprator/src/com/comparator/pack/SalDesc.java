package com.comparator.pack;

import java.util.Comparator;

public class SalDesc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return  (int) (((emp)o2).salary-((emp)o1).salary);
	}

}