package com.comparator.pack;

import java.util.Comparator;

public class IdDesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((emp)o2).id-((emp)o1).id;
	}
	
}
