package com.capgemini.in;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList<String> l=new LinkedList<String>();

		l.add("Prudhvi");
		l.add("Rajeev");
		l.add("Raj");
		l.add("Praveen");
		
		System.out.println(l);
		
		System.out.println("Processing Objects one by one from LinkedList using ListIterator Cursor :"+l);
		
		ListIterator<String> li=l.listIterator();
		
		System.out.println("Processing From Top to Bottom");
		while(li.hasNext())
		{
			String s1=li.next();
			System.out.println(s1);
			if(s1.equals("Praveen"))
				li.remove();
			if(s1.equals("Prudhvi"))
				li.set("Raj Prudhvi");
			if(s1.equals("Raj"))
				li.add("Lynn");
		}
		
		System.out.println("Processing From Bottom to Top");
		while(li.hasPrevious())
		{
			String s1=li.previous();
			System.out.println(s1);
		}
		
		
	}

}
