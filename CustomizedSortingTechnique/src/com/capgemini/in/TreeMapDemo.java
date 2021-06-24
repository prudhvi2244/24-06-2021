package com.capgemini.in;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator1 implements Comparator<Integer>
{
	@Override
	public int compare(Integer obj1, Integer obj2) {
		if(obj1<obj2)
		{
			return 1;
		}
		else if(obj1>obj2)
		{
			return -1;
		}
		else
			return 0;
	}
}

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>(new MyComparator1());
		
		tm.put(3,"Raj");
		tm.put(4,"Ravi");
		tm.put(1,"Prudhvi");
		tm.put(2,"Praveen");
		
		
		
		System.out.println(tm);
	}

}
