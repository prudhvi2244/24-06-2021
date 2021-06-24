package com.capgemini.in;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer>
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
		{
			return 0;
		}
		
	}
}

public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(11);
		ts1.add(12);
		ts1.add(5);
		ts1.add(2);

		System.out.println(ts1);
	}

}
