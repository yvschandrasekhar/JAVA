package com.strings.pack;

public class ReplaceWordWithoutReplace2 {

	public static void main(String[] args) {
		String a="My Name is chandu";
		String b=" ";
		String [] s=a.split(" ");
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=="chandu") {
				b=b+"yvscs";
			}
			else {
				b=b+s[i];
			}
		}
	}

}
