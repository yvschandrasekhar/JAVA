package com.comparator.pack;

import java.util.Comparator;

public class Salcomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		emp e1=(emp)o1;
		emp e2=(emp)o2;
		if(e1.salary>e2.salary)return 1;
		if(e1.salary<e2.salary)return -1;
		return 0;
	}

}
