package com.Treeset.pack;

public class Node {
	int key;
	Node left;
	Node right;
	Node(int k)
	{
		key=k;
	}
	Node(int k,Node l,Node r)
	{
		left=l;
		right=r;
	}
}
