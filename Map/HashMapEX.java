package Map;

import java.util.*;
import java.util.Map.Entry;



public class HashMapEX {

	public static void main(String[] args) {
		
		Map<String,Integer> hmap=new HashMap<>();
		Map<String,Integer> hmap1=new HashMap<>();
		
		hmap.put("a",1);
		hmap.put("b", 2);
		hmap.put("c", 3);
		hmap.put("d", 4);
		hmap.put("e", 32);
		hmap.put("f", 22);
		
		hmap1.put("a1",11);
		hmap1.put("b1", 12);
		hmap1.put("c1", 13);
		hmap1.put("d1", 14);
		hmap1.put("e1", 312);
		hmap1.put("f1", 212);
		
		System.out.println(hmap);
		System.out.println();
		System.out.println(hmap.values());
		System.out.println();
	    System.out.println(hmap.keySet());
	    System.out.println();
	    System.out.println(hmap.entrySet());
	    System.out.println();
	    hmap.putAll(hmap1);
	    System.out.println(hmap);
	    System.out.println();
	    System.out.println("key is present "+hmap.containsKey("f"));
	    System.out.println();
	    System.out.println("value is present "+hmap1.containsValue(212));
	    System.out.println();
	    
	    
	    Set<Entry<String,Integer>>  entries=hmap.entrySet();
	    for(Entry<String,Integer> entry: entries) {
	    	entry.setValue(entry.getValue()*2);
	    }
	   System.out.println("New entry after operation "+entries);
	   System.out.println();
	   System.out.println(hmap);
	   System.out.println();
	   hmap.replaceAll((key, oldValue) -> oldValue + 2);
	   System.out.println("HashMap using replaceAll(): " + hmap);
	}

}
