package com.cg.demo.col;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(10 , "Sanket");
		map.put(11, "Sank");
		map.put(12, "San");
		
		System.out.println(map);
		
		Map<String ,String> map1 = new HashMap<>();
		map1.put("MH" , "Maharashtra");
		map1.put("KA", "Karnataka");
		map1.put("GA", "GOA");
		
		System.out.println(map1);
		
	}
}
