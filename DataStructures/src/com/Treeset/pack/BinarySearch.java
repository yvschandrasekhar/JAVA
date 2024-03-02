package com.Treeset.pack;

public class BinarySearch
{
	Node root;
	int count=0;
	public void add(int k) {
		root=addNode(root,k);
		count++;
	}
	public Node addNode(Node n,int k)
	{
		if(n==null)
		{
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key) {
			n.left=addNode(n.left,k);
		}
		if(k>n.key) {
			n.right=addNode(n.right,k);
		}
		return n;
	}
}
