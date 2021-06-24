package com.capgemini.in;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=1;i<=5;i++)
		{
			al.add(i);
		}
		
		System.out.println(al);
		System.out.println("Processing Objects From ArrayList One By One using Iterator:");
		
		Iterator<Integer> iterator=al.iterator();
		
		while(iterator.hasNext())
		{
			Integer i1=iterator.next();
			if(i1==4)
			{
				iterator.remove();
			}
			System.out.println(i1);
		}
		
		System.out.println(al);
		

	}

}
