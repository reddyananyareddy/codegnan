//25-10-2025
package com.codegnan.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodExample {

	public static void main(String[] args) {
		Map<String,Integer> studentMarks=new HashMap<>();
		
		//put(key,value) --> add entries to the map
		studentMarks.put("Arjun", 88);
		studentMarks.put("Ravi", 92);
		studentMarks.put("Sita", 79);
		studentMarks.put("Priya", 85);
		studentMarks.put("Rahul", 91);
		System.out.println(studentMarks);
		
		Map<String,Integer> newStudents=new HashMap<>();
		newStudents.put("Ananya", 95);
		newStudents.put("Vikram", 92);
		newStudents.put("Meera", 87);
		studentMarks.putAll(newStudents);
		System.out.println(studentMarks);
		
		//get(key)
		System.out.println("Marks of Arjun: "+studentMarks.get("Arjun"));
		//remove(key)
		System.out.println("Removed Priya's marks: "+studentMarks.remove("Priya"));
		//contains(key)
		System.out.println("Is Sita present?:  "+studentMarks.containsKey("Sita"));
		//containsValue
		System.out.println("Any student scored 100 marks?: "+studentMarks.containsValue(100));
		//isEmpty()
		System.out.println("Is map Empty?:  "+studentMarks.isEmpty());
		//size
		System.out.println("Total students:  "+studentMarks.size());
		//keySet()
		Set<String> studentNames=studentMarks.keySet();
		System.out.println("Student names: "+studentNames);
		//values()
		Collection<Integer> marks=studentMarks.values();
		System.out.println("Marks: "+marks);
		//entrySet: return all entries as a set of map.entry
		Set<Map.Entry<String,Integer>> entries=studentMarks.entrySet();
		System.out.println("All entries: ");
		for(Map.Entry<String, Integer> entry:entries) {
			System.out.println(entry.getKey()+"------->"+entry.getValue());
		}
		//clear
		studentMarks.clear();
		System.out.println("Is map empty?: "+studentMarks.isEmpty());

	}
}
