package com.bridgrlabz.JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaDemoProgram {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("My Name", "Atul");
		map.put("Actor", "John");
		map.put("State", "Odisa");
		map.put("actor", "Navin");
		
		Set<String> keys = map.keySet();
		
		for(String key : keys)
	{
		System.out.println(key + " " + map.get(key));
	}
}
}
