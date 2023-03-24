package com.tricky.basic;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapOperations {

	public static void main(String[] args) {
		//Map<Integer, String> map = new TreeMap<Integer, String>();
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "Sagar");
		map.put(1, "Sagar");
		map.put(2, "Mohanty");
		map.put(1, "Mohanty");
		map.put(5, "SagarMohanty");
//		map.put(null, "Mohanty");
//		map.put(1, null);
//		map.put(null, null);
//		map.put(null, "Sagar");
		for(Map.Entry m : map.entrySet() ) {
			System.out.println("Key: "+ m.getKey()+" : "+"Value: "+ m.getValue());
		}
	}

}
