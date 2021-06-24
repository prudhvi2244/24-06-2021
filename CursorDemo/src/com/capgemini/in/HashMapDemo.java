package com.capgemini.in;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1,"Prudhvi");
		hm.put(2,"Praveen");
		hm.put(3,"Kiran");
		System.out.println(hm);
		
		Set s1=hm.keySet();
		Iterator<Integer> iterator=s1.iterator();
		System.out.println("Displaying Only Keys");
		while(iterator.hasNext())
		{
			Integer keys=iterator.next();
			System.out.println(keys);
		}
		
		System.out.println("Displaying Only Values");
		
		Collection<String> collection=hm.values();
		Iterator<String> i=collection.iterator();
		
		while(i.hasNext())
		{
			String s2=i.next();
			System.out.println(s2);
		}
		
		
		Set set=hm.entrySet();
		
		Iterator i1=set.iterator();
		
		while(i1.hasNext())
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	}

}
