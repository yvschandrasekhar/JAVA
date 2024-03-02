package com.filehandling.pack;
import java.io.File;
import java.io.IOException;
public class Demo_01 {

	public static void main(String[] args)throws IOException{
		File f=new File("E:\\JAVA\\javatext");
		System.out.println(f.mkdir());
		//System.out.println(f.createNewFile());
	}

}
