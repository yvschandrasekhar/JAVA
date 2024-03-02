package com.singleLinkedList01.pack;

public class Noode {
	Object ele;
	Noode next;
	Noode(Object e)
	{
		ele=e;
		next=null;
	}
	Noode(Object e,Noode n)
	{
		ele=e;
		next=n;
	}
}
