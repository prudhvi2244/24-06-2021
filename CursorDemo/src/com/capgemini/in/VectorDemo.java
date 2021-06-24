package com.capgemini.in;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(90);
		v.add(800);
		v.add(1000);
		
		System.out.println(v);
		
		Enumeration<Integer> enumeration=v.elements();
		System.out.println("Processing objects one by one from collection using Enumeration Cursor:");
		while(enumeration.hasMoreElements())
		{
			System.out.println(enumeration.nextElement());
		}
	}

}
