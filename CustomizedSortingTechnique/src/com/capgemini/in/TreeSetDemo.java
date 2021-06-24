package com.capgemini.in;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add("Prudhvi");
		ts.add("Praveen");
		ts.add("Prakash");
		
		System.out.println(ts);
		
		System.out.println(new Integer(10).compareTo(new Integer(11)));
		System.out.println(new Integer(10).compareTo(new Integer(1)));
		System.out.println(new Integer(11).compareTo(new Integer(11)));
		
		System.out.println("A".compareTo("B"));

	}

}
