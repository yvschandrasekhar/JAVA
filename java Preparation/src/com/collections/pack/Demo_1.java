package com.collections.pack;

import java.util.Arrays;

class Student implements Comparable<Object>{
    int studid;
	String stuname;
	String stuloc;
	int stumarks;
	static int id=1;
	Student(String sn , String sl , int sm){
		this.stuname=sn;
		this.stuloc=sl;
		this.stumarks=sm;
		studid=id++;
	}
//	@Override
//	public int compareTo(Object o) {
//		return stuname.compareTo(((Student)o).stuname);
//	}
	
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", stuname=" + stuname + ", stuloc=" + stuloc + ", stumarks=" + stumarks
				+ "]";
	}
//	@Override
//	public int compareTo(Object o) {
//		return stumarks - ((Student)o).stumarks;
//	}
//	@Override
//	public int compareTo(Object o) {
//		return stuloc.compareTo(((Student)o).stuloc);
//	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class Demo_1 {

	public static void main(String[] args) {
		Student[] stud = {new Student("bheem" , "Dolakhpur" , 100),
				          new Student("Tom" , "Disney" , 99),
				          new Student("Micky" , "Walt" , 90),
				          new Student("Nobitha" , "Japan" , 95),
				          new Student("Doremon" , "TimeMachine" , 97),
		};
		Arrays.sort(stud,new Namecomparator());
		for(Object k : stud) {
			System.out.println(k);
		}
	}

}
